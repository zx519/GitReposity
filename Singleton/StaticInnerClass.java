/**
 * ��̬�ڲ��൥��ģʽ
 *
 * �ŵ㣺 1.ʵ�ּ�
 * 		2.�̰߳�ȫ
 * ȱ�㣺 1. �������ʱ�㴴���˶����˷���Դ
 *
 * ���ó�����ʵ��ռ����Դ����
 */
public class StaticInnerClass {  
	static int j = 0;
    private static class SingletonHolder {  
    private static final StaticInnerClass INSTANCE = new StaticInnerClass();  
    }  
    private StaticInnerClass (){
    	j++;
    	System.out.println("StaticInnerClass���캯�����ô���Ϊ"+j);
    }  
    
    public static final StaticInnerClass getInstance() {  
    return SingletonHolder.INSTANCE;  
    }  
}  
