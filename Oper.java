class Oper{
	public static void main(String []args)
	{
		System.out.println("Arithmetic");
		int num=78,num2=67;
		System.out.println(num+num2);
		System.out.println(num-num2);
		System.out.println(num/num2);
		System.out.println(num*num2);
		System.out.println(num%num2);
		
		num++;
		System.out.println(num); // isko bhul gaya tha ye dekh tha bad mai
		num2--;
		System.out.println(num2); // num2++ : (num2-1),67-1=66  
		
		
		System.out.println("Comparison: ");
		System.out.println(num==num2);
		System.out.println(num<num2);
		System.out.println(num>num2);
		System.out.println(num>=num2);
		System.out.println(num<=num2);
		System.out.println(num!=num2);
		
		
		
		System.out.println("Assigment:itself number to  ");
				System.out.println(num+=num);
			/*	System.out.println(num-=num);
				System.out.println(num%=num);
				System.out.println(num^=num);
				System.out.println(num*=num);*/
				
				
		System.out.println("logical AND OR NOT  ");
				System.out.println(num>num2 && num2<num); //   dono condition true honi chahayi (both true  )
				System.out.println(num>num2 || num2<num); //   dono condition true honi chahayi (one true  run)
				System.out.println(!(num>num2 || num2<num)); //   true->false, false->true
				
	}
}