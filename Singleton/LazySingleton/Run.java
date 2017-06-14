public class Run extends Thread{
	public void run(){
		    LazySingleton s=LazySingleton.getInstance();
			System.out.println(Thread.currentThread().getName()+"..."+s);
	}
}