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
return "Teacher(��ʦ��Ϣ):  ������" + xm
+ "    ѧ�ţ�" + id + "   �Ա�" + xb + "     ��ѡ�γ̣�" + kc;
}



}

