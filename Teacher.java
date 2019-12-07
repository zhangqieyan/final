package xueshengxuanke;


public class Teacher extends People {
String kc;
String getKc() {
	return kc;
}
public Teacher(String id,String xm,String xb,String kc) {
this.id= id;
this.xm= xm;
this.xb= xb;
this.kc= kc;
}
public String toString() {
return "Teacher(老师信息):  姓名：" + xm
+ "    学号：" + id + "   性别：" + xb + "     所选课程：" + kc;
}



}

