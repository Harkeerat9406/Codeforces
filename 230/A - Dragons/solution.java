    import java.util.*;
    public class main {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
    
            long stren= sc.nextLong();
            int n= sc.nextInt();
            int arr[][]= new int[n][2];
            for(int i=0; i<n; i++)
            {
                arr[i][0]= sc.nextInt();
                arr[i][1]= sc.nextInt();
            }
                
            Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));
            boolean broke= false;
            
            for(int i=0; i<n; i++)
            {
                if(arr[i][0] < stren)
                {
                    stren+= arr[i][1];
                }
                else
                {
                    System.out.println("NO");
                    broke= true;
                    break;
                }
            }
            if(!broke)
            System.out.println("YES");
            }
        }