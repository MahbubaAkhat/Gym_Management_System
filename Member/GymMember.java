/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Member;

import java.util.Scanner;

public class GymMember extends Member{
    Scanner in = new Scanner(System.in);
    
    public void getInfo()
    {
        System.out.println("Name : ");
        name = in.nextLine();
        System.out.println("Id : ");
        member_id= in.nextLine();
        System.out.println("Phone Nummber : ");
        phone_number = in.nextLine();
        System.out.println("Email : ");
        email = in.nextLine();
        System.out.println("Age : ");
        age = in.nextLine();
        System.out.println("Home Address : ");
        home_address = in.nextLine();
        System.out.println("NID Nummber : ");
        nid_nummber= in.nextLine();
        System.out.println("Payment : ");
        payment = in.nextLine();
        
    }
    
    public void setInfo()
    {
        System.out.println("Name : "+name);
       
        System.out.println("Id : "+member_id);
        
        System.out.println("Phone Number : "+phone_number);
        System.out.println("Email : "+phone_number);
        System.out.println("Age : "+age);
        System.out.println("Home Address : "+home_address);
        System.out.println("NID Nummber : "+ nid_nummber);
        System.out.println("Payment : "+payment);
        
        
    }
    
   
    
    
}
