/**
 * ��������ģʽ
 *
 * �ŵ㣺 ʵ�ּ�
 * ȱ�㣺 1. �������ʱ�㴴���˶����˷���Դ
 *      2. ��������ʼ������һЩ�������ݣ����ѱ�֤��������������ʼ��֮ǰ׼����
 *
 * ʵ�ֵ��������ɣ�������ܹ���֤�����ʱ�߳�ͬ��
 * ���ó��������󴴽�ռ����Դ�٣���������������
 */
public class EagerSingleton {  
	static int j = 0;
    private static EagerSingleton instance = new EagerSingleton();  
    private EagerSingleton (){
		j++;
    	System.out.println("EagerSingleton���캯�����ô���Ϊ"+j);
    }
    
    public static EagerSingleton getInstance() {  
    return instance;  
    }  
} 