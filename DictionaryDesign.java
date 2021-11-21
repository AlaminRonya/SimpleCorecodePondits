import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
class Dictionary{
    private  TreeMap<Character, Integer> dictionary = new TreeMap<>();
    public Dictionary(){
    }
    public void insertKey(String s){
        for (int i =0; i<s.length(); i++){
            Character c = s.charAt(i);
            checkDictionaryKey(c);
        }
    }

    private void checkDictionaryKey(Character c) {
        boolean k=false;
        char upperCase = Character.toUpperCase(c);
        for (Map.Entry<Character, Integer> entry: dictionary.entrySet()){
            if (entry.getKey().equals(upperCase)){
                int i = entry.getValue() + 1;
                entry.setValue(i);
                k = true;
            }
        }
        if (!k){
            dictionary.put(upperCase,1);
        }
    }
    public void show(){
        for (Map.Entry<Character, Integer> entry: dictionary.entrySet()){
            System.out.println(entry.getKey() + ": "+ entry.getValue());
        }
        System.out.println();
    }
    public Boolean compareToObject(Dictionary d2){
//        int i = 0;
//        for (Map.Entry<Character, Integer> entry: dictionary.entrySet()){
////            System.out.println("aa   :=> "+entry.getKey() + ": "+ entry.getValue());
//            for (Map.Entry<Character, Integer> entry1: d2.dictionary.entrySet()){
////                System.out.println(entry1.getKey() + ": "+ entry1.getValue());
//                if (entry.getKey().equals(entry1.getKey()) && entry.getValue().equals(entry1.getValue())){
//                    i=1;
//                    break;
//                }else {
//                    i=0;
//                }
//            }
//        }
//        if (i==1){
//            return true;
//        }
//        return false;

        for (Character s: dictionary.keySet()){
            if (!Objects.equals(dictionary.get(s), d2.dictionary.get(s))){
//                System.out.println(s+" "+dictionary.get(s));
                return false;
            }


        }
//        System.out.println(d2.dictionary);
        return true;
    }




}
public class DictionaryDesign {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine().trim();
        Dictionary dictionary1 = new Dictionary();
        dictionary1.insertKey(s);
        Dictionary dictionary2 = new Dictionary();
        String s1 = bufferedReader.readLine().trim();
        dictionary2.insertKey(s1);
        if (s.length()==s1.length()){
            System.out.println("Anagrams");
        }else {
            Boolean b = dictionary1.compareToObject(dictionary2);
            if (!b){
                System.out.println("Not Anagrams");
            }else {
                System.out.println("Anagrams");
            }
        }



    }


}
