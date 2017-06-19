/**
 * 双重锁校验单例模式
 *
 * 优点： 1.线程安全
 * 		2.延迟加载，节约资源
 * 缺点： 1.代码复杂
 *      2.两个if判断语句，性能下降很多 
 *      
 * 适用场景：少量使用单例模式情况下
 */
public class DoubleLock {
	static int j = 0;
    private volatile static DoubleLock singleton; //使用volatile变量禁止指令重排序，让DCL生效 
    private DoubleLock (){
    	j++;
    	System.out.println("DoubleLock构造函数调用次数为："+j);
    }  
    
    public static DoubleLock getInstance() {  
    if (singleton == null) {  
        synchronized (DoubleLock.class) {  
        if (singleton == null) {  
            singleton = new DoubleLock();  
        }  
        }  
    }  
    return singleton;  
    }  
}  
