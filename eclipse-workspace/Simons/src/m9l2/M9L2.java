package m9l2;

import java.io.IOException;
import java.net.SocketException;
import java.io.EOFException;
import java.io.FileNotFoundException;

public class M9L2 {
	
	public static void brokenTwo() {
		System.out.println("Starting");
		try (MyResource r = new MyResource();) {
			System.out.println("in try");
		}
		
		catch (IOException ioe) {
			System.out.println("close failure?");
		}
		finally {
			System.out.println("Explicit Finally");
		}
	}
	
//     public static void brokenTwo() throws IOException {
//		System.out.println("Starting");
//		boolean success = false;
//		int retriesLeft = 2;
//		while (!success) {
//			try {
//				System.out.println("In try");
//				if (Math.random() > 0.5) {
//					System.out.println("Throwing FileNotFoundException");
//					throw new FileNotFoundException();
//				}
//				success = true;
//				System.out.println("Survived two");
//			} catch (FileNotFoundException fnfe) {
//				System.out.println("In catch for FileNotFoundException");
//				if (0 == retriesLeft--) {
//					System.out.println("Too many retries, giving up");
//					throw new IOException ("Too many retries", fnfe);
//				}
//				
//			} finally {
//				System.out.println("In Finally");
//			}
//		} System.out.println("Method completing");
//	} 
//	
		
	public static void brokenOne(int mode) throws SocketException {
		System.out.println("Starting");
		try {
			System.out.println("In Try");
			if (mode == 1) {
				System.out.println("Throwing EOFexception");
				throw new EOFException();
			}
			System.out.println("Survived one");
			if (mode == 2) {
				System.out.println("Throwing FileNotFoundException");
				throw new FileNotFoundException();
			}
			System.out.println("Survived two");
			
			if (mode == 3) {
				System.out.println("Throwing SocketException");
				throw new SocketException();
			}
			
		}
		catch (EOFException eofe) {
			System.out.println("In catch for EOFexception");
		}
		catch (FileNotFoundException fnfe) {
			System.out.println("In catch for FileNotFoundException");
		}
		finally {
			System.out.println("In Finally");
		}
		System.out.println("Method completing");
	}
	
	public static void main(String[] args) {
		try {
			brokenOne(3);
		} catch (SocketException e) {
			System.out.println("Oops, that broke");
		}
		
	}

}
