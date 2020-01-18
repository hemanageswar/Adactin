package pom;

public class ProjectObjectManager {

private Page1 p1;
private Page2 p2;
private Page3 p3;
private Page4 p4;
public Page1 getP1() {
	return (p1==null)?p1=new Page1():p1;
}
public Page2 getP2() {
	return (p2==null)?p2=new Page2():p2;
}
public Page3 getP3() {
	return (p3==null)?p3=new Page3():p3;
}
public Page4 getP4() {
	return (p4==null)?p4=new Page4():p4;
}
	
	
}
