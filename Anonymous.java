class Inner
{
	public void hello()
	{
		System.out.println("Hello ");
	}
}
class Java
{
	Inner i= new Inner()
	{
		public void hello()
		{
			System.out.println("Hello java");
		}
	};
}

public class Anonymous {
    public static void main (String[] args) {
    	Java java= new Java();
    	java.i.hello();
	}
}