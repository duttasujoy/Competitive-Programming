package testpkg.p2;
public class MyClass extends Thread {
public static void main(String[] args) {
//MyClass thread = new MyClass();
//thread.start();
//System.out.println("This code is outside of the thread");
	String sb1 = new String("Hellow");
	String sb2 = new String("Hellow");
	System.out.println(sb1.equals(sb2));
//	System.out.println(sb1.equals(sb2));
}
public void run() {
System.out.println("This code is running in a thread");
}
}