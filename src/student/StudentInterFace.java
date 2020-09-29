package student;

import java.util.Scanner;

public class StudentInterFace {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();
        Scanner scan = new Scanner(System.in);

        String name;
        int score;
         while(true){
        //Input first Student's data
        System.out.println("Enter name for first student (min 1 letter)\n");
        name = scan.nextLine();
        s1.setName(name);
        for (int i = 1; i <= 3; i++) {
            System.out.format("Enter test score %d for %s> ", i, s1.getName());
            score = scan.nextInt();
            s1.setScore(i, score);
          
        }
        String errormsg=s1.validateData(); 
        if(errormsg==null) {
              break;
          }
          else {
              System.out.println(errormsg);
              scan.nextLine();
          }

        }
        scan.nextLine();
        System.out.println("\n----------------------------\n");

        System.out.println("Enter name for second student (min 1 letter)");
        name = scan.nextLine();
        s2.setName(name);
        for (int i = 1; i <= 3; i++) {
            System.out.format("Enter test score %d for %s> ", i, s2.getName());
            score = scan.nextInt();
            s2.setScore(i, score);
        }

        System.out.println("\n----------------------------\n");
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("\n----------------------------\n");
        
       

        int s1_high = s1.getHighScore();
        int s2_high = s2.getHighScore();
        double s1_avg = s1.getAverage();
        double s2_avg = s2.getAverage();

        //printing out highscores
        if (s1_high > s2_high) {
            System.out.format("%s's highest mark of %d was higher that %s highest mark of %d", s1.getName(), s1_high, s2.getName(), s2_high);
        } else if (s2_high > s1_high) {
            System.out.format("%s's highest mark of %d was higher that %s highest mark of %d", s2.getName(), s2_high, s1.getName(), s1_high);
        } else {
            System.out.format("Student's top marks were both %d", s1_high);
        }
        
        System.out.println("\n----------------------------\n");
        //printing out averages
        if (s1_avg > s2_avg) {
            System.out.format("%s's average of %.2f was higher that %s average of %.2f", s1.getName(), s1_avg, s2.getName(), s2_avg);
        } else if (s2_avg > s1_avg) {
            System.out.format("%s's average of %.2f was higher that %s average of %.2f", s2.getName(), s2_avg, s1.getName(), s1_avg);
        } else {
            System.out.format("Student's top marks were both %.2f", s2_avg);
        }
        
        
    }
    

}
