
import java.util.*;

class Task1 {
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        char c;
        do{
             Random r = new Random();
             int n = r.nextInt(100) + 1;

             int guess = 0;
             int count = 0;
             
             boolean won=false;

             System.out.println("Welcomeeee to Number Game ");
             System.out.println("You have 7 attempts to guess.... Best of Luck ");


            do {
                if (count == 7) {
                   System.out.println("Oopss!! Game Over.");
                   System.out.println("The correct number was: " + n);
                   break;
                }

                System.out.print("Attempt " + (count + 1) + " : Enter guess: ");
                guess = sc.nextInt();

                count++;

                if (guess == n) {
                    System.out.println("Woahhh You guessed correctly!!!");
                    System.out.println("Attempts used: " + count);
                    won=true;
                }
                else if (guess < n) {
                    System.out.println("Ahh... very low. Try again");
                }
                else {
                   System.out.println("Ahh... very high. Try again ");
                }

            } while (guess != n);

             HashMap<Integer,Integer> map=new HashMap<>();
             map.put(1,100);
             map.put(2,90);
             map.put(3,80);
             map.put(4,70);
             map.put(5,60);
             map.put(6,50);
             map.put(7,40);
             if(won){
                System.out.println("Congratulations!! You guessed it right in "+count+" attempts.");
                System.out.println("YOUR SCORE= "+map.get(count));

             }
             System.out.print("Do u want to play again('Y' for Yes, 'N' for No) : ");
             c=sc.next().charAt(0);
        
        }while(c=='Y' || c=='y');
        
        System.out.print("Thanks for playing!!");

        
    }
}

