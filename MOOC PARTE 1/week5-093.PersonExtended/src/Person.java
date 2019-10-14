
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
        public Person(String name) {
        this.name = name;
        this.birthday = getFechaReal();
    }
    
    
    public MyDate getFechaReal() {

        int dia = Calendar.getInstance().get(Calendar.DATE);
        int mes = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int año = Calendar.getInstance().get(Calendar.YEAR);
        MyDate fechaReal=new MyDate(dia,mes,año);
        return fechaReal;
    }

    public int age() {
// calculate the age based on the birthday and the current day
       MyDate fechaReal=getFechaReal();
        return birthday.differneceInYears(fechaReal);
    }

    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
      
        return birthday.earlier(compared.birthday);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
