package cn.itcast.spring.rpc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.surveypark.domain.statistics.QuestionStatisticsModel;
import cn.itcast.surveypark.service.StatisticsService;

public class App {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("client.xml");
		StatisticsService ss = (StatisticsService) ac.getBean("ssClient");
		QuestionStatisticsModel qsm = ss.statistics(15);
		System.out.println(qsm.getCount());
	}
}
