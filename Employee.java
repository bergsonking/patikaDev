import java.util.jar.Attributes.Name;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;
    int total;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.total=1;
    }
    double tax(){
        if(salary < 1000){
            return 0;
        }
        else{
            return this.salary * 0.03;
        }
    }
    double bonus(){
        if(workHours >=40){
            return((workHours-40)*30);
        }
        else return 0;
    }
    double raiseSalary(){
        int year = 2021-this.hireYear;
        if(year<10){
            return this.salary*0.05;
        }
        else if(year>9 && year<20){
            return this.salary*0.1;
        } 
        else return this.salary*0.15;       
        }

        public void toPrint(){
            System.out.println("========================");
            System.out.println("Adı: "+this.name);
            System.out.println("Maaşı: "+this.salary);
            System.out.println("Çalışma Saati: "+this.workHours);
            System.out.println("Başladığı Yıl: "+this.hireYear);
            System.out.println("Vergi: "+tax());
            System.out.println("Prim: "+bonus());
            System.out.println("Maaş Artışı: "+raiseSalary());
            System.out.println("Vergi ve bonuslar ile maaş: "+(this.salary-tax()+bonus()));
            System.out.println("Toplam maaş: "+(this.salary-tax()+bonus()+raiseSalary()));
            System.out.println("========================");
        }
    }

