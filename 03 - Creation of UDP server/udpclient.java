import java.util.*;
import java.io.*;
import java.net.*;
class UdpClient {
	public static int client = 789;
	public static void main(String args[]) throws Exception {
		DatagramSocket ds = new DatagramSocket(client);
		byte b[] = new byte[1024];
		System.out.println("Client... Receiving...");
		while (true) {
			DatagramPacket dp = new DatagramPacket(b, b.length);
			ds.receive(dp);
			String s = new String(dp.getData(), 0, dp.getLength());
			if (s.equals("end"))	break;
			System.out.println(s);
		}
	}
}