// A speed control system
// 3. Using try-and-catch for the methods that occurs Exception

public class Road
{
	public static void main(String[] args) throws MalformedSpeed, StopException, SpeedOutOfBoundsException
	{
		System.out.println("Hello! This is a road");

		Car jeong = new Car("Jeong Da Un");
		jeong.setSpeedLimit(50);
		try{
			jeong.mySpeed(100);
		}catch(SpeedOutOfBoundsException e1){
			e1.printStackTrace();
        }catch(StopException e2){
			e2.printStackTrace();
		}catch(MalformedSpeed e3){
			e3.printStackTrace();
		}finally{
			System.out.println("Drive safely!");
		}
	}
}
