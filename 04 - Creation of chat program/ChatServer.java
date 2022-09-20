import java.util.*;
import java.io.*;
import java.net.*;
class ChatServer {
	public static void main(String args[]) throws Exception {
		ServerSocket ss = new ServerSocket(8020);
		Socket s = ss.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintStream out = new PrintStream(s.getOutputStream());
		String msg;
		while (true) {
			msg = in.readLine();
			if (msg.equals("END")) {
				out.println("BYE");
				break;
			}
			System.out.println("Client: " + msg);
			System.out.print("Server: ");
			msg = br.readLine();
			out.println(msg);
		}
	}
}