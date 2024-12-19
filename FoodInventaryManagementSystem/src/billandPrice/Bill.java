package billandPrice;
import order.Order;
public class Bill {
		Order orderedItems;		
		double amountToPay;			
		
		public void setToPay(double tp)
		{
			this.amountToPay=tp;
		}

		public void setBillList(Order o)
		{
			orderedItems =o;
		}

		public double getToPay(){
			return(amountToPay);
		}

		public Order setbillList()
		{
			return(orderedItems);
		}

	}


