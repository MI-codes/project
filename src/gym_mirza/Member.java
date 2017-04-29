/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym_mirza;

/**
 *
 * @author irtiza wahid
 */
public class Member {
    
    public int id;
    public String name;
    public String Address, WorkoutClass;
    public String Age,Phone;
    public String weight;
	
    public Member(int id,String name,String addr,String workclass,String age,String phone,String weight)
    {
        this.id=id;
        this.name=name;
        this.Address=addr;
        this.WorkoutClass = workclass;
        this.Age =age;
        this.Phone = phone;
        this.weight =weight;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    public String getAddress(){
        return Address;
    }
    public void setAddress(String addr)
    {
        this.Address = addr;
    }
    
     public String getWorkout(){
        return WorkoutClass;
    }
    public void setWorkout(String workout)
    {
        this.WorkoutClass = workout;
    }
    
    
    public String getAge() {
        return Age;
    }
    public void setAge(String age) {
        this.Age = age;
    }
    
    public String getPhone() {
        return Phone;
    }
    public void setPhone(String phone) {
        this.Phone = phone;
    }
    
    
    public String getWeight(){
        return weight;
    }
    public void setWeight(String weight)
    {
        this.weight = weight;
    }
    
    
    
    
}
