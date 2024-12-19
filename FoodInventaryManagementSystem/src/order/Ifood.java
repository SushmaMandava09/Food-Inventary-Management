package order;
import billandPrice.Item;
import java.util.*;

public interface Ifood {

		
		public Set<Item> getMenu();
		public void showBill(Order o);

	}

