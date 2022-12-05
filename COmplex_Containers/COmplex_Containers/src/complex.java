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

	}

}
