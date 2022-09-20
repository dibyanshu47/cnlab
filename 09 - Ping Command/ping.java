import java.io.*;
import java.util.Date;
class Ping {
	public static void runSystemCommand(String command) {
		try {
			Process p = Runtime.getRuntime().exec(command);
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String args[]) {
		String ip = "localhost";
		runSystemCommand("ping " + ip);
		System.out.println(new Date());
	}
}