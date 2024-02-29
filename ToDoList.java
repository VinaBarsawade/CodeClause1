package codeclause;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
	
	private static ArrayList<String>list=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

System.out.println("Enter Your choice 1:Add,2:Remove,3:Update,4:Display");
while(true) {
int ip=sc. nextInt();
sc.nextLine();
switch(ip) {
case 1:
	add();
	break;

case 2:
	 remove();
	break;
case 3:
	 update(); 
	break;	
	

case 4:
	display();
	break;


	}
}
	}
	private static void add() {
			System.out.println("Enter task you want to add");
			String str=sc.nextLine();
			
				list.add(str);
		System.out.println("Task added successfully");
			}
		
		private static void remove() {
			System.out.println("Enter index of task that you want to remove");
			int user=sc.nextInt();
			
				
				if(user>0 && user<list.size()) {
					list.remove(user);
					System.out.println("Removed successfully");
					
				}
				else {
					System.out.println("Element not found");
				}
				
			}
			
				
			
	private static	void display() {
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i)+" ");
			}
	}
		private static void update() {
			System.out.println("Enter index at which you want to update");
			int user=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter new task you want to update");
			String newtask=sc.nextLine();
			
	if(user>=0 && user<list.size()) {
		list.set(user, newtask);
		System.out.println("Task updated successfully");
			
		}
			
			}
			}

