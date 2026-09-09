import java.util.*;


class pattern17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int row=1;
        int star =n-1;
        int space =1;

        while(row<=2*n-1){

            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }


            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }




            i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }

            if(row<n){ 
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            System.out.println();
            row++;
            
        }

        
        
    }
}

/*
Output (for n = 5):
* * * *   * * * * 
* * *       * * * 
* *           * * 
*               * 
                  
*               * 
* *           * * 
* * *       * * * 
* * * *   * * * * 
*/
