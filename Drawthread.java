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
			//线程一直在循环中
			if(bl==true){
				//bl=false时不执行以下代码（即文本框内容不被改变，显示一个值）
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