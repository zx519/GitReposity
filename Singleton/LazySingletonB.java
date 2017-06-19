/**
 * 懒汉单例模式
 *
 * 优点： 1.实现简单
 * 		2.延迟加载
 * 		3.线程安全
 * 缺点： 1. 代码较为复杂，有if判断语句，性能下降，效率很低
 *
 * 适用场景：少量使用单利模式
 */
public class LazySingletonB {  
	static int j = 0;
    private static LazySingletonB instance;  
    private LazySingletonB (){
    	j++;
    	System.out.println("LazySingletonB构造函数调用次数为"+j);
    }  
    
    public static synchronized LazySingletonB getInstance() {  //加锁，保证线程安全
    if (instance == null) {  
        instance = new LazySingletonB();  
    }  
    return instance;  
    }  
}  