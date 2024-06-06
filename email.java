package emailapp;

import java.util.Scanner;

public class email {
     private String firstname;
     private String lastname;
     private String password;
     private String email;
     private String department;
     private  int mailboxCapacity=500;
     private String alternateEmail;
     private int defaultpasswordlength=10;
     private String companySuffix="avcompany.com";

    
     public email(String firstName,String lastname){
        this.firstname=firstName;
        this.lastname=lastname;
        System.out.println("Email Created:  "+  this.firstname+"  "+this.lastname);
          this.department=setDepartment();
          System.out.println("Department: "+this.department);
         this.password=randomPassword(defaultpasswordlength);
         System.out.println("your password is:"+this.password);
        email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+ department+"."+companySuffix;
        System.out.println("your email is:"+email);
    }
     private String setDepartment(){
        System.out.print("new worker:"+"Department CODES\n1 for Sales\n2 for Development\n3 Accounting\n0 for none");
        Scanner in= new Scanner(System.in);
        int depChoice=in.nextInt();
        if(depChoice==1){ return "sales";}
        else if(depChoice==2){ return "dev";}
        else if(depChoice==3){ return "acct";}
        else{return "";}
    }
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";  
        char[] password =new char[length];
        for (int i=0;i<length;i++){
           int rand= (int)(Math.random()*passwordSet.length());
         password[i]=passwordSet.charAt(rand);
         
        }
        return new String (password);
    }

   public void setMailboxCapacity(int capacity){
    this.mailboxCapacity=capacity;
   }
    
   public void setalternateemail(String altemail){
    this.alternateEmail=altemail;
   }
   public void CHANGEPASSWORD(String password){
    this.password=password;
   }
    public int getmailboxcapacity(){return mailboxCapacity; }
    public String getalternateemail(){return alternateEmail;}
    public String getPassword(){return password;}
    
    public String showInfo(){
        return "Display Name: "+firstname+" "+lastname+"\nCompany Email:"+email+"\nMailbox capacity"+mailboxCapacity+"mb";
    }

}
