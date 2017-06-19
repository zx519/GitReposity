/**
 * ��������ģʽ
 *
 * �ŵ㣺 1.ʵ�ּ�
 * 		2.�ӳټ���
 * 		3.�̰߳�ȫ
 * ȱ�㣺 1. �����Ϊ���ӣ���if�ж���䣬�����½���Ч�ʺܵ�
 *
 * ���ó���������ʹ�õ���ģʽ
 */
public class LazySingletonB {  
	static int j = 0;
    private static LazySingletonB instance;  
    private LazySingletonB (){
    	j++;
    	System.out.println("LazySingletonB���캯�����ô���Ϊ"+j);
    }  
    
    public static synchronized LazySingletonB getInstance() {  //��������֤�̰߳�ȫ
    if (instance == null) {  
        instance = new LazySingletonB();  
    }  
    return instance;  
    }  
}  