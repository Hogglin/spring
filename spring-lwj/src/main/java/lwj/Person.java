package lwj;

import org.springframework.stereotype.Component;

@Component
public class Person {

	static {
		System.out.println("person");
	}

	private String age = "10";

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
