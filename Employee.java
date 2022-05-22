public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double tax(){
        if (this.salary <1000){
            return 0;
        }
        else
            return salary * 0.03;
    }
    int bonus() {
        int overWork=0;
        overWork=workHours-40;
        if (this.workHours>40){

            return overWork*30;
        }
        else
           return overWork=0;


    }
    double raiseSalary(){
        int year = 2021, totalYear;
        totalYear=year - hireYear;
        if (totalYear<10 && totalYear>=0){
          return this.salary*0.05;    
        } else if (totalYear>=10 && totalYear<20) {
            return this.salary*0.1;
            }
        else if (totalYear>20)
            return salary*0.15;
        else
            return 0;
    }
    void run(){
        System.out.println("Çalışanın Adı :" + this.name);
        System.out.println("Maaşı :" + this.salary);
        System.out.println("Çalışma Saati :" + this.workHours);
        System.out.println("Başlangıc Yılı : " + this.hireYear);
        System.out.println("Maaşınızın vergisi :" + tax());
        System.out.println("Bonus :" + bonus());
        double raiseSalary=raiseSalary();
        System.out.println("Maaş Artışı :" + raiseSalary);
        double totalSalaryWT = salary + bonus() - tax() ;
            System.out.println("Vergi ve Bonuslarla Maaş :" + totalSalaryWT);
        System.out.println("Toplam Maaş :" + (salary + raiseSalary));
    }
}
