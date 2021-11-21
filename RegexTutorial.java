import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTutorial {
    public static void main(String[] args) {
        String s="abhjjg jhjhjhdhj bkjlkjsg cdhgghgeg cdhgghgegggg";
        Pattern sp = Pattern.compile("\\s+");
        String[] str = sp.split(s);
        Pattern p = Pattern.compile("^[abc][a-zA-Z]*[g]$");

        for(String s1 : str){
//            System.out.println(s1);
            Matcher m = p.matcher(s1);
            if (m.find() && m.group().equals(s1)){
                System.out.println(s1);
            }
        }

    }
}
