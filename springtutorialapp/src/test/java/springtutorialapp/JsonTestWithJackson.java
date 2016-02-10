package springtutorialapp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.annotate.JsonRawValue;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

public class JsonTestWithJackson {
String jsonFilePath;
	@Before
	public void setUp() {
		jsonFilePath="Sample.json";
	}
	@Test
	public void test() {
		ObjectMapper objectMapper = new ObjectMapper();

		Map<String, Object> mapObject = new HashMap<String, Object>();

//		mapObject.put("domain", "JavaCodeGeeks.com");
//		mapObject.put("interest", "Java");
//
//		mapObject.put("Members", "400");
		PersonRawValue p = new PersonRawValue();
		mapObject.put("person", p);

//		List<Object> myList = new ArrayList<Object>();
//
//		myList.add("PPPPP");
//		myList.add("Jackssss");
//		myList.add("James");
//
//		mapObject.put("names", myList);

		try {
			
			objectMapper.writeValue(new File(jsonFilePath), mapObject);
			//System.out.println(jsonFilePath+"::::"+mapObject.containsKey("names"));

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public class PersonRawValue {

	@JsonRawValue
		public String   personId = "100";

	    public String address  = "$#";
	    
	}
	}


