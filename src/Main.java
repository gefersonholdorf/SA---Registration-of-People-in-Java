import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner print = new Scanner(System.in);
		
		List <User> users = new ArrayList<>();
		Integer counter, quantityUsers, age, choice = 1;
		String name;
		boolean verificated = false;
		
		System.out.println("---------------------------------------------");		
		System.out.println("#*#*#*#*# Registration of People #*#*#*#*#*#");
		System.out.println("---------------------------------------------");
		
		System.out.println("How many users do you want to register?");
		quantityUsers = print.nextInt();
		
		for (counter = 1; counter <= quantityUsers; counter++) {
			
			System.out.println("Name: ");
			name = print.next();
			System.out.println("Age: ");
			age = print.nextInt();
			System.out.println();
			
			User user = new User(name, age);
			users.add(user);
			
		}
		
		while (choice != 3) {
			System.out.println("1 - Register new users");
			System.out.println("2 - List all registered users");
			System.out.println("3 - Exit");
			System.out.println("4 - Search user");
			System.out.println("5 - Remove user");
			System.out.println("Choose option:");
			
			choice = print.nextInt();
			
			switch (choice) {
			
			//Add Users
			case 1: {
				
				System.out.println("Name: ");
				name = print.next();
				System.out.println("Age: ");
				age = print.nextInt();
				System.out.println();
				
				User user1 = new User(name, age);
				users.add(user1);
				
				break;
			}
			
			//List of entries
			case 2: {
				
				System.out.println();
				System.out.println("List of entries");
				
				for (User list: users) {
					
					System.out.printf("Name: " + list.name + " - " + 
					list.age + "years old");
					System.out.println();
				}
				
				System.out.println();
				
			break;
			}
				
				case 3: {
					
					System.out.println("Exit");
					
					break;
				}
				
				//Search Users
				case 4: {
					
					System.out.println("Enter the name: ");
					name = print.next();
					
					for (User list : users) {
						
						if (name.equals(list.name)) {
							
							System.out.println("User found");
							verificated = true;
							
							break;
						} 
					}
					
					if (verificated != true) {
						System.out.println("User not found");
					}
					
					System.out.println();
					
					break;
				}
				
				
				//Remove Users
				case 5: {
					
					verificated = false;
					System.out.println("Enter the name: ");
					name = print.next();
					
					for (User list : users) {
						
						if (name.equals(list.name)) {
							users.remove(list);
							verificated = true;
							System.out.println("User removed");
							
							break;
						} 
					
					}
					
					if (verificated != true) {
						System.out.println("User not removed... user not found");
					}
					
					System.out.println();
					
					break;
					
				}
			
			}
		} 	

	}



	public void removeUser () {
		
	}
	
}
