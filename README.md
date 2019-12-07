2018310741 计算机181 张志坤
# 一、实验目的
分析学生选课系统。使用GUI窗体及其组件设计窗体界面。完成学生选课过程业务逻辑编程。基于文件保存并读取数据。处理异常。
# 二、实验要求
### 1、
设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。
### 2、
基于事件模型对业务逻辑编程，实现在界面上支持上述操作。
### 3、
针对操作过程中可能会出现的各种异常，做异常处理
### 4、
基于输入/输出编程，支持学生、课程、教师等数据的读写操作。
### 5、
基于Github.com提交实验，包括实验SRC源文件夹程序、README.MD实验报告文档。
# 三、实验过程
建立新的类GUI，通过调用之前的Cs、Student和People的类进行对GUI的编辑。运用各种窗口组件，来建立可行的GUI窗口。首先建立各个不同的组件，给各个不同的组件进行赋值。再在容器中引用他们。最后在文本框中输出要输出的内容。新建课程文件来储存课程的信息，在用户选择课程后再从文件中提取相应的内容，在写到新建的另一个文件。开课将用户所输入的信息储存到文件中。
# 四、流程图
![text](https://github.com/zhangqieyan/final/blob/master/%E6%9C%AA%E5%91%BD%E5%90%8D%E6%96%87%E4%BB%B6(6).png);
# 五、核心代码注释
JLabel label1//定义标签
JButton button1//定义按钮
TextArea ta1//定义文本框
JTextField t1//定义输入文本框
CheckboxGroup cg//定义复选框
JCheckBox c1//定义选择项
label1=new JLabel("请输入个人信息和所选课程，完成后单击确定，退出请按取消 ");//给标签1赋值
setBounds(600,300,625,600);//设置窗口出现的位置和窗口的大小
c=getContentPane();	//获得JFrame的内容面板
c.setBackground(Color.green);//窗口的颜色
c.setLayout(new FlowLayout(FlowLayout.LEFT));//窗口布局方法
c.add(label1);//添加各种组件
button1.addActionListener(this);//监听器监听按钮
Cs p = null;
p =  new Cs("java","0921","3","001");//实例化
if(e.getSource()==button1)//如果按下第一个按钮
			ta1.append("姓名："+t1.getText()+"\n"+
			"学号："+t2.getText()+"\n"+"性别："
			+cg.getSelectedCheckbox().getLabel()+
			"\n");
			if(c1.isSelected() && e.getSource()==button1)
				ta1.append( "课程：" + c1.getLabel()+" "+p.toString()+"\n");
				students = new Student(t1.getText(),t2.getText(),cg.getSelectedCheckbox().getLabel(),p);
			if(c2.isSelected() && e.getSource()==button1)
				ta1.append( "课程：" + c2.getLabel()+" "+q.toString()+"\n");
				students = new Student(t1.getText(),t2.getText(),cg.getSelectedCheckbox().getLabel(),q);
			if(c3.isSelected() && e.getSource()==button1)
				ta1.append( "课程：" + c3.getLabel()+" "+r.toString()+"\n");
				students = new Student(t1.getText(),t2.getText(),cg.getSelectedCheckbox().getLabel(),r);
				if(c4.isSelected() && e.getSource()==button1)
					ta1.append( "课程：" + c4.getLabel()+" "+s.toString()+"\n");
					students = new Student(t1.getText(),t2.getText(),cg.getSelectedCheckbox().getLabel(),s);
				ta1.append("\n");//进行对各个输入框中的内容的获取
if(e.getSource()==button2){
					System.exit(0);
				}//如果按下第二个按钮就会退出。

if(e.getSource()==button3)
			ta2.append("教师姓名："+t3.getText()+"\n"+
			"课程："+t4.getText()+"\n"+"上课地点："+t6.getText()
			+"\n"+"\n"+"编号："+t9.getText()
			+"\n"+"学分："+t10.getText()+"\n");//获取输入框中的各种信息并在文本框中显示。
      File name1 = new File("D:\\课堂示例Demo程序" + File.separator + "课程.txt");//打开指定路径的指定文件
       FileInputStream in=new FileInputStream(name1);//文集输入流
       byte[] buffer=new byte[2048];//建立一个数组
       in.read(buffer);//把文件中的内容给数组
       in.close();//关闭
       FileWriter fw=new FileWriter("D:\\课堂示例Demo程序\\偷着走.txt");//打开文件
			 fw.write(st.toString());//写入内容
			 fw.close();关闭
 # 六、系统运行截图
 ![text](https://github.com/zhangqieyan/final/blob/master/1.png);
 ![text](https://github.com/zhangqieyan/final/blob/master/1.png);
 ![text](https://github.com/zhangqieyan/final/blob/master/3%20(2).png);
 ![text](https://github.com/zhangqieyan/final/blob/master/4.png);
 # 七、编程感想
 通过这次学习GUI的编写，将之前的实验内容联系起来，深入了解监听器的用法以及容器的作用和各个组件之间是怎么运用的。各个编程语言都是庞大的，只靠课上的那些是远远不够的还需要自己在网上不断地学习以及深化。学会对文件的处理进行写入读取等。熟练使用GitHub以及使用gui编程的排版。深刻强化自己对gui的了解以及写入读取文件。
