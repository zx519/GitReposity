//����ʽ����ģʽ
class LazySingleton{
	static int k = 0;
	//ʹ��һ����������������񴴽���ʵ��
	private static LazySingleton instance = null;
	//�Թ�����ʹ��private���Σ����ظ��๹����
	private LazySingleton(){
		k++;
		System.out.println(k);
	}
		//�ṩһ����̬���������ڷ���Singletonʵ��
		//�÷������Լ����Զ�����ƣ���ֻ֤����һ��Singleton����
		public static LazySingleton getInstance(){
			//���instanceΪnull�����ﻹ��������Singleton����
			//���instance��Ϊnull��������Ѿ�������Singleton����
			//���������´����µ�ʵ��
			//Singleton��ʾ����Singleton���͵ķ���ֵ
			if(instance == null){
				synchronized(LazySingleton.class){
					if(instance == null){
						instance = new LazySingleton();//����һ��Singleton���󣬲����仺������	
					}
				}
			}
			return instance;
		}	
}