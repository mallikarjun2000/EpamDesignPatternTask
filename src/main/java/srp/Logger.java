package srp;

import com.sun.tools.sjavac.Log;

public class Logger {
	private String message;
	Logger(String message)
	{
		this.message = message;
		Log.warn(message);
	}
}
