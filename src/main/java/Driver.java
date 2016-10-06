import org.joda.time.LocalDate;

/**
 * Created by sean on 06/10/2016.
 */

public class Driver {

    public static void main(String[] args) {
        Student s1 = new Student("Sean", "Bolton", "13382146", new LocalDate(1995, 8, 24));

        System.out.print(s1.getAge());
    }

}
