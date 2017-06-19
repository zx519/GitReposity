/**
 * 懒汉单例模式
 *
 * 优点： 1.实现简单
 * 		2.延迟加载
 * 缺点： 1. 多线程下不适用，无法保证单例（线程不安全）
 *      
 * 适用场景：单线程
 */
public class LazySingletonA {  
	static int j = 0;
    private static LazySingletonA instance;  
    private LazySingletonA (){
    	j++;
    	System.out.println("LazySingletonA构造函数调用次数为"+j);
    }  
  
    public static LazySingletonA getInstance() {  
    if (instance == null) {  
        instance = new LazySingletonA();  
    }  
    return instance;  
    }  
} 