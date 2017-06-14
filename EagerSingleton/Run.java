public class Run extends Thread{
	public void run(){
		    EagerSingleton s=EagerSingleton.getInstance();
			System.out.println(Thread.currentThread().getName()+"..."+s);
	}
}
