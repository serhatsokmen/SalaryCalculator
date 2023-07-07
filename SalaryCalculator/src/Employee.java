public class Employee {

    public String name;
    public double salary;
    public int workHours;
    public int hireYear;



    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


    }

    public double tax() {
        if(this.salary < 1000) {
            return this.salary;
        }
        else {
            if(this.salary >= 1000) {
                return this.salary - (this.salary * 0.3);
            }
        }
        return 0.0;
    }

    public int bonus() {
        if(this.workHours > 40 ) {
            return (this.workHours - 40) * 30;
        }
        else {
            return this.workHours;
        }

    }


    public double raiseSalary() {
        int year = 2021;
        if(year - this.hireYear < 10) {
            return this.salary + (this.salary * 0.05);
        }

        else if(year - this.hireYear > 9 && year - this.hireYear < 20) {
            return this.salary + (this.salary * 0.1);
        }

        else if(year - this.hireYear > 19) {
            return this.salary + (this.salary * 0.15);
        }
        return 0.0;
    }

     public void showInfos() {
         System.out.println("employee's name and surname : "+this.name);
         System.out.println("employee's salary : "+this.salary);
         System.out.println("weekly working hours : "+this.workHours);
         System.out.println("the year of starting work : "+this.hireYear);
         System.out.println("tax : "+tax());
         System.out.println("bonus : "+bonus());
         System.out.println("salary increase : "+raiseSalary());
         System.out.println("total salary : "+(this.salary + bonus() + raiseSalary() - tax()));
     }


}
