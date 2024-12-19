package order;
import billandPrice.Item;
public class ItemOrdered {
	
		private Item item;
		private int itemQuantity;
		public Item getItem()
		{
			return item;
		}
		public void setItem(Item item)
		{
			this.item=item;
		}
		public void setItemQuantity(int itemQuantity)
		{
			this.itemQuantity=itemQuantity;
		}
		public int getItemQuantity()
		{
			return itemQuantity;
		}
	}

