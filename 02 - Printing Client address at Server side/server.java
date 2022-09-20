import java.util.*;
import java.io.*;
import java.net.*;
class server
{
public static void main(String args[])
{
ServerSocket ss;
Socket s;
DataInputStream dis;
try
{
ss = new ServerSocket(8020);
while(true)
{
s = ss.accept();
dis = new DataInputStream(s.getInputStream());
String ip = dis.readLine();
System.out.println("IP Address of the client system is: " + ip);
}
}
catch(IOException e)
{
System.out.println("The exception is: " + e);
}
}
}