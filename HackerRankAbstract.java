import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerRankAbstract {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine().trim();
        Tittle tittle = new Tittle();
        tittle.setTitle(s);
        System.out.println("The title is: "+tittle.getTitle());
    }
}

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class Tittle extends Book{
    @Override
    void setTitle(String s) {
        title = s;
    }
}
