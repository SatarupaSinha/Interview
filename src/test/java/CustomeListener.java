import org.testng.ITestContext;
import org.testng.ITestListener;

public class CustomeListener implements ITestListener{
	public void onStart(ITestContext arg0)
	{
		System.out.println("OnTest-----------"+arg0.getName());
	}

}
