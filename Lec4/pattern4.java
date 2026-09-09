import java.util.*;


class pattern4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int row=1;
        int star =1;
        int space = n-1;

        while(row<=n){

            // spaces
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }

            // stars
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }

            // nextline update
            System.out.println();
            row++;
            star++;
            space--;
        }

        
        
    }
}

/*
Output (for n = 5):
        * 
      * * 
    * * * 
  * * * * 
* * * * * 
*/
