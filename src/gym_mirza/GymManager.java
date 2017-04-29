/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym_mirza;
import java.util.ArrayList;

/**
 *
 * @author irtiza wahid
 */
public class GymManager {
    
    private ArrayList<Member> listOfMember;
	
    public GymManager()
    {
        this.listOfMember=new ArrayList<Member>();
    }
    
    public int addMember(Member Mem)
    {
        this.listOfMember.add(Mem);
        return this.listOfMember.size();
    }
    
    public int count()
    {
        return this.listOfMember.size();
    }
    public Member getMember(int index)
    {
        if(index<0 || index>=count())
        {
            return null;
        }
            return this.listOfMember.get(index);
            
    }
    
    public boolean removeMember(int id)
    {
        int index= -1;
        
        for(int i=0, n=count(); i<n; i++)
        {
            if(this.listOfMember.get(i).getId()==id)
            {
                    index=i;
                    break;
            }
        }
        if(index != -1)
        {
            this.listOfMember.remove(index);
            return true;
        }
        return false;
    }
    
    
    public boolean showMember(int id)
    {
        int index= -1;
        
        for(int i=0, n=count(); i<n; i++)
        {
            if(this.listOfMember.get(i).getId()==id)
            {
                    index=i;
                    break;
            }
        }
        if(index != -1)
        {
            System.out.println("Member Id\tMember Name\tMember Address\tMember Class\tMember Age\tMember Phone\tMember Weight");
            System.out.println(this.listOfMember.get(index).getId()+" "+this.listOfMember.get(index).getName()+" "+this.listOfMember.get(index).getAddress()+" " +this.listOfMember.get(index).getWorkout()+" "+this.listOfMember.get(index).getAge()+" "+this.listOfMember.get(index).getPhone()+" "+this.listOfMember.get(index).getWeight());   
            return true;
        }
        return false;
    }
    
}
