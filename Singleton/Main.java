/**
 * ĳ�����н�����£�
 * LazySingletonA���캯�����ô���Ϊ6
 * LazySingletonA���캯�����ô���Ϊ8
 * LazySingletonA���캯�����ô���Ϊ7
 * LazySingletonA���캯�����ô���Ϊ7
 * LazySingletonA���캯�����ô���Ϊ6
 * LazySingletonA���캯�����ô���Ϊ6
 * LazySingletonA���캯�����ô���Ϊ7
 * LazySingletonA���캯�����ô���Ϊ7
 * LazySingletonA���캯�����ô���Ϊ7
 * LazySingletonB���캯�����ô���Ϊ1
 * DoubleLock���캯�����ô���Ϊ��1
 * EagerSingleton���캯�����ô���Ϊ1
 * StaticInnerClass���캯�����ô���Ϊ1
 * ö����Ĺ��캯��������
 * 
 * ���˵������������ģʽA�⣬����ģʽ�����̰߳�ȫ��
 * 
 */
public class Main {
	public static void main(String args[]) {
		//20���̲߳�����������ʵ��, ���ݹ��캯�������������۲��ǲ������ʵ�ֵ���
	       for(int i = 0; i < 20; i++) {
	           new Run().start();
	       }	 
	}		     
}
