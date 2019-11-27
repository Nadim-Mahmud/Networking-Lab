import java.io.*;
import java.net.*;

public class Server{
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(6665);
			Socket soc = server.accept();
			DataInputStream data = new DataInputStream(soc.getInputStream());
			
			String str = (String) data.readUTF();
			System.out.println("Messege : "+ str);
			
			data.close();
			server.close();
			soc.close();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}