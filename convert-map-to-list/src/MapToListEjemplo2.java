import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToListEjemplo2 {

	public static void main(String[] args) {
		Map<Integer, String> ciudades = new HashMap<Integer, String>();
		ciudades.put(1, "Madrid");
		ciudades.put(2, "Santander");
		ciudades.put(3, "Roma");
		ciudades.put(4, "Venecia");
		
		List<String> listado = 
				ciudades.values().stream().collect(Collectors.toList());
		
		listado.forEach(System.out::println);
	}

}
