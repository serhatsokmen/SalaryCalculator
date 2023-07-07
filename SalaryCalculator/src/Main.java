import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nameSurname;
        double s;
        int wh, hy;

        System.out.print("employee's name and surname : ");
        nameSurname = scan.nextLine();
        System.out.print("employee's salary : ");
        s = scan.nextDouble();
        System.out.print("weekly working hours : ");
        wh = scan.nextInt();
        System.out.print("the year of starting work : ");
        hy = scan.nextInt();

        Employee emp = new Employee(nameSurname,s,wh,hy);
        emp.showInfos();


    }
}