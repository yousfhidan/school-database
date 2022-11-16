import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.*;

import static java.nio.file.Files.find;

public class v {





       Controller c;

    Scanner in;
        public v() throws FileNotFoundException {
            c=new Controller();
           in= new Scanner(System.in);
in.nextInt();


        }
        public void start() throws FileNotFoundException {

            System.out.println("____________________________________________");
            System.out.println("    Student Registration System");
            System.out.println("____________________________________________");
 while (true){
                System.out.println("1: Add New Student \t\t2:View All Students\n" +
                        "3:Search For Student\t\t0:Exit");
                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        add();
                        break;
                    case 2:
                        v();
                        break;
                    case 3:
                        find();
                        break;
                    case 0:
                        c.writeStudentFile();
                        System.exit(0);
                }


            }
       while ()
        }
}



