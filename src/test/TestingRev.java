package test;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;


/**
 * @author A1072732
 *
 */
public class TestingRev {
	public static void main(String args[]) {
		ObjectMapper mapper = new ObjectMapper();
		/**
		 * 
		 */
		try {
			File jsonFile = new File("map.json");
			Map<String, Object> mapObject = mapper.readValue(jsonFile, new TypeReference<Map<String, Object>>() {
			});
			System.out.println("name : " + mapObject.get("name"));
			System.out.println("city : " + mapObject.get("city"));
			System.out.println("mobile : " + mapObject.get("mobile"));
			System.out.print("friends : ");
			List<String> list = (List<String>) mapObject.get("friends");
			for (String name : list) {
				System.out.print(name + " ");
			}
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
