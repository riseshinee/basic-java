package objectOriented;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("이름없음", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person getPerson() {
		return this;
	} //objectOriented.Person@36aa7bc2 인스턴스 주소가 출력됨
	
	
	public static void main(String[] args)
	{
		Person p = new Person();
		p.name = "James";
		p.age = 37;
		
		Person p2 = p.getPerson();
		System.out.println(p);
		System.out.println(p2);
	}
}
