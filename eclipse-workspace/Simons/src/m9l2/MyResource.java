package m9l2;

import java.io.IOException;

public class MyResource implements AutoCloseable {
	
	@Override
	public void close() throws IOException
	{
		System.out.println("Closing resource");
		throw new IOException();
	}

	

}
