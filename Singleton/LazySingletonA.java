/**
 * ��������ģʽ
 *
 * �ŵ㣺 1.ʵ�ּ�
 * 		2.�ӳټ���
 * ȱ�㣺 1. ���߳��²����ã��޷���֤�������̲߳���ȫ��
 *      
 * ���ó��������߳�
 */
public class LazySingletonA {  
	static int j = 0;
    private static LazySingletonA instance;  
    private LazySingletonA (){
    	j++;
    	System.out.println("LazySingletonA���캯�����ô���Ϊ"+j);
    }  
  
    public static LazySingletonA getInstance() {  
    if (instance == null) {  
        instance = new LazySingletonA();  
    }  
    return instance;  
    }  
} 