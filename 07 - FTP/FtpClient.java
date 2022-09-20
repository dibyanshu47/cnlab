import java.util.*;
import java.io.*;
import java.net.*;
class FtpClient {
	public static void main(String args[]) throws Exception {
		Socket s = new Socket(InetAddress.getLocalHost(), 8020);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintStream ps = new PrintStream(s.getOutputStream());
		System.out.print("Enter the file name: ");
		String fname = in.readLine();
		ps.println(fname);
		try {
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			System.out.println("The connection has been reset");
		}
	}
}