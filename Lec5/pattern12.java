import java.util.*;


class pattern12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int row=1;
        int star =n;
        int space = -1;

        while(row<=n){
            //star
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }

            // spaces
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //star
            j=1;
            if(row==1){
                // star--;
                j=2;
            }
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            row++;
            star--;
            space+=2;
        }

        
        
    }
}

/*
Output (for n = 5):
* * * * * * * * * 
* * * *   * * * * 
* * *       * * * 
* *           * * 
*               * 
*/
