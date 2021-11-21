import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class HackerRangInheritance {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine().trim();
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int[] arr = new int[n];
        String number = bufferedReader.readLine().trim();
//        for (int  i = 0; i<n ; i++){
//            arr[i] = Integer.parseInt(bufferedReader.readLine().trim());
//        }
        Pattern p = Pattern.compile("\\s+");
        String[] namesId = p.split(s);
         String[] arr1 = p.split(number);
         for (int i =0; i<n ; i++){
             arr[i] = Integer.parseInt(arr1[i]);
         }
        Student student = new Student(namesId[0], namesId[1], namesId[2], arr);
        student.show();
//        System.out.println(person);

    }
}
class Person{
    private String firstName;
    private String lastName;
    private String idNumber;
    private int score;

    public Person(String firstName, String lastName, String idNumber, int[] score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        DynamicArray1 dynamicArray1 = new DynamicArray1();
        for (Integer item : score){
            dynamicArray1.addItem(item);
        }
        this.score = dynamicArray1.getSum();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int[] score) {
        DynamicArray1 dynamicArray1 = new DynamicArray1();
        for (Integer item : score){
            dynamicArray1.addItem(item);
        }
        this.score = dynamicArray1.getSum();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", score=" + score +
                '}';
    }
    public void show(){
        System.out.println("Name: "+getLastName()+", "+getFirstName());
        System.out.println("ID: "+getIdNumber());
    }
}



class DynamicArray1 {
    private int[] theArray;
    private int numItems = 0;

    public DynamicArray1() {
        theArray = new int[1];
        numItems = 0;
    }

    public void addItem(int item) {
        if (numItems == theArray.length) {
            growArray();
        }
        theArray[numItems++] = item;
    }

    private void growArray() {
        int[] tempArray = new int[theArray.length + 1];
        if (numItems >= 0) System.arraycopy(theArray, 0, tempArray, 0, numItems);
        theArray = tempArray;
    }

    public int getSum() {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < numItems; i++) {
            sum += theArray[i];
        }
        return sum/numItems;
    }

    public int size() {
        return theArray.length;
    }
}

class Student extends Person{
    private char grade;

    public Student(String firstName, String lastName, String idNumber, int[] score) {
        super(firstName, lastName, idNumber, score);
        int n = super.getScore();
        getGrade(n);

    }


    private void getGrade(int n) {
        if (100>=n && n>=90){
            grade = 'O';
        }else if(90>n && n>=80){
            grade = 'E';
        }else if(80>n && n>=70){
            grade = 'A';
        }else if(70>n && n>=55){
            grade = 'P';
        }else if(55>n && n>=40){
            grade = 'D';
        }else{
            grade = 'T';
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                '}'+super.toString();
    }
    public void show(){
        super.show();
        System.out.println("Grade: "+grade);

    }
}