import java.util.HashMap;
import java.util.Map;

public class MapToListEjemplo3 {

	public static void main(String[] args) {
		
		Map<Integer, Ciudad> ciudades = new HashMap<Integer, Ciudad>();
		ciudades.put(1, new Ciudad("Madrid", "España"));
		ciudades.put(2, new Ciudad("Santander", "España"));
		ciudades.put(3, new Ciudad("Roma", "Italia"));
		ciudades.put(4, new Ciudad("Venecia", "Italia"));
		
		//ciudades.
		
	}

}

class Ciudad {
	private String ciudad;
	private String pais;
	
	public Ciudad(String ciudad, String pais) {
		this.ciudad = ciudad;
		this.pais = pais;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
