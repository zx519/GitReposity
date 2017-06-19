
public class Run extends Thread{
	@Override
	 public void run() {
	        for(int i = 0; i < 10; i++) {
	        	LazySingletonA.getInstance();
	        	LazySingletonB.getInstance();
	        	DoubleLock.getInstance();
	        	EagerSingleton.getInstance();
	        	StaticInnerClass.getInstance();
	        	EnumSingleton s = EnumSingleton.INSTANCE;
	        }
	    }

}
