import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TesteLista {

	public static void main(String[] args) {
//		String[] nomes = new String[] {"Lucas","Miuxa", "Beatriz", "Leandro"};
//		
//		for(String name : nomes) {
//			System.out.println(name);
//		}
		
		List<String> listNames = new ArrayList<>();
		
		listNames.add("Lucas");
		listNames.add("Miuxa");
		listNames.add("Beatriz");
		listNames.add("Leandro");
		
		System.out.println(listNames.size());
		for(String name: listNames) {
			System.out.println(name);
		}
		System.out.println("------------------------");
		
		listNames.add(3, "Joao");
		for(String name: listNames) {
			System.out.println(name);
		}		
		System.out.println("------------------------");
		
		listNames.remove(3);
//		listNames.removeIf(x -> x.charAt(0) == 'L');
		for(String name: listNames) {
			System.out.println(name);
		}	
		System.out.println("------------------------");

		System.out.println("Index of Miuxa " + listNames.indexOf("Miuxa"));
		System.out.println("Index of Lucas " + listNames.indexOf("Lucas"));
		System.out.println("------------------------");
		
		List<String> nameL = listNames.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
		for(String name: nameL) {
		System.out.println(name);
		
		}	
		System.out.println("------------------------");

		String result = listNames.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		System.out.print(result);
		
	}

}
