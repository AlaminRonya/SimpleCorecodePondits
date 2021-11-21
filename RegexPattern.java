import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
    public static void main(String[] args) {
        String str = "Java     r,e!v?e.r_          se";
        String revStr ="";
        Pattern compile = Pattern.compile("[\\s,?.!_]+");
//        Pattern compile = Pattern.compile("\\w");
        String[] split = compile.split(str);
        for (int i = split.length-1; i>=0; i--){
            System.out.print(split[i]+" ");
        }
        System.out.println();
//        for (String x: split){
//            System.out.println(x);
//        }

        Pattern pattern = Pattern.compile("\\d+");
        String s = "13234yy565";
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            String group = matcher.group();
            System.out.println(group);
        }
        System.out.println("kkk");

        String ss= "I love Java Programming.";
        Pattern pattern1;
        pattern1 = Pattern.compile("\\b*");
        String[] split1 = pattern1.split(ss);
        for (int i = split1.length-1; i>=0; i--){
            System.out.print(split1[i]);
        }
        System.out.println();

    }
}
