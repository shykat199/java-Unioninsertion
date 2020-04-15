import java.util.*;
public class ArrayOfIntersectionUnion
{
	public static void main(String[] args) {
		
		System.out.println(" Array Operations (union,intersection):");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Array size of Array1:");
		int size1=s.nextInt();
		System.out.print("Enter the Array size of Array2:");
		int size2=s.nextInt();
		int arr1[]=new int[size1];
		int arr2[]=new int[size2];
System.out.println
(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Enter the Array Elements of the Array1:");
		for(int i=0;i<size1;i++)
		{
		    arr1[i]=s.nextInt();
		}
                System.out.println
(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Enter the Array Elements of the Array2:");
		for(int i=0;i<size2;i++)
		{
		    arr2[i]=s.nextInt();
		}
		
	      System.out.print("Array Element of Array1 after applying remove duplicate logic:  ");
		for(int i=0;i<(size1-1);i++)
		{
		    for(int j=i+1;j<size1;j++)
		    {
		        if(arr1[i]==arr1[j])
		        {
		            for(int k=j;k<(size1-1);k++)
		            {
		                arr1[k]=arr1[k+1];
		            }
		            size1=size1-1;
		        }
		       
		    }
		}
		for(int i=0;i<size1;i++)
		{
		   System.out.print(arr1[i]+" ");
		}
System.out.println
(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
	      System.out.print("\nArray Element of Array2 after applying remove duplicate logic:  ");
	   		for(int i=0;i<(size2-1);i++)
		{
		    for(int j=i+1;j<size2;j++)
		    {
		        if(arr2[i]==arr2[j])
		        {
		            for(int k=j;k<(size2-1);k++)
		            {
		                arr2[k]=arr2[k+1];
		            }
		            size2=size2-1;
		        }
		       
		    }
		}
		for(int i=0;i<size2;i++)
		{
		   System.out.print(arr2[i]+" ");
		}
System.out.println
(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
		System.out.println(" ");
                System.out.println("Enter  '1' for finding the Union of given Array");
		System.out.println("Enter  '2' for finding the intersection of given Array");
		int p=s.nextInt();
             
		switch(p)
		{
		 case 1:
		     {
		        int flag=0;
		        
			    System.out.print("Union of Two Arrays: "); 
                for(int i=0;i<size1;i++)
                {
                    System.out.print(arr1[i]+" ");
                }
                for(int i = 0; i < size2; i++)
                {
                     for(int j = 0; j < size1; j++)
                     {
                         if(arr2[i] != arr1[j])
                         {
                             flag =1;
                            
                         }
                         else
                         {
                           flag = 0;
                           break;
                         }
                         
                     }
                     if(flag ==1)
                     {
                         System.out.print(arr2[i]+" ");
                     }
                }
                break;
	       }


		    case 2 :
		        {
		            System.out.println("Intersection of two given Array:");
		            
     			   for(int i = 0; i<size1; i++ ) 
		            {
		                for(int j = 0; j<size2; j++)
		                {
		                    if(arr1[i]==arr2[j])
		                    {
		                        System.out.print(arr2[j]);
		                    }
		                }
                           }
		            break;
		        }
		        
        }

	}

}