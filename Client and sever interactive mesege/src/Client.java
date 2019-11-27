import java.io.*;
import java.net.*;

public class Client {
	public static void main(String[] arg) {
		try {
			Socket socket = new Socket("localhost",6666);
			DataInputStream din = new DataInputStream(socket.getInputStream());
			DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str1="",str2="";
			
			while(!str1.equals("stop")) {
				str1 = br.readLine();
				dout.writeUTF(str1);
				dout.flush();
				str2 = din.readUTF();
				System.out.println("Server Says: "+ str2);
			}
			
			din.close();
			dout.close();
			socket.close();
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
