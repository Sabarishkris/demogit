//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("Enter the array Size : ");
//                int size = scanner.nextInt();
//                int arr[] = new int[size];
//                System.out.println("Enter Array Values : ");
//                for (int i =0;i<size;i++){
//                    arr[i] = scanner.nextInt();
//                }
    int arr[]={7,1,5,3,6,4};
       // int arr[]={7,6,3,4,1};
                int profit = 0;
                int maxStockPrice = 0;
                int minStockPrice = arr[0];
       // System.out.println(minStockPrice);
                for(int i =0;i< arr.length;i++){
                    if(arr[i] < minStockPrice){
                       // System.out.println(arr[i]);
                        maxStockPrice = 0;
                        minStockPrice = arr[i];
                        profit=0;
                    } else{
                        maxStockPrice = Math.max(arr[i],maxStockPrice);
                        if(maxStockPrice-minStockPrice > profit){
                            profit = maxStockPrice-minStockPrice;
                        }
                    }
                }
                System.out.println("Your Profit Will be : "+profit);
            }
        }