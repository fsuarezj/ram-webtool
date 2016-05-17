package org.lrc.liferay.toolbuilder.step;

public class InfoStep implements Step {
	static final String view = "infoStepView.xhtml";

	@Override
	public String draw() {
		return view;
	}

}
