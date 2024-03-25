import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;

public class Main {
    public static void main(String[] args) {

        HRManager hr = new HRManager(1, "hr", 20);

        System.out.println(hr);

        JuniorDeveloper jr1 = new JuniorDeveloper(1, "Muhsin", 40);

        hr.addEmployee(jr1, 0);
        System.out.println(hr.getJuniors()[0].getName());


    }
}