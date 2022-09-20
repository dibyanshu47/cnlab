import java.util.*;
import java.io.*;
import java.net.*;
class UdpServer {
	public static int client = 789;
	public static int server = 790;
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InetAddress ip = InetAddress.getLocalHost();
		DatagramSocket ds = new DatagramSocket(server);
		byte b[] = new byte[1024];
		System.out.println("Server... Sending...");
		while (true) {
			String s = br.readLine();
			b = s.getBytes();
			DatagramPacket dp = new DatagramPacket(b, s.length(), ip, client);
			ds.send(dp);
			if (s.equals("end"))	break;
		}
	}
}