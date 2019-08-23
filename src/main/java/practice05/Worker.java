package practice05;


public class Worker extends Person{

	public Worker(String name, Integer age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public String introduce() {
		String res = super.introduce()+ " I am a Worker. I have a job.";
		return res;
	}
	
}
