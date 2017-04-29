/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym_mirza;
import java.util.Scanner;

/**
 *
 * @author irtiza wahid
 */
public class MemberConsole {
    private GymManager manger;
    private Scanner sc;
    public MemberConsole()
    {
        this.sc=new Scanner(System.in);
        this.manger=new GymManager(); 
    }
    
    private int menu()
    {
        System.out.println("-----Memeber-----");
        System.out.println("1. Add Memeber ");
        System.out.println("2. Show all Memeber ");
        System.out.println("3. Delete Memeber ");
        System.out.println("4. Show Memeber ");
        System.out.println("0. Exit ");
        int choice = readInt(0,4);
        return choice;
    }
    
    public void start()
	{
            while(true)
            {
                int choice=menu();
                switch(choice)
                {
                    case 0:
                            System.exit(0);
                            break;

                    case 1:
                            addMember();
                            break;

                    case 2:
                            showAll();
                            break;

                    case 3:
                        removeMember();
                        break;
                    case 4:
                        showMembers();
                        break;
                        
                    default:
                        throw new AssertionError();
                }
            }
	}
    
     private void showMembers() {
                System.out.println("Enter Member ID :");
		int id=readInt(0,Integer.MAX_VALUE);
		boolean result=this.manger.showMember(id);
                if(result)
		{
			System.out.println("Member Showed.....");
		}
		else{
			System.out.println("Member not Found..");
		}
    }
    	private void removeMember() {
		System.out.println("Enter Member ID :");
		int id=readInt(0,Integer.MAX_VALUE);
		boolean result=this.manger.removeMember(id);
		
		if(result)
		{
			System.out.println("Member Was Removed..");
		}
		else{
			System.out.println("Member not Found..");
		}
	}
        
        
        private int readInt(int min,int max) 
        {
        int choice;
        while(true)
        {
            try
            {
                choice=Integer.parseInt(sc.nextLine());
                if(choice>=min && choice<=max)
                {
                        break;
                }
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
          return choice;
       }
        
        private void addMember() {
		System.out.println("Enter Member ID :");
		int id=readInt(0,Integer.MAX_VALUE);
		System.out.println("Enter Member Name :");
		String name=sc.nextLine();
                System.out.println("Enter Member Address");
                String Addr = sc.nextLine();
                System.out.println("Enter Member Workout Class");
                String Workoutclass = sc.nextLine();
                System.out.println("Enter Member Age");
                String age = sc.nextLine();
                System.out.println("Enter Member phone number");
                String phone = sc.nextLine();
                System.out.println("Enter Member Weight");
                String weight = sc.nextLine();
		Member men=new Member(id,name,Addr,Workoutclass,age,phone,weight);
		this.manger.addMember(men);
	}
        
        private void showAll() {
            // TODO Auto-generated method stub
            System.out.println("===All Member===");
            System.out.println("Member Id\tMember Name\tMember Address\tMember Class\tMember Age\tMember Phone\tMember Weight");
            for(int i=0; i<this.manger.count(); i++)
            {
                Member mem=this.manger.getMember(i);
                System.out.println(mem.getId()+"\t         "+mem.getName()+"\t         "+mem.getAddress()+"\t          "+mem.getWorkout()+"\t          "+mem.getAge()+"\t      "+mem.getPhone()+"\t         "+mem.getWeight());
            }
		
	}

   
    
}
