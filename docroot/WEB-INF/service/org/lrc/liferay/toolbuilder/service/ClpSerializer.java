/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.lrc.liferay.toolbuilder.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import org.lrc.liferay.toolbuilder.model.CompositeStepDBEClp;
import org.lrc.liferay.toolbuilder.model.CompositeStepDefDBEClp;
import org.lrc.liferay.toolbuilder.model.InstalledStepClp;
import org.lrc.liferay.toolbuilder.model.StepDBEClp;
import org.lrc.liferay.toolbuilder.model.StepDefDBEClp;
import org.lrc.liferay.toolbuilder.model.ToolDefDBEClp;
import org.lrc.liferay.toolbuilder.model.ToolInstanceDBEClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fernando Suárez
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"tool-builder-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"tool-builder-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "tool-builder-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(CompositeStepDBEClp.class.getName())) {
			return translateInputCompositeStepDBE(oldModel);
		}

		if (oldModelClassName.equals(CompositeStepDefDBEClp.class.getName())) {
			return translateInputCompositeStepDefDBE(oldModel);
		}

		if (oldModelClassName.equals(InstalledStepClp.class.getName())) {
			return translateInputInstalledStep(oldModel);
		}

		if (oldModelClassName.equals(StepDBEClp.class.getName())) {
			return translateInputStepDBE(oldModel);
		}

		if (oldModelClassName.equals(StepDefDBEClp.class.getName())) {
			return translateInputStepDefDBE(oldModel);
		}

		if (oldModelClassName.equals(ToolDefDBEClp.class.getName())) {
			return translateInputToolDefDBE(oldModel);
		}

		if (oldModelClassName.equals(ToolInstanceDBEClp.class.getName())) {
			return translateInputToolInstanceDBE(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputCompositeStepDBE(BaseModel<?> oldModel) {
		CompositeStepDBEClp oldClpModel = (CompositeStepDBEClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCompositeStepDBERemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCompositeStepDefDBE(
		BaseModel<?> oldModel) {
		CompositeStepDefDBEClp oldClpModel = (CompositeStepDefDBEClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCompositeStepDefDBERemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputInstalledStep(BaseModel<?> oldModel) {
		InstalledStepClp oldClpModel = (InstalledStepClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getInstalledStepRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputStepDBE(BaseModel<?> oldModel) {
		StepDBEClp oldClpModel = (StepDBEClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getStepDBERemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputStepDefDBE(BaseModel<?> oldModel) {
		StepDefDBEClp oldClpModel = (StepDefDBEClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getStepDefDBERemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputToolDefDBE(BaseModel<?> oldModel) {
		ToolDefDBEClp oldClpModel = (ToolDefDBEClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getToolDefDBERemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputToolInstanceDBE(BaseModel<?> oldModel) {
		ToolInstanceDBEClp oldClpModel = (ToolInstanceDBEClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getToolInstanceDBERemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"org.lrc.liferay.toolbuilder.model.impl.CompositeStepDBEImpl")) {
			return translateOutputCompositeStepDBE(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.lrc.liferay.toolbuilder.model.impl.CompositeStepDefDBEImpl")) {
			return translateOutputCompositeStepDefDBE(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.lrc.liferay.toolbuilder.model.impl.InstalledStepImpl")) {
			return translateOutputInstalledStep(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.lrc.liferay.toolbuilder.model.impl.StepDBEImpl")) {
			return translateOutputStepDBE(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.lrc.liferay.toolbuilder.model.impl.StepDefDBEImpl")) {
			return translateOutputStepDefDBE(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.lrc.liferay.toolbuilder.model.impl.ToolDefDBEImpl")) {
			return translateOutputToolDefDBE(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"org.lrc.liferay.toolbuilder.model.impl.ToolInstanceDBEImpl")) {
			return translateOutputToolInstanceDBE(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals(
					"org.lrc.liferay.toolbuilder.InstanceNameException")) {
			return new org.lrc.liferay.toolbuilder.InstanceNameException();
		}

		if (className.equals(
					"org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException")) {
			return new org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException();
		}

		if (className.equals(
					"org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException")) {
			return new org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException();
		}

		if (className.equals(
					"org.lrc.liferay.toolbuilder.NoSuchInstalledStepException")) {
			return new org.lrc.liferay.toolbuilder.NoSuchInstalledStepException();
		}

		if (className.equals(
					"org.lrc.liferay.toolbuilder.NoSuchStepDBEException")) {
			return new org.lrc.liferay.toolbuilder.NoSuchStepDBEException();
		}

		if (className.equals(
					"org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException")) {
			return new org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException();
		}

		if (className.equals(
					"org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException")) {
			return new org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException();
		}

		if (className.equals(
					"org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException")) {
			return new org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException();
		}

		return throwable;
	}

	public static Object translateOutputCompositeStepDBE(BaseModel<?> oldModel) {
		CompositeStepDBEClp newModel = new CompositeStepDBEClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCompositeStepDBERemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCompositeStepDefDBE(
		BaseModel<?> oldModel) {
		CompositeStepDefDBEClp newModel = new CompositeStepDefDBEClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCompositeStepDefDBERemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputInstalledStep(BaseModel<?> oldModel) {
		InstalledStepClp newModel = new InstalledStepClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setInstalledStepRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputStepDBE(BaseModel<?> oldModel) {
		StepDBEClp newModel = new StepDBEClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setStepDBERemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputStepDefDBE(BaseModel<?> oldModel) {
		StepDefDBEClp newModel = new StepDefDBEClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setStepDefDBERemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputToolDefDBE(BaseModel<?> oldModel) {
		ToolDefDBEClp newModel = new ToolDefDBEClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setToolDefDBERemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputToolInstanceDBE(BaseModel<?> oldModel) {
		ToolInstanceDBEClp newModel = new ToolInstanceDBEClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setToolInstanceDBERemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}