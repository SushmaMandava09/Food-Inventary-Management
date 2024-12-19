package billandPrice;
import order.ItemOrdered;
import order.Order;
public class BillCreator {
			
			public Bill generateBill(Order o)
			{
				double amountToPay=0.0;			
				Bill bill_obj;					

				for(ItemOrdered i:o.getItems())
				{	
					amountToPay+=i.getItem().getPrice()*i.getItemQuantity();
				}
				
				bill_obj=new Bill();
				bill_obj.setToPay(amountToPay);
				bill_obj.setBillList(o);

				return (bill_obj);
			}
		}


