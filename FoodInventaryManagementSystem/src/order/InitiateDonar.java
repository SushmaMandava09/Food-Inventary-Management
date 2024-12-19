package order;
import billandPrice.Item;
import java.util.Set;
public class InitiateDonar {
	

		public void initiateDonar(){
			  Restaurent res= new Restaurent();
			  User user = new User();
			   user = res.getUserCredentials(user);
		       UserActivity customerActivity = new UserActivity(user);
				Set<Item> menu = res.getMenu();
		       res.showMenu(menu);
		       Order order = customerActivity.placeOrder(menu);
		       res.showBill(order);
		}
		}

