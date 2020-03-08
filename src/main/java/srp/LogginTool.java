package srp;

import com.sun.tools.sjavac.Log;

public class LogginTool {
	private String message;
	LogginTool(String message)
	{
		this.message = message;
		System.out.println(message);
		//Log.warn(message);
	}
}
