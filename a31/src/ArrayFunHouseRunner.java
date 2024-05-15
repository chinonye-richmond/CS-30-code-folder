import java.util.Arrays;

public class ArrayFunHouseRunner {
    public static void main(String[] args) throws Exception {
        int[] one = {4,10,0,1,7,6,5,3,2,9};

		System.out.println(Arrays.toString(one));
		System.out.println("sum of spots 3-6  =  " + getSum(one,3,6));
		System.out.println("sum of spots 2-9  =  " + getSum(one,2,9));
		System.out.println("# of 4s  =  " + getCount(one,4));
		System.out.println("# of 9s  =  " + getCount(one,9));

		int[] two = {4,2,3,4,6,7,8,9,0,10,0,1,7,6,5,3,2,9,9,8,7};
		System.out.println(Arrays.toString(two));
		System.out.println("sum of spots 5-9  =  " + getSum(two,5,9));
		System.out.println("sum of spots 4-17  =  " + getSum(two,4,17));
		System.out.println("# of 7s  =  " + getCount(two,7));
		System.out.println("# of 9s  =  " + getCount(two,9));

		//add test cases
    }


    public static int getSum(int[] numArray, int start, int stop) {
		int sum = 0;
		for (int b = start; b<= stop; b++){
			sum = sum + numArray[b];					
		}
		return sum;
	}

	//getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val)	{
        int count = 0;
		for (int i = 0; i <= numArray.length - 1; i++){
            if (numArray[i] == val){
                count ++;
            }
           
        }
        return count;
	}

	public static int[] removeVal(int[] numArray, int val)
	{
		return null;
	}


}
