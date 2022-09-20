import java.util.*;
import java.io.*;
import java.net.*;
class DateClient {
	public static void main(String args[]) throws Exception {
		Socket s = new Socket(InetAddress.getLocalHost(), 8020);
		DataInputStream dis = new DataInputStream(s.getInputStream());
		String date = dis.readLine();
		System.out.println("Time at Server: " + date);
	}
}