package tts;

public class Petclass {
	private String name;
	private int age;
	private String location;
	private String type;

	public Petclass() {
		
	}
	public Petclass(String a,int b,String c,String d) {
		name = a;
		age = b;
		location = c;
		type = d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
