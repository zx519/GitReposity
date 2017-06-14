//懒汉式单例模式
class LazySingleton{
	static int k = 0;
	//使用一个类变量来缓存曾今创建的实例
	private static LazySingleton instance = null;
	//对构造器使用private修饰，隐藏该类构造器
	private LazySingleton(){
		k++;
		System.out.println(k);
	}
		//提供一个静态方法，用于返回Singleton实例
		//该方法可以加入自定义控制，保证只产生一个Singleton对象
		public static LazySingleton getInstance(){
			//如果instance为null，则表达还不曾创建Singleton对象
			//如果instance不为null，则表明已经创建了Singleton对象
			//将不会重新创建新的实例
			//Singleton表示返回Singleton类型的返回值
			if(instance == null){
				synchronized(LazySingleton.class){
					if(instance == null){
						instance = new LazySingleton();//创建一个Singleton对象，并将其缓存起来	
					}
				}
			}
			return instance;
		}	
}