import java.util.*;


class pattern20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int row=1;
        int star =1;
        int space =n-1;

        int cnt=1;

        while(row<=n){

            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }

            int i=1;
            while(i<=star){
                System.out.print(cnt+" ");
                cnt++;
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
      2 3 4 
    5 6 7 8 9 
  10 11 12 13 14 15 16 
17 18 19 20 21 22 23 24 25 
*/
