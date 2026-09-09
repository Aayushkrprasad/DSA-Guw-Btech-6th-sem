import java.util.*;


class pattern5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int row=1;
        int star =n;
        int space = 0;

        while(row<=n){

            // spaces
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            row++;
            star--;
            space++;
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
