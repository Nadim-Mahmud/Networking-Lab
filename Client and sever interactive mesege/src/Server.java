
import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(6666);
			Socket socket = server.accept();
			DataInputStream din = new DataInputStream(socket.getInputStream());
			DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str1="",str2="";
			
			while(!str1.equals("stop")) {
				str1 = din.readUTF();
				System.out.println("Client Says: " + str1);
				str2 = br.readLine();
				dout.writeUTF(str2);
				dout.flush();
			}
			
			din.close();
			dout.close();
			server.close();
			socket.close();
		}catch(Exception ex) {
			System.out.println(ex);
		}

	}

}
