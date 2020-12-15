import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
 
public class DrawListener implements ActionListener{
	private JLabel jl1,jl2;
	private Drawthread dt;
 
    //构造方法传参，启动抽奖线程
	public Drawlistener(JLabel jl1,JLabel jl2){
	    this.jl1=jl1;
	    this.jl2=jl2;
	    dt=new  Drawthread(jl1,jl2);
        dt.start();
    }
	//按钮点击来控制线程暂停与否（bl=true则继续随机数，bl=false则暂停跳动，显示值）
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("START")){
			JButton jbu=(JButton)e.getSource();
			jbu.setText("Stop");
			dt.bl=true;
		}
		else{
			JButton jbu=(JButton)e.getSource();
			jbu.setText("START");
			dt.bl=false;
		}	
		
	}
}