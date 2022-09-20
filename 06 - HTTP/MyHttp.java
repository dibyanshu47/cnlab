import java.util.*;
import java.io.*;
import java.net.*;
class MyHttp {
	public static void main(String args[]) throws Exception {
		URL url = new URL("https://www.facebook.com/");
		URLConnection conn = url.openConnection();
		conn.connect();
		InputStreamReader content = new InputStreamReader(conn.getInputStream());
		FileWriter f = new FileWriter("abc.html");
		for (int i = 0; i != -1; i = content.read()) {
			f.write((char)i);
		}
	}
}