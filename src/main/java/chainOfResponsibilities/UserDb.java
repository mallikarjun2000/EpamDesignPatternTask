package chainOfResponsibilities;

import java.util.HashMap;

public class UserDb {
	protected HashMap<String,String> userDb;
	public UserDb(){
		userDb = new HashMap<String,String>();
		userDb.put("suresh","suresh123");
		userDb.put("rames","rames123");
		userDb.put("vamshi","vamshi123");
		userDb.put("xyz","xyz123");
	}
	public Boolean userExists(String user) {
		return userDb.containsKey(user);
	}
	public Boolean SignWithEmailAndPassword(String uname, String upass) {
		if( upass == (userDb.get(uname)))
			return true;
		
		return false;
	}
}
