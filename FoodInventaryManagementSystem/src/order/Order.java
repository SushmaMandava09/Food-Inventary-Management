package order;
import billandPrice.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class Order 
{
	
	   private List<ItemOrdered> itemsOrdered;
	  
	  // private Map<Item, Integer> items;
	   public Order()
	   {
	    itemsOrdered= new ArrayList<ItemOrdered>();
	    
	   }
	  
	   public List<ItemOrdered> getItems() 
	   {
	    return itemsOrdered;
	   }
	   public void setItems(List<ItemOrdered> items) 
	   {
	    this.itemsOrdered = items;
	   }
	   @SuppressWarnings("unchecked")
	public Map<Item, Integer>  getItems(List<ItemOrdered> items) 
	   {
	     return (Map<Item, Integer>) items;
	   }
	  public void additem(ItemOrdered I)
	  {
		  itemsOrdered.add(I);
	  }
	  //public double getTotalCost() {
	      //double totalCost = 0;
	      //for (Item item : items.keySet()) {
	          //int quantity = items.get(item);
	          //totalCost += item.getPrice() * quantity;
	     //}
	     //return totalCost;
	  //}

	}

