package practiceTat;
public class LastFourUpperCase 
{
	public static void main(String[] args)
	{
		String str = "Hello, world";
		String convertedStr = convertLastFourToUpper(str);
		System.out.println("Original String: " + str);
		System.out.println("Converted String: " + convertedStr);
	}

	public static String convertLastFourToUpper(String str)
	{
		if (str.length() < 4) {
			// If the string has less than 4 characters, return it as it is
			return str;
		} 

			else 
			{
				String lastFourChars = str.substring(str.length() - 4);
				System.out.println(lastFourChars);
				String convertedLastFour = lastFourChars.toUpperCase();
				//System.out.println(convertedLastFour);
				return str.substring(0, str.length() - 4) + convertedLastFour;
			}
		}
	}