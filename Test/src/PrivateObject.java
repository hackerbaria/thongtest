import java.lang.reflect.Field;

/**
 * 
 */

/**
 * @author ThongNV2
 *
 */
public class PrivateObject  {
	//Duong comment pro
	private String privateString = null;

	public PrivateObject(String privateString) {
		this.privateString = privateString;
	}
	  
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, SecurityException, NoSuchFieldException {
		PrivateObject privateObject = new PrivateObject("The Private Value");

		Field privateStringField = PrivateObject.class.
		            getDeclaredField("privateString");

		privateStringField.setAccessible(true);

		String fieldValue = (String) privateStringField.get(privateObject);
		System.out.println("fieldValue = " + fieldValue);
		
		//Duong comment
	}

}
