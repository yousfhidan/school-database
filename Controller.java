import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Controller {
    private student[]all;
    private int numOfStudent;

    public Controller() throws FileNotFoundException {
        all=new student[10];
        numOfStudent=0;
        readStudentFile();
    }
    public boolean addNewStudent(int id, String fName, String lName, String Educational_level)
    {
        if (numOfStudent<all.length)
        {

            student s= new student(id,fName,lName,Educational_level);
            all[numOfStudent]=s;
            numOfStudent++;
            student.counter++;
            return true;}
        else return false;
    }
    public student[] viewAllStudent()
    {
        return all;
    }
    public student searchForStudent(int id )
    {
        int i=0;
        boolean found=false;
        while (!found&&i<all.length)
        {
            if (all[i]!=null)
            {
                if (all[i].getId()==id)
                    found=true;
                else i++;
            }
            else
                i++;
        }
        if (i<all.length)
            return all
                    [i];
        else
            return null;
    }
    public boolean checkForDuplicate(student s)
    {
        for (int i = 0; i <numOfStudent ; i++) {
            if (all[i].equals(s))
                return true;

        }
        return false;
    }
    public void readStudentFile() throws FileNotFoundException {
        Scanner in= new Scanner(new File("A:\\studentFile.txt"));
        while (in.hasNextLine())
        {
            int i=in.nextInt();
            String f=in.next();
            String l=in.next();
            String y=in.next();
            addNewStudent(i,f,l,y);
        }
        in.close();
    }
    public void writeStudentFile() throws FileNotFoundException {
        PrintWriter w= new PrintWriter(new File("A:\\studentFile.txt"));
        for (int i = 0; i <numOfStudent ; i++) {
            w.write(all[i].getId()+" "+all[i].getfName()+" "+all[i].getlName()+" "+all[i].getEducational_level()+"\n");

        }
        w.close();
    }

}
