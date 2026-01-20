package code;

public class FindMaxWealthUsingArray {
	//Find customer maximum wealth using two-dimensional array

	public static int maxWealth(int[][] accounts) {
		 int maxWealth = 0;
		 for (int i = 0; i < accounts.length; i++) {
			int currentWealth = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				currentWealth += accounts[i][j];
			}
			if (currentWealth > maxWealth) {
				maxWealth = currentWealth;
			}
		}
		 return maxWealth;
	}
	
	public static void main(String[] args) {
		int[][] accounts = {
			    {1, 2, 3},
			    {3, 2, 1}
			};
		int result = FindMaxWealthUsingArray.maxWealth(accounts);
		int result_2 = FindMaxWealthUsingArray.maxWealth(new int[][] {{1,2,3},{4,5,6}});
		System.out.println("Richest customer wealth is " + result);
		System.out.println("Richest customer wealth is " + result_2);
	}
}