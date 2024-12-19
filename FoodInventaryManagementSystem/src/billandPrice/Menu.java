package billandPrice;
import java.util.HashSet;
import java.util.Set;
public class Menu {
	
	/*
	Menu Class to setup initial menu with default items
	 */
	
		private Set<Item> itemMenu= new HashSet<Item>();					//Collection of item objects
		private static Menu menu;											//Declaration of Menu object

		private Menu(){
			setMenu();
		}													//Singleton Implementation

		public static Menu getInstance()
		{								//Method to Create instance of Menu object
			if(menu==null)
			{
				menu=new Menu();

			}
			return menu;
		}
		
		public void setMenu()												// Method to setup the initial Menu
		{
			Item item;

			String names[]={"burger","fries","soup","coffee","ice cream","curries"};
			double prices[]={30.0,45.0,30.0,20.0,30.0,20.0};
			int id[]={1,2,3,4,5,6};
			for(int i=0;i<names.length;i++)
			{
				item=new Item();
				item.setName(names[i]);
				item.setPrice(prices[i]);
				item.setId(id[i]);
				itemMenu.add(item);
			}
		}

		public Set<Item> getItemMenu() 
		{								//Getter method to return Menu object
			return itemMenu;
		}

	}


