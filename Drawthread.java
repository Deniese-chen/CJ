import java.util.Random;
import javax.swing.JLabel;
 
public class Drawthread extends Thread{
	private JLabel jl1,jl2;
	private Random rd=new Random();
	int[]num=new int[b];
	public volatile Boolean bl=false;
	
	public Drawthread(JLabel jl1,JLabel jl2){
		this.jl1=jl1;
		this.jl2=jl2;
	}
	public void run(){
		while(true){
			//�߳�һֱ��ѭ����
			if(bl==true){
				//bl=falseʱ��ִ�����´��루���ı������ݲ����ı䣬��ʾһ��ֵ��
		        int x1=rd.nextInt(10);
		        jl1.setText(x1+"");
		        int x2=rd.nextInt(10);
		        jl2.setText(x2+"");	
			}			 
		}
	for(int i=0;i<b.length;i++)
	{
	num[i]=rd.nextInt();
	}   
}