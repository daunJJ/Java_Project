// A speed control system
// 1. Make Exception classes
// MalformedSpeed: Data formatting error if speed is less than 0

public class MalformedSpeed extends RuntimeException
{
	public MalformedSpeed() {
		super("The speed value is wrong");
	}
} 

