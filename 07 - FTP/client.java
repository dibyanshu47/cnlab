import java.net.*;
import java.io.*;
import java.util.*;
class client
{
public static void main(String args[]) throws Exception
{
Socket s = new Socket(InetAddress.getLocalHost(), 4000);
System.out.println("Enter the file name");
BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
String fname = keyRead.readLine();
PrintStream ps = new PrintStream(s.getOutputStream());
ps.println(fname);
BufferedReader socketRead = new BufferedReader(new InputStreamReader(s.getInputStream()));
String str;
while((str = socketRead.readLine()) != null)
{
System.out.println(str);
}
ps.close();
socketRead.close();
keyRead.close();
}
}