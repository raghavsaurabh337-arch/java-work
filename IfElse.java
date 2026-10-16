import java.util.Scanner;
class IfElse{
	public static void main(String []args){
	  // college fee Apps
	  
	  int AddNumber=127866;
	  int AddNumberUser;
	  String courseStudent="MCA";
	  String studentName="Saurabh";
	  long Amount=120000;
	  long inputAmount;
	  String CourseStudentUser;
	  String StudentNameUser;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter you AddNumberUser");
		AddNumberUser=sc.nextInt();
	  
	  
	  if(AddNumber==AddNumberUser){
		  System.out.println("your are total fee "+Amount);
		  
		  System.out.println("Enter you StudentNameUser");
		  StudentNameUser =sc.nextLine();	 
		  
		  System.out.print("Enter you CourseStudentUser");
		  CourseStudentUser =sc.nextLine();
		  
		  if(AddNumber == AddNumberUser && courseStudent==CourseStudentUser && studentName==StudentNameUser ){
			  System.out.println("Enter your fee");
			  inputAmount =sc.nextLong();
			  if(inputAmount>=1 && inputAmount>=Amount){			  
			  
			  Amount=Amount-inputAmount;
			  System.out.println("your are depostie fee "+inputAmount+" less fee"+Amount);
			  }
			  else{
				  System.out.println(Amount+"plz enter you amount");
			  }
		  }
		  else
		  {
			  System.out.println("Don't not match  enter you dateils ");
		  }
		  
		  
	  }
	  else{
		  System.out.print("Don't Match Addnumber");
	  }
	}
}