package se.joeladonai.userapi.secure;

public class ExpirationTimeHelper {
	
	public static final String exTimeGenerate() {
		return new Long(System.currentTimeMillis()+600*1000).toString();
	}

}
