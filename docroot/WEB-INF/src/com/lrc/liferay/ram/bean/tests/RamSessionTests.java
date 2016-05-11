package com.lrc.liferay.ram.bean.tests;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.lrc.liferay.ram.bean.RamSession;
import com.lrc.liferay.ram.model.Assessment;
import com.lrc.liferay.ram.service.AssessmentLocalServiceUtil;

@PrepareForTest({AssessmentLocalServiceUtil.class})
@RunWith(PowerMockRunner.class)
public class RamSessionTests {
	private RamSession ramSession = new RamSession();

	@Test
	public void test() {
		List<Assessment> aux = ramSession.getAssessments();
	}

}
