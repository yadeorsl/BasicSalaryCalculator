public class Employee {
       static String name;
       static double salary;
       static int workHours;
      static int hireYear;
       Employee(String name,double salary,int workHours,int hireYear){
    	   this.name=name;
    	   this.salary=salary;
    	   this.workHours=workHours;
    	   this.hireYear=hireYear;
       }
        double tax(double salary) {
        	salary=this.salary;
        	double taxx=0;
        	if(salary>1000) {
        		taxx=salary*0.03;
        	}else {
        		taxx=0;
        	}
        	return taxx;
        }
        double bonus(int workhours) {
        	this.workHours=workHours;
        	if(workHours>40) {
        		return (workhours-40)*30;
        	}
        	return 0;
        }
        double raiseSalary(int hireYear) {
        	this.hireYear=hireYear;
        	this.salary=salary;
        	double incAmount=0;
        	if(2021-hireYear<10) {
        		incAmount=salary*0.05;
        	}if((2021-hireYear>9)&&(2021-hireYear<20)) {
        		incAmount=salary*0.1;
        	}if(2021-hireYear>19) {
        		incAmount=salary*0.15;
        	}
        	return incAmount;
        }
        public String toString() {
        	double sonM=Employee.salary+bonus(Employee.workHours)+raiseSalary(Employee.workHours)-tax(Employee.salary);
        	return "Employee Information"+ "\n"+
            "Name:"+Employee.name+"\n"+
        	"Salary"+ Employee.salary+"\n"+
            "Tax:"+ tax(Employee.salary)+"\n"+
            "Bonus:"+ bonus(Employee.workHours)+"\n"+
            "Increase Amount:" + raiseSalary(Employee.workHours)+"\n"+
            "Total Salary:"+ sonM ;
        	
        }
        
        
       
     /*   tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
       Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
       Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
       bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
       raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
       Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
       Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
       Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
       toString() : Çalışana ait bilgileri ekrana bastıracaktır.*/
}
