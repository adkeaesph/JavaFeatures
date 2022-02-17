import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("a");
		strings.add("b");
		strings.add("a");
		strings.add("d");
		
		Stream<String> stream = strings.stream().filter(x -> x.contains("a"));
		Set<String> result = stream.collect(Collectors.toSet());
		System.out.println(result.size());
	}

}
