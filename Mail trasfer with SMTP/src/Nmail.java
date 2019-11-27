////////////////// Not completed yet



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Nmail {

  public static void main(String args[]) throws Exception{
	  
	  Socket socket = new Socket("localhost",25);
	  PrintWriter pr = new PrintWriter(socket.getOutputStream(),true);
	  BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	  
	  pr.println("HELO " + "localhost");
	  System.out.println("Response1: " + br.readLine());
	  
	  pr.println("MAIL FROM:"+" abc@nadim.com");
	  System.out.println("Response2: " + br.readLine());
	  
	  pr.println("RCPT TO:"+" bcd@nadim.com");
	  System.out.println("Response3: " + br.readLine());

	  pr.println("DATA");
	  System.out.println("Response4: " + br.readLine());
	  
	  pr.println("Subject: MyMe");
	  pr.println();
	  pr.println("Hi!!!!");
	  pr.println("");
	  pr.println(".");
	  System.out.println("Response4: " + br.readLine());

  }
}