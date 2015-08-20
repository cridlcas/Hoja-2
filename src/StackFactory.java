
public class StackFactory {

	public Stack getStack(int opcion) 
	{
		if(opcion==1)
		{
			return new StackArrayList<Character>();
		}
		else
			return new StackVector<Character>();
	}

}
