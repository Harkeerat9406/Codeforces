import java.util.Scanner;

public class B_No_Casino_in_the_Mountains {
    public static void countHikes(int arr[], int k)
    {
        int hikes=0, noRain=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==0)
                noRain++;
            else
                noRain=0;

            if(noRain==k)
            {
                noRain=0;
                hikes++;
                i++;
            }
        }
        System.out.println(hikes);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();
        for(int i=0; i<cases; i++)
        {
            int n= sc.nextInt();
            int k= sc.nextInt();

            int arr[]= new int[n];
        
            for(int j=0; j<n; j++)
            {
                
                arr[j]= sc.nextInt();
            }
            countHikes(arr, k);
        }
    }
}