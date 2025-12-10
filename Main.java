import java.util.ArrayList;
import java.util.Scanner;

class  Student{
    int Mark;
    String Name;
    Student(int Mark,String Name){
        this.Mark=Mark;
        this.Name=Name;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> Students=new ArrayList<>();
        System.out.print("ENTER THE NUMBER OF STUDENTS:");
        int n= sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <n ; i++) {
            System.out.print("ENTER THE NAME OF STUDENT"+(i+1)+" :");
           String Names=sc.nextLine();
            System.out.print("ENTER THE MARK OF STUDENT"+(i+1)+" :");
            int Marks=sc.nextInt();
            sc.nextLine();
              Students.add(new Student(Marks, Names));
        }
        System.out.println("Student Grade--------");
        for (Student s:Students){
            System.out.println(s.Name+":"+getGrade(s.Mark));
        }

    }
    public static String getGrade(int Marks){
        if(Marks>=90) return "A+";
        else if (Marks>=80) return "A";
        else if (Marks>=70) return "B";
        else if (Marks>=60) return "C";
        else if (Marks>=50)return "D";
        else return "F";

    }
}