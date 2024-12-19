package billandPrice;
import java.util.Set;

import order.Order;

public class OrderDesk {
				/* Acts as a mediator between the customer serving module and back end module.
			 * Functionalities: return menu
			 * 					return Bill
			 * */
			
				// returns the menu to the customer
				public Set<Item> askMenu(){
					
					return (Menu.getInstance().getItemMenu());
				}
				public Bill getbill(Order o)
				{
					return (new BillCreator().generateBill(o));
				}

				
	}
				
				//returns the bill to the customer


