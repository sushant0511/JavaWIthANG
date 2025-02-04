class Test1
{
	public void call() {
		
		System.out.println("Call");
	}
}

abstract class Test 
{
	public abstract void show();
}

public class TestterAbs {

	public static void main(String[] args) {
		
		Test1 test1=new Test1();
		test1.call();
		
	}
	
}
