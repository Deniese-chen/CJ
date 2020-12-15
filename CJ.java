import java.io.*;
import java.util.*;
import java.lang.*;
public class CJ{
public static void main(String args[]){
	WindowCJ win=new WindowCJ();
	win.setTitle("抽奖");
	win.setBounds(100,100,420,260);
	File fRead=new File("抽奖参与名单.txt");
	File fWrite=new File("抽奖参与名单.txt");
	try{	writer out=new FileWriter(fWrite,true);
		BufferedWriter bufferWrite=new BufferedWriter(out);
		Read in=new FileReader(fRead);
		BufferedReader bufferRead=new BufferedReader(in);
		int []num ;
		while((num[]=rd.nextInt().bufferRead.readLine())){
		showArea.append(num[]);
		bufferWrite.write(num[]);
		bufferWrite.newLine();
					}
		bufferRead.close();
		bufferWrite.close();
			}
	catch(IOException e){
		System.out.println(e.toString());
				}
		
					}
			}