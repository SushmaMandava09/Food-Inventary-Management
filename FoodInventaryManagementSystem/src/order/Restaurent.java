package order;
import billandPrice.Item;
import billandPrice.Bill;
import billandPrice.OrderDesk;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;
public class Restaurent implements Ifood{ 
	
	
			/*CafeManager cafeManager = CafeManager.getInstance();*/                  //cafeManager is a singleton class
      OrderDesk orderDesk = new OrderDesk();
	          
			public Set<Item> getMenu(){
				//CafeManager cafeManager = CafeManager.getInstance();
				Set<Item> menu = orderDesk.askMenu();                            //cafeManager.askMenu() returns a set of items from MenuManiplator class 
				return menu;
			}

             public User getUserCredentials(User user)
             {
				Scanner scanUserCredentials = new Scanner(System.in);

				int userId = 1;
				user.setUserId(userId);
				boolean invalidInput = true;
				while(invalidInput){
					System.out.println("Enter Name of Oraganization: ");
					try{
						String userName = scanUserCredentials.nextLine();
						if(Pattern.matches("^[a-zA-Z\\s]+$", userName))	
						{
							user.setUserName(userName);
							invalidInput=false;
						}
						else {
							throw new Exception();
						}
					}
					catch(Exception ee){
						System.out.println("Please Enter Valid Name!!");
					}
				}
				//Scanner scanPhoneNumber = new Scanner(System.in);
				invalidInput = true;
				while(invalidInput){
					System.out.println("Enter Phone Number : ");
					try{
						Long userPhoneNumber = Long.parseLong(scanUserCredentials.next());
						if(Pattern.matches("[0-9]{10}", userPhoneNumber.toString()))
						{
						user.setUserPhone(userPhoneNumber);
						invalidInput = false;
						}
						else{
							throw new Exception();
						}
					}
					catch(Exception ee){
						System.out.println("Please Enter Valid Phone Number!!");
					}
				}
				 invalidInput = true;

			        while (invalidInput) {
			            System.out.println("Enter Address: ");
			            try {
			            	 scanUserCredentials.nextLine();
			                String address = scanUserCredentials.nextLine();
			                if (!address.trim().isEmpty()) {
			            
			                   user.setUserAddress(address);
			                    invalidInput = false;
			                } 
			                else {
			                    throw new Exception();
			                }
			            } catch (Exception ee) {
			                System.out.println("Please Enter Valid Address!!");
			            }
			        }
				return user;

			}

			public void showBill(Order order){
				//CafeManager cafeManager = CafeManager.getInstance();
				 double totalPrice=0;
				Bill bill = orderDesk.getbill(order);                                  //cafeManager.getBill() takes Order object and return the Bill object
				List<ItemOrdered> itemList = order.getItems();                          //getting items in list to display in the bill 
				System.out.println("*******BILL******");
				System.out.println("Item Name\tQuantity\tPrice\n");
				System.out.format("%4s%20s%25s\n","Item Name","Quantity","Price");

				for(ItemOrdered itemOrdered: itemList){
					double itemPrice = itemOrdered.getItem().getPrice() * itemOrdered.getItemQuantity();
		            System.out.format("%-20s%-10s%-10s%n", itemOrdered.getItem().getName(),
		                    itemOrdered.getItemQuantity(), itemPrice);
		            totalPrice += itemPrice;
		        }

		        System.out.println("Total: $" + totalPrice);
			}
			//method to display menu to user coming in form of Set<items> from Main  
			public void showMenu(Set<Item> menu){
				//System.out.println("ION DHABA");
				System.out.println("\n******MENU****");
				System.out.println("\n\n\n");
				//TableBuilder tableBuilder = new TableBuilder();
				//tableBuilder.addRow("Id","Item","Price");
				System.out.format("%-4s%-20s%-25s","Id","Item","Price");
				int id = 1;
				for(Item menuSet : menu){
					/*        	System.out.println(menuSet.getItemName());
		        	System.out.println(menuSet.getItemPrice());*/
					System.out.println();
					//System.out.println(menuSet);
					System.out.format("%-4s%-20s%-25s",id+"",menuSet.getName(),menuSet.getPrice());
					//tableBuilder.addRow(id,menuSet.getItemName(),menuSet.getItemPrice());
					System.out.println();
					id++;
				}
			
		}
}
