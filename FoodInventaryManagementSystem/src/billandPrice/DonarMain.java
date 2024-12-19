package billandPrice;
import java.io.*;
import order.Main;
public class DonarMain {
	
		public static void main(String[] args) throws IOException{
			String ch="y";
			MenuManager MenuManager =new MenuManager();
			int choice=0;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			do {
				System.out.println("Choices:"
						              
						+"\n1)ShowMenu\n2)Add Items"
						               +"\n3)RemoveItems\n4)Update Prices\n5)Exit");
			     System.out.println("Enter your choice:");
				try
				{
					choice=Integer.parseInt(br.readLine());
					switch(choice)
					{
					case 1: MenuManager.displayMenu();
					         break;
					case 2: MenuManager.addItem();
					        break;
					case 3:	MenuManager.removeItem();
					        break;
					case 4: MenuManager.updatePrice();
					         break;
					case 5:Main.main(null);
					        break;
					         
					default:
						 System.out.println("OOPS!WRONG CHOICE");
				    		 
					}

				}
				catch(NumberFormatException e) {
					System.out.println("illegal input format\n enter only numeric ");
				}
				System.out.println("do u want to continue?");
				ch=br.readLine();
		
			}while(ch.equalsIgnoreCase("y"));
				
			}

		}


