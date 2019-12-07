package xueshengxuanke;

public class Student extends People{
	Cs cs;
	Cs a;
	
	
     public Student(String xm,String j8,String xb,Cs a) {
		this.id= j8;
		this.xm= xm;
		this.xb= xb;
		this.cs= a;
		}
     public String toString() {
		return "Student(学生信息):  姓名：" + xm
		+ "    学号：" + id + "   性别：" + xb ;
		}
    public void setXm(String xm) {
       this.xm= xm;
	
	
}
    


	public void setCd(Cs b) {
		cs = b;
		
	}
	
}
