import java.util.*;
class game{
    public int mynum;
    public int usernumber;
    public int guesscnt=0;

    public int getCnt() {
        return guesscnt;
    }

    public void setCnt(int cnt) {
        this.guesscnt = cnt;
    }
    game(){
        Random rd=new Random();
        this.mynum= rd.nextInt(100);
    }
    public void takinguserinput(){
        System.out.print("Guess The Number : ");
        Scanner sc=new Scanner(System.in);
        usernumber= sc.nextInt();
    }
    boolean iscorrect(){
        guesscnt++;
        if (usernumber==mynum){
            System.out.format("Yes it was right. It was %d\nYou've guessed in %d attempts ",mynum,guesscnt);
            return true;
        }
        else if(usernumber>mynum){
            System.out.println("Your No. Is High");
        }else if(usernumber<mynum){
            System.out.println("Your No. is Too Low");
        }
        return false;
    }
}
public class Guess_Number {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        game guess= new game();
        boolean b=false;
        while(!b){
            guess.takinguserinput();
            b=guess.iscorrect();
            System.out.println(b);
        }

    }
}
