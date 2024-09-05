package questions_task;

public class elementposition {

	
		// TODO Auto-generated method stub

		public static int findIndex(int arr[], int t)
		{
			if(arr==null)
			{
				return -1;
			}
			int len=arr.length;
			int i=0;
			while(i<len)
			{
				if(arr[i]==t)
				{
					return i;
				}
				else
				{
					i=i+1;
				}
			}
			return -1;
		}
		public static void main(String args[])
		{
			int arr[] = {5,4,6,8,9,7,9,7};
			System.out.println("Index " + findIndex(arr,5));
			System.out.println("Index " + findIndex(arr,9));
		}
	}

