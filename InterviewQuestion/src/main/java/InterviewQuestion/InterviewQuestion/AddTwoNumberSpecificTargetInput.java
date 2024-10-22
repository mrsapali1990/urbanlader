package InterviewQuestion.InterviewQuestion;

public class AddTwoNumberSpecificTargetInput {
	public static void main(String[] args) {


		int nums[] = {2,7,7,15};
		int target = 9;
		
		for(int i=0; i<nums.length-1; i++)
		{
			for(int j = i+1; j<nums.length; j++)
			{
				if(nums[i]+nums[j]==target)
				{
					System.out.println("pear found  :"+nums[i]+","+nums[j]);
					return;
				}

			}
		}
		System.out.println("no pear found");
	}
}
