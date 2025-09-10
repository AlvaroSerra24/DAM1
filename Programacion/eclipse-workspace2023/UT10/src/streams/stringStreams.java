package streams;

import java.util.Arrays;
import java.util.List;

public class stringStreams {
	public static void main(String[] args) {
		List<String>nombres=Arrays.asList("Juan","Ana","Carmen","Diego");
		
		nombres.forEach(System.out::println);
		nombres.forEach(n->System.out.println(n));
		
		//nombres que empiezan por A
		nombres.stream().filter(n->n.startsWith("A")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		nombres.stream().sorted().forEach(n->System.out.println(n));
		
		List<String>nueva=nombres.stream().filter(n->n.endsWith("a") || n.endsWith("o")).toList();
		System.out.println(nueva);
	}
}
