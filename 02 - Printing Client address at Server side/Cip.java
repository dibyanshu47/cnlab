import java.util.*;
import java.io.*;
import java.net.*;
class Cip {
	public static void main(String args[]) throws Exception {
		InetAddress ip = InetAddress.getLocalHost();
		Socket s = new Socket(ip, 8020);
		PrintStream ps = new PrintStream(s.getOutputStream());
		ps.println(ip);
	}
}