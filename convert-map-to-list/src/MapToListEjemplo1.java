import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToListEjemplo1 {

	public static void main(String[] args) {
		Map<Integer, String> ciudades = new HashMap<Integer, String>();
		ciudades.put(1, "Madrid");
		ciudades.put(2, "Santander");
		ciudades.put(3, "Roma");
		ciudades.put(4, "Venecia");
		
		List<Integer> keys = new ArrayList<Integer>(ciudades.keySet());
		List<String> values = new ArrayList<String>(ciudades.values());
		
		System.out.println("Listado de keys:");
		
		for(Integer i : keys) {
			System.out.println("-> " + i);
		}

		System.out.println("Listado de values usando forEach:");
		
		//values.forEach(System.out::println);
		values.stream().limit(2).forEach(value -> System.out.println(value));
		//values.forEach(value -> System.out.println(value));
	}

}
