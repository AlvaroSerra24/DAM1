package Arrays;

import java.util.Arrays;

public class Two_Sum {
	public static void main(String[] args) {
		int nums[]= {2,7,11,15};
		int target=9;
		
		System.out.println(Arrays.toString(TwoSum(nums,target)));
	}

	private static int[] TwoSum(int[] nums, int target) {
		int uno=0, dos=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					uno=i;
					dos=j;
				}
			}
		}
		return new int[] {uno,dos};
	}
}
