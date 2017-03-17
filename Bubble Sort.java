import java.util.Scanner;

class BubbleSort
{
	private final static int TAM=6;
	public static void main(String[] args) 
	{
		int array[]=new int[TAM];
		Scanner input=new Scanner(System.in);

		//Input
		System.out.println("Enter any 6 Numbers for Unsorted Array : ");
		for(int i=0; i<TAM; i++)
		{
			array[i]=input.nextInt();
		}

		//Sorting
		for(int i=TAM-2; i>=0; i--)
		{
			for(int j=0; j<=TAM; j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}

		//Output
		for(int i=0; i<6; i++)
		{
			System.out.print(array[i]+"\t");
		}

	}
}
