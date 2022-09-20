import java.util.*;
import java.io.*;
import java.net.*;
class server
{
public static void main(String args[]) throws Exception
{
ServerSocket ss = new ServerSocket(4000);
Socket s = ss.accept();
BufferedReader fileRead = new BufferedReader(new InputStreamReader(s.getInputStream()));
String fname = fileRead.readLine();
BufferedReader contentRead = new BufferedReader(new FileReader(fname));
PrintStream ps = new PrintStream(s.getOutputStream());
String str;
while((str = contentRead.readLine()) != null)
{
ps.println(str);
}
s.close();
ss.close();
ps.close();
fileRead.close();
contentRead.close();
}
}