import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowCJ extends JFrame implements ActionListener{
	 LuckyDraw draw;		//ģ��
	JTextField text1,text2,text3;	//��ͼ
	JTextArea showArea;
	JButton jbu;	//������
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
	pNorth.add(new Label("����:"));
	pNorth.add(text1);
	pNorth.add(new Label("����:"));
	pNorth.add(text2);
	pNorth.add(new Label("�н���:"));
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
		draw.setA(a);			//��������
		draw.setB(b);
		showArea.append("�н���������:");
		showArea.append(area+"\n");	//������ͼ
			}
	catch(Exception ex){
		showArea.append("\n"+ex+"\n");
					}
				}
			}

		
		
	
	
	
	