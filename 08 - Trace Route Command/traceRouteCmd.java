import java.io.*;
class traceRouteCmd
{
public static void runSystemCommand(String command)
{
try
{
Process p = Runtime.getRuntime().exec(command);
BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));
String s = "";
while((s = inputStream.readLine()) != null)
	System.out.println(s);
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String args[])
{
// String ip = "www.google.co.in";
// String ip = "127.0.0.1";
String ip = "www.drranurekha.com";
runSystemCommand("tracert " + ip);
}
}