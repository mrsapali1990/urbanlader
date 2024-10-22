package javaconcept;

import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		int c;
		Random t=new  Random();
		//Random integer number 0 to 100
		for(c=1;c<10;c++)
		{
			System.out.println(t.nextInt(100));
		}
	}

}
