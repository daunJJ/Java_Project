// A speed control system
// 1. Make Exception classes
// SpeedOutOfBoundsException: Except when my speed exceeds the speed limit

public class SpeedOutOfBoundsException extends Exception
{
	public SpeedOutOfBoundsException() {
		super("Exceeded speed limit");
	}
} 