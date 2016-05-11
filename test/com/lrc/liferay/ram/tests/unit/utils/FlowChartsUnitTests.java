package com.lrc.liferay.ram.tests.unit.utils;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.lrc.liferay.ram.utils.flowcharts.tests.BasicFlowChartTests;
import com.lrc.liferay.ram.utils.flowcharts.tests.BasicNodeTests;
import com.lrc.liferay.ram.utils.flowcharts.tests.FlowTests;

@RunWith(Suite.class)
@SuiteClasses({ BasicFlowChartTests.class, BasicNodeTests.class,
		FlowTests.class })
public class FlowChartsUnitTests {

}
