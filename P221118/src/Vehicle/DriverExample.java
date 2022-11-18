package Vehicle;

public class DriverExample {
	public static void main(String[] args) {
		Driver dv = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		dv.drive(bus);
		dv.drive(taxi);
		
	}

}
