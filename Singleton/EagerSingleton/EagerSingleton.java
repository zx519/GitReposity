//����ʽ����ģʽ
class EagerSingleton {
	static int j = 0;
	private static final EagerSingleton instance = new EagerSingleton();
	private EagerSingleton(){
		j++;
		System.out.println(j);
	}//˽�й��캯��
	public static EagerSingleton getInstance(){
		return instance;	
	}
}