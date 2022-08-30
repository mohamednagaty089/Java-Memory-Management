package EscapingReferencse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import GarbgeCollector.Customer;

public class CustomerRecords  implements Iterable<Customer>{
	private Map<String ,Customer> records;
	
	public CustomerRecords() {
		this.records=new HashMap<String,Customer>();
	}
	
	public void addCustomer(Customer c) {
		this.records.put(c.getName(),c);
	}
	public Map<String,Customer> getCustomers(){
		return Collections.unmodifiableMap(this.records);
		//return this.records;
		//return new HashMap<String,Customer>(this.records);
	}
	
// public void getCustomerByName(String name1) {
//	 Customer customer=records.get(name1);
//	 System.out.println(customer.getName());
//	// return customer;
// }
	@Override
	public Iterator<Customer> iterator() {
		// TODO Auto-generated method stub
		return records.values().iterator();
	}

}
