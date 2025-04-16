public class MyProgram
{
    public static void main(String[] args)
    {
        
		// Output should be:
		//5
		//0
		//6
	
		System.out.println("Day of week: "+ findDay(0,13));
		System.out.println("Day of week: "+ findDay(2,13));
		System.out.println("Day of week: "+ findDay(5,23));
		// I think i miss understood what it was supposed to return.
		// If you want i can make it return an int but i think this is better.
	}

	public static String findDay(int constant, int day)
	{
		int daysFromZero = day + constant;
		int dayCode = daysFromZero % 7;
		
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		dayCode = dayCode - 1;
		if (dayCode == -1){dayCode = 6;}
		System.out.print(dayCode);
		return days[dayCode];
	}
}