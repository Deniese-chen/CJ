import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowCJ extends JFrame implements ActionListener{
	 LuckyDraw draw;		//模型
	JTextField text1,text2,text3;	//视图
	JTextArea showArea;
	JButton jbu;	//控制器
	WindowCJ(){
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
	void init(){
	draw=new LuckyDraw();
	text1=new JTextField(5);
	text2=new JTextField(5);
	text3=new JTextField(5);
	showArea=new JTextArea();
	jbu=new JButton("START");
	JPanel pNorth=new JPanel();
	pNorth.add(new Label("奖项:"));
	pNorth.add(text1);
	pNorth.add(new Label("人数:"));
	pNorth.add(text2);
	pNorth.add(new Label("中奖号:"));
	pNorth.add(text3);
	JLabel jl1=new JLabel("0");
		text3.add(jl1);
		JLabel jl2=new JLabel("0");
		text3.add(jl2);
	jbu.addActionListener(dl);
	add(pNorth,BorderLayout.NORTH);
	add(new JScrollPane(showArea),BorderLayout.CENTER);
		}
	DrawListener dl=new DrawListener(jl1,jl2);
	pubic void actionPerformed(ActionEvent e){
	try{	double a=Double.parseDouble(text1.getText().trim());
		double b=Double.parseDouble(text2.getText().trim());
		double c=Double.parseDouble(text3.getText().trim());
		draw.setA(a);			//更新数据
		draw.setB(b);
		showArea.append("中奖名单如下:");
		showArea.append(area+"\n");	//更新视图
			}
	catch(Exception ex){
		showArea.append("\n"+ex+"\n");
					}
				}
			}

		
		
	
	
	
	