import java.util.Arrays;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
//        String s = "Aabab   Ooooo  12.12   12.0 12.kkg    A Ubaba a   tt456  iiigig ? jhhf";
//        String s = "92.158.1.34";
//        String s = "aaab      asdsfgg,mm?hgh.hhhk             ?";
        String s = "www.alamin@gmail.com";
//        Pattern pattern = Pattern.compile("\\S+"); //space ignore Capital Letter of S
//        Pattern pattern = Pattern.compile("[a-zA-Z]+[0-9]+");
//        Pattern pattern = Pattern.compile("[0-9]+\\.[0-9]+");
//        Pattern pattern = Pattern.compile("[AEIOU][a-zA-Z]*");
//        Pattern pattern = Pattern.compile("[a-zA-Z]+[aeiou]");
//        Pattern pattern = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$");
//        Pattern pattern = Pattern.compile("[a]+");
//        Matcher matcher = pattern.matcher(s);
//        while (matcher.find()){
//            System.out.println(matcher.group());
//            System.out.println(matcher.start()+"......"+ matcher.end());
//        }
//        Pattern pattern = Pattern.compile("[\\s,?.]+");
        Pattern pattern = Pattern.compile("\\.");
        String[] matcher = pattern.split(s);
        Arrays.stream(matcher).forEach(System.out::println);



    }
}
