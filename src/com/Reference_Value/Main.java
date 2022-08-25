package com.Reference_Value;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main=new Main();
		main.start();
		//output A Z B 

	}
public void start() {
	String last="Z";
	Container container=new Container();
	container.setInitial("C");
	another(container,last);
	System.out.println(container.getInitial());
	
}
public class Container{
	private String initial="A";
	public String getInitial() {
		return initial;
	}
	public void setInitial(String initial) {
		this.initial=initial;
	}
}
public void another(Container initialHolder,String newInitial) {
	newInitial.toLowerCase();
	initialHolder.setInitial("B");
	Container initial2=new Container();
	initialHolder=initial2;
	System.out.println(initialHolder.getInitial());//A
	System.out.println(newInitial);//Z so newInitial not newInitial.toLowerCase();
}
}
