/**
 * 饿汉单例模式
 *
 * 优点： 实现简单
 * 缺点： 1. 在类加载时便创建了对象，浪费资源
 *      2. 如果对象初始化依赖一些其它数据，很难保证其它数据在它初始化之前准备好
 *
 * 实现单例的理由：虚拟机能够保证类加载时线程同步
 * 适用场景：对象创建占用资源少，不依赖其余数据
 */
public class EagerSingleton {  
	static int j = 0;
    private static EagerSingleton instance = new EagerSingleton();  
    private EagerSingleton (){
		j++;
    	System.out.println("EagerSingleton构造函数调用次数为"+j);
    }
    
    public static EagerSingleton getInstance() {  
    return instance;  
    }  
} 