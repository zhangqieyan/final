package xueshengxuanke;
import java.awt.*;
import java.io.*;
import xueshengxuanke.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;    
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;  
import xueshengxuanke.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class Gui extends JFrame implements
	ActionListener{ static Cs cs;
	Container c;
	JLabel label1;JLabel label2;JLabel label3;JLabel label4,label5;JLabel label6;
	JLabel label7;JLabel label8;JLabel label9;JLabel label10,label11;JLabel label12;JLabel label13;
	JButton button1,button2;
	JButton button3,button4;
	TextArea ta1,ta2;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	CheckboxGroup cg;
	JCheckBox c1,c2,c3,c4;
	public Gui(){
		super("ѧ��ѡ��");
		label1=new JLabel("�����������Ϣ����ѡ�γ̣���ɺ󵥻�ȷ�����˳��밴ȡ�� ");
		label7=new JLabel("�����뿪��Ŀγ̺���Ϣ����ɺ󵥻�ȷ�����˳��밴ȡ����");
		label2=new JLabel("ѧ��������");
		label8=new JLabel("��ʦ������");
		label3=new JLabel("�Ա�:"); 
		cg = new CheckboxGroup(); 
		label9=new JLabel("�γ����ƣ�");
		label6=new JLabel("ѧ�ţ�");
		 label5=new JLabel("�γ̣�");
		label11=new JLabel("�Ͽεص㣺");
		label12=new JLabel("��ţ�");
		label13=new JLabel("ѧ�֣�");
		c1=new JCheckBox("java");
		c2=new JCheckBox("����");
		c3=new JCheckBox("python");
		c4=new JCheckBox("��·");
		ta1=new TextArea(17,20);
		ta2=new TextArea(17,20);
		button1=new JButton("ȷ��");
		button2=new JButton("ȡ��");
		button3=new JButton("ȷ��");
		button4=new JButton("ȡ��");
		t1=new JTextField("",5);
		t2=new JTextField("",10);
		t3=new JTextField("",5);
		t4=new JTextField("",5);
		t5=new JTextField("",5);
		t6=new JTextField("",5);
		t7=new JTextField("",5);
		t8=new JTextField("",5);
		t9=new JTextField("",5);
		t10=new JTextField("",5);
		setBounds(600,300,625,600);
		try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e){}
		c=getContentPane();	
		c.setBackground(Color.green);
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		c.add(label1);
		c.add(new JLabel("                            "));
		c.add(label7);
		c.add(new JLabel("                                      "));
		c.add(label2);
		c.add(t1);
		c.add(label3);
		c.add(new Checkbox("��", cg, true)); 
		c.add(new Checkbox("Ů", cg, false));
		c.add(new JLabel("           "));
		c.add(label8);
		c.add(t3);
		c.add(new JLabel("                          "));
		c.add(label6);
		c.add(t2);
		c.add(new JLabel("                       "));
		c.add(label9);
		c.add(t4);
		c.add(new JLabel("   "));
		c.add(new JLabel("               "));
		c.add(new JLabel("                                              "));
		c.add(label11);
		c.add(t6);
		c.add(new JLabel("                         "));
		c.add(label5);c.add(c1);c.add(c2);c.add(c3);c.add(c4);
		c.add(new JLabel("     "));
		c.add(label12);
		c.add(t9);
		c.add(new JLabel("                                                 "));
		c.add(label13);
		c.add(t10);
		c.add(new JLabel("                           "));
		c.add(ta1);
		c.add(new JLabel("     "));
		c.add(ta2);
		c.add(new JLabel("                               "));
		c.add(button1);
		c.add(new JLabel(""));
        c.add(button2);
		c.add(new JLabel("               "));
		c.add(button3);
		c.add(new JLabel(""));
		c.add(button4);
		setVisible(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		Cs p = null;
		Cs q = null;
		Cs r = null;
		Cs s = null;
	    Student students = null;
	    Cs cs;
	    String str="";
	    
	   
	    try {
	    	File name1 = new File("D:\\����ʾ��Demo����" + File.separator + "�γ�.txt");
	    	 FileInputStream in=new FileInputStream(name1);
	    	 byte[] buffer=new byte[2048];
	    	 in.read(buffer);
	    	 in.close();
	    	 
	    	 str=new String(buffer);
	    	
	    } catch (IOException e1) {
	    	// TODO Auto-generated catch block
	    	e1.printStackTrace();
	    } 
	    String b[] = str.split(",");
    	p  = new Cs(b[0],b[1],b[2],b[3]);
    	q  = new Cs(b[4],b[5],b[6],b[7]);
    	r  = new Cs(b[8],b[9],b[10],b[11]);
    	s  = new Cs(b[12],b[13],b[14],b[15]);
	    
		if(e.getSource()==button1) //������µ�һ����ť
			{ta1.append("������"+t1.getText()+"\n"+
			"ѧ�ţ�"+t2.getText()+"\n"+"�Ա�"
			+cg.getSelectedCheckbox().getLabel()+
			"\n");
		byte[] se= new byte[4096];
		StringBuffer st= new StringBuffer();
			if(c1.isSelected() && e.getSource()==button1)
				{ta1.append( "�γ̣�" + c1.getLabel()+" "+p.toString()+"\n");
				students = new Student(t1.getText(),t2.getText(),cg.getSelectedCheckbox().getLabel(),p);
				StringBuffer s1=new StringBuffer();
				s1.append(students);
				s1.append(p);
				st.append(s1);
			}
			if(c2.isSelected() && e.getSource()==button1) {
				ta1.append( "�γ̣�" + c2.getLabel()+" "+q.toString()+"\n");
				students = new Student(t1.getText(),t2.getText(),cg.getSelectedCheckbox().getLabel(),q);
				StringBuffer s2=new StringBuffer();
				
				s2.append(q);
				st.append(s2);
			}
			if(c3.isSelected() && e.getSource()==button1) {
				ta1.append( "�γ̣�" + c3.getLabel()+" "+r.toString()+"\n");
				students = new Student(t1.getText(),t2.getText(),cg.getSelectedCheckbox().getLabel(),r);
				StringBuffer s3=new StringBuffer();
				
				s3.append(r);
				st.append(s3);
			}
				if(c4.isSelected() && e.getSource()==button1) {
					ta1.append( "�γ̣�" + c4.getLabel()+" "+s.toString()+"\n");
					students = new Student(t1.getText(),t2.getText(),cg.getSelectedCheckbox().getLabel(),s);
					StringBuffer s4=new StringBuffer();
					
					s4.append(s);
					st.append(s4);
					}	try {
						FileWriter fw=new FileWriter("D:\\����ʾ��Demo����\\͵����.txt");
						fw.write(st.toString());
						fw.close();
						} 
					catch (IOException n) 
						{
						n.printStackTrace();
						}}
				ta1.append("\n");
				if(e.getSource()==button2){
					System.exit(0);
				}
				if(e.getSource()==button4){
			System.exit(0);
		}
		if(e.getSource()==button3) {
			ta2.append("��ʦ������"+t3.getText()+"\n"+
			"�γ̣�"+t4.getText()+"\n"+"�Ͽεص㣺"+t6.getText()
			+"\n"+"\n"+"��ţ�"+t9.getText()
			+"\n"+"ѧ�֣�"+t10.getText()+"\n");
			StringBuffer t=new StringBuffer("��ʦ������"+t3.getText()+"\n"+
					"�γ̣�"+t4.getText()+"\n"+"�Ͽεص㣺"+t6.getText()
					+"\n"+"\n"+"��ţ�"+t9.getText()
					+"\n"+"ѧ�֣�"+t10.getText());
			try {
				FileWriter fw=new FileWriter("D:\\����ʾ��Demo����\\kc.txt");
				fw.write(t.toString());
				fw.close();
				} 
			catch (IOException n) 
				{
				n.printStackTrace();
				}
		
		
		}
		
			cs = new Cs(t4.getText(),t3.getText(),
					t6.getText(),t7.getText());
		



}
	


public static void main(String[] args){
	Gui d=new Gui();

}

}	