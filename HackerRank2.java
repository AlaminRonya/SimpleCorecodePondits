import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerRank2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//        MyCalculator myCalculator = new MyCalculator();
//        System.out.println("I implemented: AdvancedArithmetic");
//        System.out.println(myCalculator.divisor_sum(n));


        Soccer sc = new Soccer();
        sc.getNumberOfTeamMembers();

//        Sports c1 = new Sports();
//        Soccer c2 = new Soccer();
//        System.out.println(c1.getName());
//        c1.getNumberOfTeamMembers();
//        System.out.println(c2.getName());
//        c2.getNumberOfTeamMembers();
    }
}
//interface AdvancedArithmetic{
//    public  int divisor_sum(int n);
//}
//class MyCalculator implements AdvancedArithmetic{
//
//    @Override
//    public int divisor_sum(int n) {
//        int sum = n+1;
//        for (int i = 2; i<=n/2 ; i++){
//            if (n%i == 0){
//                sum +=i;
//            }
//        }
//        return sum;
//    }
//}

class Sports{
    private String name = "Generic Sports";
    public String getName(){
        return name;
    }
    public void getNumberOfTeamMembers(){
        System.out.println(this.name);
        System.out.println( "Each team has n players in " + this.name);
    }

}
class Soccer extends Sports{
    private String name = "Soccer Class";
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void getNumberOfTeamMembers(){
//        System.out.println(super.getName());
        super.getNumberOfTeamMembers();
        System.out.println(getName());
        System.out.println( "Each team has 11 players in " + getName() );
    }
}
