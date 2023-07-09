public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
    if (salary < 1000) {
        return 0;
    }
    else {
        return salary*0.03;
    }
    }

    double bonus(){
        if (workHours > 40){
            int extraHours = workHours - 40;
            return extraHours*30;
        }
        else {
            return 0;
        }
    }
    void raiseSalary(){
        if(2021 -hireYear < 10){
            salary*=1.05;
        }
        else if((2021 - hireYear < 20) && (2021 - hireYear > 9) ){
            salary*=1.1;
        }
        else {
            salary*=1.15;
        }

    }

    public String toString(){
        return " \n Adı: " + name + "\n Başlangıç Yılı: " + hireYear+"\n Haftalık Çalışma Saati: " + workHours +"\n Vergi:"+tax()+"\n Bonus:"+bonus()+ "\n Maaşı: " + salary ;
    }





}


