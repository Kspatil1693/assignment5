package searchingandsorting;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class MainMethod {
	
   public static void main(String[] args) 
   {
	        /*System.out.println("Hello World!");*/
	        System.out.println("\n**************************************\n");
	        System.out.println("\tWelcome to TheDesk \n");
	        System.out.println("**************************************");
	        optionsSelection();

	    }
	    public static void optionsSelection() {
	        String[] arr = {"1. I wish to review my expenditure",
	                "2. I wish to add my expenditure",
	                "3. I wish to delete my expenditure",
	                "4. I wish to sort the expenditures",
	                "5. I wish to search for a particular expenditure",
	                "6. Close the application"
	        };
	        int[] arr1 = {1,2,3,4,5,6};
	        int  slen = arr1.length;
	        Scanner sc=new Scanner(System.in);
          
	        for(int i=0; i<slen;i++){
	            System.out.println(arr[i]);
	            // display the all the Strings mentioned in the String array
	        }
	        
	        ArrayList<Integer> arrlist = new ArrayList<Integer>();
	        ArrayList<Integer> expenses = new ArrayList<Integer>();
	        expenses.add(1000);
	        expenses.add(2300);
	        expenses.add(45000);
	        expenses.add(32000);
	        expenses.add(110);
	        expenses.addAll(arrlist);
	        System.out.println("\nEnter your choice:\t");
	        Scanner sc1 = new Scanner(System.in);
	        int  options =  sc1.nextInt();
	        for(int j=1;j<=slen;j++){
	            if(options==j){
	                switch (options){
	                    case 1:
	                        System.out.println("Your saved expenses are listed below: \n");
	                        System.out.println(expenses+"\n");
	                        optionsSelection();
	                        break;
	                    case 2:
	                        System.out.println("Enter the value to add your Expense: \n");
	                        int value = sc1.nextInt();
	                        expenses.add(value);
	                        System.out.println("Your value is updated\n");
	                        expenses.addAll(arrlist);
	                        System.out.println(expenses+"\n");
	                        optionsSelection();

	                        break;
	                    case 3:
	                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
	                        int con_choice = sc1.nextInt();
	                        if(con_choice==options){
	                               expenses.clear();
	                            System.out.println(expenses+"\n");
	                            System.out.println("All your expenses are erased!\n");
	                        } else {
	                            System.out.println("Oops... try again!");
	                        }
	                        optionsSelection();
	                        break;
	                    case 4:
	                        sortExpenses(expenses);
	                        optionsSelection();
	                        break;
	                    case 5:
	                        searchExpenses(expenses);
	                        optionsSelection();
	                        break;
	                    case 6:
	                        closeApp();
	                        break;
	                    default:
	                        System.out.println("You have made an invalid choice!");
	                        break;
	                }
	            }
	        }

	    }public static void closeApp() {
	        System.out.println("Closing your application... \nThank you!");
        }
	  public  static int[] arr1 = {1,2,3,4,5,6};
        int  slen = arr1.length;
        Scanner sc1=new Scanner(System.in);
        int searchValue = sc1.nextInt();
     	int result = (int) linearing(arr1,searchValue);
     	{
        if(result==-1){
            System.out.println("Element not in the array");
        } else {
            System.out.println("Element found at "+result+" and the search key is "+arr1[result]);
        }
     	}
	    public static int linearing(int[] arr1, int searchValue) {
	    	int arrlength = arr1.length;
	        for (int i = 0; i < arrlength - 1; i++) {
	            if (arr1[i] == searchValue) 
	            {
	                return i;
	            }
	        }
	        return -1;
		
		}
		
	    public static void searchExpenses(ArrayList<Integer> arrayList) {
	        int leng = arrayList.size();
	        System.out.println("Enter the expense you need to search:\t");
	        //Complete the method
	        Scanner sc=new Scanner(System.in);
	        int searchValue = sc.nextInt();
	        int result = (int) linearing(arr1,searchValue);
	        if(result==-1){
	            System.out.println("Element not in the array");
	        } else {
	            System.out.println("Element found at "+result+" and the search key is "+arr1[result]);
	        }
	        
	        
	    }
	       
	    
	    private static void sortExpenses(ArrayList<Integer> arrayList) {
	        int arrlength =  arrayList.size();
	       //Complete the method. The expenses should be sorted in ascending order.
	        int len = arr1.length;
	        int temp = 0;
	        for(int i=0;i<len;i++){
	            for (int j=1;j<(len);j++){
	                if(arr1[j-1]>arr1[j]){
	                    //System.out.println("arr[j-1]: "+arr[j-1]);
	                    System.out.println("arr[j]: "+arr1[j]);
	                    temp = arr1[j-1];
	                    arr1[j-1]= arr1[j];
	                    arr1[j]= temp;
	                }
	            }
	        }
	    }
	



	    }
	}


