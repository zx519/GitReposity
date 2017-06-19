/**
 * 静态内部类单例模式
 *
 * 优点： 1.实现简单
 * 		2.线程安全
 * 缺点： 1. 在类加载时便创建了对象，浪费资源
 *
 * 适用场景：实例占用资源较少
 */
public class StaticInnerClass {  
	static int j = 0;
    private static class SingletonHolder {  
    private static final StaticInnerClass INSTANCE = new StaticInnerClass();  
    }  
    private StaticInnerClass (){
    	j++;
    	System.out.println("StaticInnerClass构造函数调用次数为"+j);
    }  
    
    public static final StaticInnerClass getInstance() {  
    return SingletonHolder.INSTANCE;  
    }  
}  
