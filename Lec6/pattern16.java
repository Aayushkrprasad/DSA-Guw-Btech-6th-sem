import java.util.*;


class pattern16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int row=1;
        int star =n;
        int space =n-1;

        while(row<=2*n-1){


            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }




            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }

            if(row<n){ 
                star--;
                space--;
            }
            else{
                star++;
                space++;
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
  * * 
    * * * 
      * * * * 
        * * * * * 
*/
