// A speed control system
// 1. Make Exception classes
// StopException: Except when a car is stationary

public class StopException extends Exception
{
	public StopException() {
		super("The car stops");
	}
} 
