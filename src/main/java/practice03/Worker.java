package practice03;

public class Worker extends Person{

	public Worker(String name, Integer age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public String introduce() {
		String res = "I am a Worker. I have a job.";
		return res;
	}
	
}
