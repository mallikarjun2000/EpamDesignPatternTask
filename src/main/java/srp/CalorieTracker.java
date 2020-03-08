package srp;

public class CalorieTracker {
	private int calories;
	private int limit;
	
	public CalorieTracker(int calories){
		this.calories = calories;
		this.limit = 5600;
	}
	
	public void trackCalories(int calories) {
		this.calories += calories;
		if(calories > this.limit)
		{
			logCalories("limit exceeeded!");
		}
	}
	private void logCalories(String message) {
		new Logger(message);
	}
}
