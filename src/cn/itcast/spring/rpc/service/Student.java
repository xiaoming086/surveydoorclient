package cn.itcast.spring.rpc.service;

import java.io.Serializable;

/**
 * serialVersionUID:在于反序列化
 */
public class Student implements Serializable {
	private static final long serialVersionUID = -4475650817096311549L;
	private Integer id;
	private String name;
	private Integer age;
	
	private boolean married ;
	
	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
