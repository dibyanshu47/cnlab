import java.io.*;
import java.util.*;
class ping
{
public static void runSystemCommand(String Command)
{
try
{
Process p = Runtime.getRuntime().exec(Command);
BufferedReader InputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));
String s = "vvv";
while((s = InputStream.readLine()) != null)
{
System.out.println(s);
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
public static void main(String args[])
{
String ip = "localhost";
runSystemCommand("ping " + ip);
Date date = new Date();
System.out.println(date);
}
}