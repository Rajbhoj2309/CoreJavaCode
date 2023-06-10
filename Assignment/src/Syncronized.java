
class DemoClass{
	private final static Object lock = new Object(); 
	public void demoMethod(){ 
		synchronized (lock) 
		{ 
			System.out.println("DemoClass lock Object");
		} 
	} 
}
//synchronized keyword can be used only with
//methods and code blocks. These methods or blocks 
//can be static or non-static both.
class Myclass{
//	public synchronized void myMethod(){ 
//		System.out.println("it is Synchronized method"); 
//		} 
	//////////////////////////////////
//	public void myMethod(){ 
//		synchronized (this) 
//		{ 
//			System.out.println("synchronized this");
//		} 
//	} 
	///////////////////////////////
	private final Object lock = new Object(); 
	public void myMethod(){ 
		synchronized (lock) 
		{ 
		System.out.println("other thread safe code"); 
		} 
	}
	///////////////////////////////////////
//	public synchronized static void myMethod(){System.out.println("synchronized static");} 
	//////////////////////////////////////
	public void demoMethod(){ 
		synchronized (DemoClass.class) 
		{ 
			System.out.println("In Myclass as demoMethod"); 
		} 
	} 

}
//multiple threads to enter in synchronized block 
//in any of all instances at runtime
//if you have 25 instances of MyClass,
//then only one thread will be able to execute myMethod 
//in any one of instance at a time and other 
//instances will be locked for other threads .
//This is usually done to make  staticdatathreadsafe.
public class Syncronized {
	public static void main(String[] args) {
		Myclass mc=new  Myclass();
		mc.demoMethod();mc.myMethod();
		DemoClass dc=new DemoClass();
		dc.demoMethod();
	}

}
