class daemon extends Thread
{
public daemon(String name)
{
super(name);
}
public void run()
{
if(Thread.currentThread().isDaemon())
System.out.println(getName() + " is daemon thread");
else
System.out.println(getName() + " is user thread");
}
public static void main(String args[])
{
daemon t1 = new daemon("t1");
daemon t2 = new daemon("t2");
daemon t3 = new daemon("t3");
t1.setDaemon(true);
t1.start();
t2.start();
t3.setDaemon(true);
t3.start();
}
}
