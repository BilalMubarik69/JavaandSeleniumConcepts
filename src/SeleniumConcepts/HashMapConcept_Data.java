package SeleniumConcepts;

//import java.util.HashMap;
import java.util.Hashtable;

public class HashMapConcept_Data {

	
	public static Hashtable<String, String> GetUserInfo(){
		
		Hashtable<String,String> userdata=new Hashtable<String,String>();
		
		userdata.put("customer", "naveenk_test@123");
		userdata.put("admin", "adminuser_test@123");
		
		return userdata;
	}





}
