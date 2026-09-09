import java.util.*;


class pattern3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int row=1;

        while(row<=n){
            int i=n;
            while(i>=row){
                System.out.print("* ");
                i--;
            }
            System.out.println();
            row++;
        }

        
        
    }
}

/*
Output (for n = 5):
* * * * * 
* * * * 
* * * 
* * 
* 
*/
