/**
 * 某次运行结果如下：
 * LazySingletonA构造函数调用次数为6
 * LazySingletonA构造函数调用次数为8
 * LazySingletonA构造函数调用次数为7
 * LazySingletonA构造函数调用次数为7
 * LazySingletonA构造函数调用次数为6
 * LazySingletonA构造函数调用次数为6
 * LazySingletonA构造函数调用次数为7
 * LazySingletonA构造函数调用次数为7
 * LazySingletonA构造函数调用次数为7
 * LazySingletonB构造函数调用次数为1
 * DoubleLock构造函数调用次数为：1
 * EagerSingleton构造函数调用次数为1
 * StaticInnerClass构造函数调用次数为1
 * 枚举类的构造函数被调用
 * 
 * 结果说明：出了懒汉模式A外，其他模式都是线程安全的
 * 
 */
public class Main {
	public static void main(String args[]) {
		//20个线程并发创建对象实例, 根据构造函数会输出情况，观察是不是真的实现单例
	       for(int i = 0; i < 20; i++) {
	           new Run().start();
	       }	 
	}		     
}
