 package xueshengxuanke;

public class Cs {
String name;
String place;
String xuefen;
String id;
String getName() {
	return name;}
String getPlace() {
	return place;
}
String getXuefen() {
	return xuefen;
}
String getId() {
	return id;
}

public Cs(String name,String place,String xuefen,String id){
	this.name= name;
	this.place= place;
	this.xuefen= xuefen;
	this.id= id;
}


public String toString() {
	return "�γ�"+name+"�ص�"+place+"ѧ��"+xuefen+"���"+id;
}



}



