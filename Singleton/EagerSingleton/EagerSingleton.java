//饿汉式单例模式
class EagerSingleton {
	static int j = 0;
	private static final EagerSingleton instance = new EagerSingleton();
	private EagerSingleton(){
		j++;
		System.out.println(j);
	}//私有构造函数
	public static EagerSingleton getInstance(){
		return instance;	
	}
}