public class UserException {

	public static void age(int number1) throws InvalidInputException {
		if(number < 18 && number > 55)
		{
			throw new InvalidInputException("Invalid Input");
		}
		System.out.println("Valid Input");
	}

	public static void income(int number2) throws InvalidInputException {
		if(number < 50000 && number > 100000)
		{
			throw new InvalidInputException("Invalid nput");
		}
		System.out.println("Valid Input");
	} 

	public static void city(String str1,String str2,String str3,String str4) throws InvalidInputException {
		String str1 = new String("Pune");
		String str2 = new String("Mumbai");
		String str3 = new String("Banglore");
		String str4 = new String("Chennai");

		if(userinput == str1 && userinput == str2 && userinput == str3 && userinput == str4)
		{
			throw new InvalidInputException("Invalid nput");
		}
		System.out.println("Valid Input");
	}

	public static void vehicle(String str5,String str6,String str7) throws InvalidInputException {
		String str5 = new String("fourwheeler");
		//String str6 = new String("twowheeler");
		//String str7 = new String("none");

		if(userinput == str5 && userinput == str6 && userinput == str7)
		{
			throw new InvalidInputException("Invalid nput");
		}
		System.out.println("Valid Input");
	}

	public static void main(String[] args)
	{
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int number1 = userinput.nextInt();

		System.out.println("Enter the income in between 50,000 - 10,00,000: ");
		int number2 = userinput.nextInt();

		System.out.println("Enter city: ");
		String str1 = userinput.nextLine();
		String str2 = userinput.nextLine();
		String str3 = userinput.nextLine();	
		String str4 = userinput.nextLine();

		System.out.println("Enter fourwheel: ");
		String str5 = userinput.nextLine();


         // WRITING TRY CATCH AND FINALLY SEPARATLY (DUE :()
		try
		{
			age(number1);
			try 
			{
				income(number2);
				try
				{
					city(str1, str2, str3, str4);
					try 
					{
						vehicle(str5, str6, str7);
					}
					catch(InvalidInputException e)
					{
						System.out.println("Caught Exception");	
					}
					catch(InvalidInputException e)
					{
						System.out.println("Caught Exception");
					}
					catch(InvalidInputException e)
					{
						System.out.println("Caught Exception");
					}
					catch(InvalidInputException e)
					{
						System.out.println("Caught Exception");
					}
					finally 
					{
						System.out.println("The code is executed on Linux");
					}
					finally 
					{
						System.out.println("The code is executed on Linux");
					}
					finally 
					{
						System.out.println("The code is executed on Linux");
					}
					finally 
					{
						System.out.println("The code is executed on Linux");
					}
				}
			}
		}
	}

}