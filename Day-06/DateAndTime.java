// Modular Java Problems

// 1. Time Zones and ZonedDateTime
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class TimeZoneDisplay {
    public static void displayTimeZones() {
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("GMT: " + gmt);
        System.out.println("IST: " + ist);
        System.out.println("PST: " + pst);
    }
}

// 2. Date Arithmetic


class DateArithmetic {
    public static void performDateArithmetic(LocalDate inputDate) {
        LocalDate newDate = inputDate.plusDays(7).plusMonths(1).plusYears(2);
        newDate = newDate.minusWeeks(3);
        System.out.println("Final Date after arithmetic: " + newDate);
    }
}

// 3. Date Formatting


class DateFormatter {
    public static void formatCurrentDate() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Format 1: " + currentDate.format(format1));
        System.out.println("Format 2: " + currentDate.format(format2));
        System.out.println("Format 3: " + currentDate.format(format3));
    }
}

// 4. Date Comparison
class DateComparison {
    public static void compareDates(LocalDate date1, LocalDate date2) {
        if (date1.isBefore(date2)) {
            System.out.println("Date1 is before Date2");
        } else if (date1.isAfter(date2)) {
            System.out.println("Date1 is after Date2");
        } else {
            System.out.println("Date1 is equal to Date2");
        }
    }
}

// Main class to test all features
public class DateAndTime {
    public static void main(String[] args) {
        System.out.println("--- Time Zones ---");
        TimeZoneDisplay.displayTimeZones();

        System.out.println("\n--- Date Arithmetic ---");
        LocalDate inputDate = LocalDate.of(2023, 4, 18);
        DateArithmetic.performDateArithmetic(inputDate);

        System.out.println("\n--- Date Formatting ---");
        DateFormatter.formatCurrentDate();

        System.out.println("\n--- Date Comparison ---");
        LocalDate date1 = LocalDate.of(2023, 4, 18);
        LocalDate date2 = LocalDate.now();
        DateComparison.compareDates(date1, date2);
    }
}
