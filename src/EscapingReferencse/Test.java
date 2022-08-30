package EscapingReferencse;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import GarbgeCollector.Customer;

public class Test {

	public static void main(String arg[]) {
//		Book book=new Book("mmnn","wwwee");
//		String b=book.getTitle();
//		b="e";
//		System.out.println(book.getTitle());
//		System.out.println(b);
//		System.out.println("the name of customer : ");
		Geeks geek=new Geeks("mohamed");
		System.out.println(geek);
		
		CustomerRecords records=new CustomerRecords();
		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));
		records.addCustomer(new Customer("mohamed"));
		Map<String,Customer> customers=records.getCustomers();
		customers.get("Simon").setName("mssmssm");
		for(Customer element:records.getCustomers().values()) {
			System.out.println(element.getName());
		}
		
		//Customer cust=records.getCustomerByName("john");
		//System.out.println(cust.getName());
//		Map<Integer,String> num=new HashMap<>();
//		num.put(1, "mohamed");
//		num.put(2, "mostafa");
//		num.put(3,"nagaty");
//		System.out.println(num.get(3));
		//cust.setName("nagaty");
//		Map<String,Customer> mycustomer=records.getCustomers();
//		mycustomer.put("nagaty", new Customer("nagaty"));
//        for(Entry<String, Customer> cus:records.getCustomers().entrySet()) {
//        	
//        	System.out.println(cus.getValue().getName());
//        	
//        }
//		ArrayList<Integer> numbers=new ArrayList<Integer>();
//		numbers.add(10);
//		numbers.add(20);
//		numbers.add(30);
//		numbers.add(40);
//		List<Integer> num= Collections.unmodifiableList(numbers);
//		//num.set(0, 1000);
//	                                                                                                                                                     
////		ArrayList<Integer> num1=new ArrayList<Integer>(numbers);
////		num1.set(2, 3000);
//
//		for(int element:num) {
//			System.out.println(element);
//		}
//		Customer cust=new Customer("mohamed");
//		System.out.println(cust.getCustomer(cust));
		
		
	
	}


}
