import java.io.*;
import java.util.*;
import java.net.*;
class server {
public static void main(String args[]) {
ServerSocket ss;
Socket s;
PrintStream ps;
try {
ss = new ServerSocket(8020);
while(true) {
//waiting for connection
s = ss.accept();
ps = new PrintStream(s.getOutputStream());
Date d = new Date();
ps.println(d);
ps.close();
}
}
catch(IOException e) {
System.out.println("The exception is: " + e);
}		
}
}