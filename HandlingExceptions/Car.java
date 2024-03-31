// A speed control system
// 2. Define methods that occurs Exception

public class Car
{
	//Create Variables
	int speedLimit;
	String name;

	//Create Member Variables
	public Car(String name) {
		this.name = name;
	}

	// setSpeedLimit: To set the speed limit.
	// Exception handling if the speed limit is less than or equal to zero.
	public void setSpeedLimit(int speed) throws StopException, MalformedSpeed {
		if (speed == 0){
			throw new StopException();
		}
		else if (speed < 0){
			throw new MalformedSpeed();
		}
		else {
			System.out.println("The speed limit is "+ speed);
		}
		speedLimit = speed;
	}

	// mySpeed: Enter the speed of my car and make sure the speed is within the speed limit.
	// Exception handling if the speed is less than or equal to zero.
	// Exception handling if my speed is greater than the speed limit
	public void  mySpeed(int speed) throws MalformedSpeed, StopException, SpeedOutOfBoundsException{
		System.out.println("My speed is "+speed);
		if (speed == 0){
			throw new StopException();
		}
		else if (speed < 0){
			throw new MalformedSpeed();
		}
		if (speed > speedLimit) {
			throw new SpeedOutOfBoundsException();
		}
		else {
			System.out.println("You are keeping the speed limit well");
		}

	}
}  