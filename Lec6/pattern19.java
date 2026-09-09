import java.util.*;


class pattern19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int row=1;
        int star =1;
        int space =n-1;

        while(row<=n){

            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }

            int i=1;
            while(i<=star){
                System.out.print(row+" ");
                i++;
            }

            space--;
            star+=2;
            System.out.println();
            row++;
            
        }

    }
}

/*
Output (for n = 5):
        1 
      2 2 2 
    3 3 3 3 3 
  4 4 4 4 4 4 4 
5 5 5 5 5 5 5 5 5 
*/
