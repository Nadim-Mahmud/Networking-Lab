
import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost",6665);
			DataOutputStream data = new DataOutputStream(socket.getOutputStream());
			
			data.writeUTF("Hi !!!");
			
			data.flush();
			data.close();
			socket.close();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
