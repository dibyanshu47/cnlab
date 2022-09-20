import java.util.*;
import java.io.*;
import java.net.*;
class ChatClient {
	public static void main(String args[]) throws Exception {
		Socket s = new Socket(InetAddress.getLocalHost(), 8020);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintStream out = new PrintStream(s.getOutputStream());
		String msg;
		while (true) {
			System.out.print("Client: ");
			msg = br.readLine();
			out.println(msg);
			msg = in.readLine();
			System.out.println("Server: " + msg);
			if (msg.equals("BYE"))	break;
		}
	}
}