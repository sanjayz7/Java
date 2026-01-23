// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.time.*;
class Main {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(2005,8,22);
        LocalDate today =LocalDate.now();
        Period age = Period.between(dob,today);
        System.out.println("Age :"+age.getYears()+" years ,"+age.getMonths()+" months,"+age.getDays()+" days");
    }
}