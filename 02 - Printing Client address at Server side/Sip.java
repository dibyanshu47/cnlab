import java.util.*;
import java.io.*;
import java.net.*;
class Sip {
	public static void main(String args[]) throws Exception {
		ServerSocket ss = new ServerSocket(8020);
		while (true) {
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			System.out.println(dis.readLine());
		}
	}
}