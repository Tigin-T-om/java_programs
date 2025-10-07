// TimeAddition.java

// Class Time represents a time with hours and minutes.
class Time {
    int hours;
    int minutes;

    // Constructor to initialize hours and minutes.
    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    // Method to add another Time object to this Time object.
    // It returns a new Time object with the summed time.
    public Time addTime(Time t) {
        int newMinutes = this.minutes + t.minutes;
        int newHours = this.hours + t.hours + (newMinutes / 60);
        newMinutes %= 60;
        newHours %= 24; // Handle hours overflowing a day
        return new Time(newHours, newMinutes);
    }

    // Method to display the time.
    public void displayTime() {
        System.out.printf("%02d:%02d\n", hours, minutes);
    }
}

public class TimeAddition {
    public static void main(String[] args) {
        // Create two Time objects.
        System.out.println("Creating Time 1 (10:30):");
        Time time1 = new Time(10, 30);
        time1.displayTime();

        System.out.println("Creating Time 2 (02:45):");
        Time time2 = new Time(2, 45);
        time2.displayTime();
        System.out.println();

        // Add the two time objects.
        System.out.println("Adding Time 1 and Time 2:");
        Time sumTime1 = time1.addTime(time2);
        sumTime1.displayTime(); // Expected: 13:15
        System.out.println();

        System.out.println("Creating Time 3 (23:00):");
        Time time3 = new Time(23, 0);
        time3.displayTime();

        System.out.println("Creating Time 4 (02:30):");
        Time time4 = new Time(2, 30);
        time4.displayTime();
        System.out.println();

        // Add time3 and time4, demonstrating hour overflow.
        System.out.println("Adding Time 3 and Time 4 (demonstrating day overflow):");
        Time sumTime2 = time3.addTime(time4);
        sumTime2.displayTime(); // Expected: 01:30 (23:00 + 02:30 = 25:30 -> 01:30 next day)
    }
}

/*
Sample Input/Output:

Creating Time 1 (10:30):
10:30
Creating Time 2 (02:45):
02:45

Adding Time 1 and Time 2:
13:15

Creating Time 3 (23:00):
23:00
Creating Time 4 (02:30):
02:30

Adding Time 3 and Time 4 (demonstrating day overflow):
01:30
*/
