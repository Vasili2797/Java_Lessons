
public class WeatherMachine_review {
	Thermometer_review thermometer_review;
	
	public WeatherMachine_review() {
		thermometer_review = new Thermometer_review();
	}
	
	private double[] getPastTemperatures() {
		double[] result = new double[24];
		for(int i=0;i<result.length;i++) {
			result[i] = thermometer_review.getTemperature();
		}
		
		return result;
	}
	
	public void getWeatherReport() {
		 System.out.println("Your last 24 hours:");
		 double[] temps = getPastTemperatures();

		 for(int i = 0; i < temps.length; i++) {
		 System.out.println(i + ":00 " + temps[i] + " degrees");
		 }
	}
}
