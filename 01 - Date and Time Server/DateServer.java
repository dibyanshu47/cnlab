import java.util.*;
import java.io.*;
import java.net.*;
class DateServer {
	public static void main(String args[]) throws Exception {
		ServerSocket ss = new ServerSocket(8020);
		while (true) {
			Socket s = ss.accept();
			Date d = new Date();
			PrintStream ps = new PrintStream(s.getOutputStream());
			ps.println(d);
		}
	}
}