package practice06;

public class Person {
	private String name;
	private Integer age;
	
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
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	public String introduce() {
		String res= "My name is Tom. I am 21 years old.";
		return res;
	}
}
