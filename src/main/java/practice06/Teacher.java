package practice06;

public class Teacher extends Person{
	private Integer klass;

	public Integer getKlass() {
		return klass;
	}

	public void setKlass(Integer klass) {
		this.klass = klass;
	}

	public Teacher(String name, Integer age,Integer klass) {
		super(name, age);
		this.klass= klass;
		// TODO Auto-generated constructor stub
	}
	public String introduce() {
		String res = super.introduce()+" I am a Teacher. I teach Class 2.";
		if(this.klass == null) {
			res = super.introduce()+" I am a Teacher. I teach No Class";
		}
		return res;
	}
}
