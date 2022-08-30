package GarbgeCollector;

public class Main {

	public static void main(String[] args) {
		for(String el:args) {
			System.out.println("variable"+el);
		}
		// TODO Auto-generated method stub
		Runtime runtime=Runtime.getRuntime();
        long freememory=runtime.freeMemory();
        System.out.println("Free Memory"+(freememory/(1024)));
         Customer cust = null;
        for(int i=0;i<100;i++) {
        	
        	Customer customer=new Customer("mohamed"+i);
        	cust=customer;
        	String name="msnsnsns";
        	name+="msms";
        }
        
        
        long availablmemory=runtime.freeMemory();
        System.out.println(availablmemory/1024);
        System.gc();
        System.out.println(cust.getNumber());
        long available=runtime.freeMemory();
        System.out.println(available);
		}

	}


