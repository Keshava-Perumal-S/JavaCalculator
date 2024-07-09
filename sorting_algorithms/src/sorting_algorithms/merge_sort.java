package sorting_algorithms;
import java.util.*;
public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int a=11;
		int num=0;
		int [] arr = new int[5];
        System.out.println(Arrays.toString(arr));
        int[] temp=new int[5];
        int i=0,k=0;
        while(a>0)
        {
        	temp[i]=a%2;
        	a=a/2;
        	i++;
        }
        System.out.println(Arrays.toString(temp));
        for(int j=temp.length-1;j>=0;j--)
        {
        	arr[k]=temp[j];
        	k++;
        }
        System.out.println(Arrays.toString(arr));
		for(int z:arr)
		{
			 num=z;
			System.out.println(num);
		}
		//int a=10100;
		
		bin2dec(num);
		

	}
	public static void bin2dec(int num)
	{
		int dec=0,power=0;
		while(num!=0)
		{
			int rem=num%10;
			dec+=rem*Math.pow(2, power);
			num=num/10;
			power++;
		}
		System.out.println("ans: "+dec);

	}

}


