import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class complex {

	public static void main(String[] args) {
		
		
		List<String> peoples = Stream.of("", "avz", "avp").collect(Collectors.toList());
		peoples.stream().filter(s->!s.isEmpty()).collect(Collectors.toList());
		
		System.out.println(peoples.toString());
		
		String name = peoples.stream().collect(Collectors.joining(", "));
		System.out.println(name);
		

		Person p1 = new Person ("Max" ,21);
		Person p2 = new Person ("Dan" ,31);
		Person p3 = new Person ("Andrew", 27);
		
		List<Person> pList = Stream.of(p1,p2,p3).collect(Collectors.toList()); 
		
		

	}
	
	
	

}

 class Person 
{
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	String name;
	int age;
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
}

