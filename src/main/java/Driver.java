import org.joda.time.LocalDate;
import sun.security.pkcs11.Secmod;

import java.util.ArrayList;

/**
 * Created by sean on 06/10/2016.
 */

public class Driver {

    public static void main(String[] args) {
        Student s1 = new Student("Sean", "Bolton", "13382146", new LocalDate(1995, 8, 24));
        Student s2 = new Student("Cian ", "Costelloe", "13345678", new LocalDate(1994, 9, 5));
        Student s3 = new Student("Jamie", "Clifford", "133432122", new LocalDate(1995, 20, 12));
        Student s4 = new Student("Colin", "Crowley", "133456723", new LocalDate(1996, 4, 1));
        Student s5 = new Student("Adam", "Wynne", "122345654", new LocalDate(1994, 27, 9));

        Module softwareEng = new Module("Software Engineering III", "CT417", new ArrayList<Student>());
        softwareEng.addStudent(s1);
        softwareEng.addStudent(s2);
        softwareEng.addStudent(s4);

        Module machineLearning = new Module("Machine Learninf & Data Mining", "CT475", new ArrayList<Student>());
        machineLearning.addStudent(s1);
        machineLearning.addStudent(s3);
        machineLearning.addStudent(s5);

        Module telecoms = new Module("Telecommunications Engineering", "ENG456", new ArrayList<Student>());
        telecoms.addStudent(s2);
        telecoms.addStudent(s3);
        telecoms.addStudent(s4);

        CourseProgramme bp4 = new CourseProgramme("Electronic & Computer Eng", new LocalDate(2016, 9, 2), new LocalDate(2017, 5, 1), new ArrayList<Module>());
        bp4.addModule(softwareEng);
        bp4.addModule(machineLearning);
        bp4.addModule(telecoms);



    }

}
