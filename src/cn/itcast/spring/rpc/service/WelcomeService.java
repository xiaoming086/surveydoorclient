package cn.itcast.spring.rpc.service;

import java.util.List;

/**
 * ҵ��ӿ�
 */
public interface WelcomeService {
	public void sayHello(String name);
	public int getLength(String name);
	public List<Student> getStudents(int n); 
}
