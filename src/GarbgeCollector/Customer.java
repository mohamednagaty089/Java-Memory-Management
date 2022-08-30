package GarbgeCollector;

public class Customer {
private String name;
private static int counter=0;

public Customer(String name) {
	this.name=name;
	counter++;
	
}

public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public Customer(Customer cust) {
	this.name=cust.name;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
public int getNumber() {
	return counter;
}
protected void finalize() throws Throwable{
 
	System.out.println(" the object is destroyed ");
}
}
