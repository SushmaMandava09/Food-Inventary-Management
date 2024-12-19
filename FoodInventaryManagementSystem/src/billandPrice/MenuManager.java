package billandPrice;

import java.util.*;
import java.util.regex.Pattern;

	public class MenuManager implements IMenuManager{
		Scanner in=new Scanner(System.in);
		public boolean updatePrice() {
			String itemName;
			Double itemPrice=0.0;
			boolean itemSearch=false;
			Item ite=null;
			System.out.println("enter item name:");
			itemName=in.next();
			for(Item it:Menu.getInstance().getItemMenu())
			{
				if(it.getName().equalsIgnoreCase(itemName))
				{
					itemSearch=true;
					ite=it;
					break;
				}
			}
			if(!itemSearch) {
				System.out.println("no such item exists.Please try again.");
				updatePrice();
			}
			boolean flag=true;
			while(flag) {
				try {
					System.out.println("enter "+itemName+"'s new price:");
					itemPrice=Double.parseDouble(in.next());
					flag=false;
					
				}
				catch(NumberFormatException e) {
					System.out.println("please enter a numeric value");
				}
			}
			ite.setPrice(itemPrice);
			Menu.getInstance().getItemMenu().add(ite);
			return false;
		}
		public void addItem()
		{
			int number_of_items=0;
			try {
				System.out.println("How many items do you want to add?");
				number_of_items=in.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("please enter a numeric value");
			}
			for(int x=0;x<number_of_items;x++) {
				Item it=new Item();
				double price=0.0;
				int maxId=0;
				String name=null;
				boolean flag=true;
				while(flag) {
					System.out.println("enter name of item:");
					name=in.next().toLowerCase();
					if(!Pattern.matches("[a-zA-Z]+", name)) {
						System.out.println("name can only have characters");
						flag=true;
					}
					else
					{
						flag=false;
					}
					for(Item item:Menu.getInstance().getItemMenu()) {
						if(item.getName().equalsIgnoreCase(name)) {
							System.out.println("cannot add this item.Item already exists");
							addItem();
						}
					}
					System.out.println("enter price of item:");
					try {
						price=in.nextDouble();
					}
					catch(InputMismatchException e) {
						System.out.println("please enter a numeric value");
					}
					for(Item item:Menu.getInstance().getItemMenu()) {
						if(item.getId()>maxId)
							maxId=item.getId();
					}
					it.setId(maxId+1);
					it.setName(name);
					it.setPrice(price);
					Menu.getInstance().getItemMenu().add(it);
					System.out.println("item added successfully.");
				}
			}
		 	
		}
		
		//To remove an item from Menu
		public boolean removeItem()
		{
			System.out.println("Enter item name to delete:");
			String name=in.next();
			
			for(Item item_delete:Menu.getInstance().getItemMenu())
			{
				if(item_delete.getName().equalsIgnoreCase(name))
				{
					Menu.getInstance().getItemMenu().remove(item_delete);
					System.out.println("Item deleted successfully...");
					return true;
				}
			}
			System.out.println("No such item exists in menu");
			return false;
			
		}
		
		//To display all menu Items
		public void displayMenu()
		{
			System.out.format("%-15s%20s\n","item name","price");

			for(Item i:Menu.getInstance().getItemMenu())
			{
				System.out.format("%-15s%20s\n",i.getName(),i.getPrice()+" ");

			}
		}
		}


