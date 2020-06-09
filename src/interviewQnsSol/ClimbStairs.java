package interviewQnsSol;
/*You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

1= 1
2 = 11,2
3=111,21,12
4=1111,22,211,121,112
*/

public class ClimbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(waysToClimb(20));
	}
	public static int waysToClimb(int n) {
        if(n==1){
            return 1;
        }
        int[] steps = new int[n+1];
        steps[1]=1;
        steps[2]=2;            
        for(int i=3;i<=n;i++){
            steps[i]=steps[i-1]+steps[i-2];
        }
        return steps[n];
    }
}
