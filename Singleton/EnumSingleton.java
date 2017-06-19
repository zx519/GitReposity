/**
 * 枚举类单例模式
 *
 * 优点： 1. 自由序列化（可以自由读取）
 *      2. 保证只有一个实例（即使使用反射机制也无法多次实例化一个枚举量）
 *      3. 线程安全
 *      4. 代码极其简单
 * 缺点： 1. java5后才可以使用枚举，多数人不熟悉
 *
 * 适用场景：java5及其以后版本才能使用
 */ 
public enum EnumSingleton {
	 INSTANCE;  
	 private EnumSingleton(){
		 System.out.println("枚举类的构造函数被调用");
	 }
 }
    