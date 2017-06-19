/**
 * ˫����У�鵥��ģʽ
 *
 * �ŵ㣺 1.�̰߳�ȫ
 * 		2.�ӳټ��أ���Լ��Դ
 * ȱ�㣺 1.���븴��
 *      2.����if�ж���䣬�����½��ܶ� 
 *      
 * ���ó���������ʹ�õ���ģʽ�����
 */
public class DoubleLock {
	static int j = 0;
    private volatile static DoubleLock singleton; //ʹ��volatile������ָֹ����������DCL��Ч 
    private DoubleLock (){
    	j++;
    	System.out.println("DoubleLock���캯�����ô���Ϊ��"+j);
    }  
    
    public static DoubleLock getInstance() {  
    if (singleton == null) {  
        synchronized (DoubleLock.class) {  
        if (singleton == null) {  
            singleton = new DoubleLock();  
        }  
        }  
    }  
    return singleton;  
    }  
}  
