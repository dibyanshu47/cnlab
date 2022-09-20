import java.util.*;
import java.io.*;
import java.net.*;
class FtpServer {
	public static void main(String args[]) throws Exception {
		ServerSocket ss = new ServerSocket(8020);
		Socket s = ss.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintStream ps = new PrintStream(s.getOutputStream());
		String fname = br.readLine();
		File f = new File(fname);
		String contents = "";
		if (f.isFile() && f.canRead()) {
			BufferedReader fileRead = new BufferedReader(new FileReader(fname));
			String str;
			while ((str = fileRead.readLine()) != null) {
				contents += str + "\n";
			}
		} else {
			contents = "ERROR IN INPUT FILE!";
		}
		System.out.println("Sending the file to the client...");
		ps.println(contents);
	}
}