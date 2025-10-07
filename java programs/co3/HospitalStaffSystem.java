// HospitalStaffSystem.java

abstract class Staff {
    private double baseSalary;
    private int extraHours;

    public Staff(double baseSalary, int extraHours) {
        this.baseSalary = baseSalary;
        this.extraHours = extraHours;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getExtraHours() {
        return extraHours;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }

    public abstract double calculateSalary();

    public void displayBasicSalaryInfo() {
        System.out.printf("Base Salary: $%.2f, Extra Hours: %d\n", baseSalary, extraHours);
    }
}

class Doctor extends Staff {
    private double hourlyRateForExtraHours;

    public Doctor(double baseSalary, int extraHours, double hourlyRateForExtraHours) {
        super(baseSalary, extraHours);
        this.hourlyRateForExtraHours = hourlyRateForExtraHours;
    }

    public double getHourlyRateForExtraHours() {
        return hourlyRateForExtraHours;
    }

    public void setHourlyRateForExtraHours(double hourlyRateForExtraHours) {
        this.hourlyRateForExtraHours = hourlyRateForExtraHours;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (getExtraHours() * hourlyRateForExtraHours);
    }

    public void displayDetails() {
        displayBasicSalaryInfo();
        System.out.printf("Total Salary (Doctor): $%.2f\n", calculateSalary());
    }
}

class Nurse extends Staff {
    private double bonusPerExtraHour;

    public Nurse(double baseSalary, int extraHours, double bonusPerExtraHour) {
        super(baseSalary, extraHours);
        this.bonusPerExtraHour = bonusPerExtraHour;
    }

    public double getBonusPerExtraHour() {
        return bonusPerExtraHour;
    }

    public void setBonusPerExtraHour(double bonusPerExtraHour) {
        this.bonusPerExtraHour = bonusPerExtraHour;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (getExtraHours() * bonusPerExtraHour);
    }

    public void displayDetails() {
        displayBasicSalaryInfo();
        System.out.printf("Total Salary (Nurse): $%.2f\n", calculateSalary());
    }
}

class AdminStaff extends Staff {
    private double overtimeRate;

    public AdminStaff(double baseSalary, int extraHours, double overtimeRate) {
        super(baseSalary, extraHours);
        this.overtimeRate = overtimeRate;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (getExtraHours() * overtimeRate);
    }

    public void displayDetails() {
        displayBasicSalaryInfo();
        System.out.printf("Total Salary (Admin Staff): $%.2f\n", calculateSalary());
    }
}

public class HospitalStaffSystem {
    public static void main(String[] args) {
        System.out.println("--- Doctor's Salary Calculation ---");
        Doctor doc1 = new Doctor(8000.0, 10, 75.0); // Encapsulation.
        doc1.displayDetails();
        System.out.println();

        System.out.println("--- Nurse's Salary Calculation ---");
        Nurse nurse1 = new Nurse(3000.0, 20, 30.0);
        nurse1.displayDetails();
        System.out.println();

        System.out.println("--- Admin Staff's Salary Calculation ---");
        AdminStaff admin1 = new AdminStaff(2000.0, 15, 25.0);
        admin1.displayDetails();
        System.out.println();

        System.out.println("--- Polymorphism with Staff reference ---");
        Staff[] hospitalStaff = {
            new Doctor(9000.0, 5, 80.0),
            new Nurse(3200.0, 18, 32.0),
            new AdminStaff(2100.0, 12, 26.0)
        };

        for (Staff staffMember : hospitalStaff) {
            staffMember.displayBasicSalaryInfo();
            System.out.printf("Calculated Salary: $%.2f\n", staffMember.calculateSalary()); // Polymorphism.
            System.out.println();
        }
    }
}

/*
Sample Input/Output:

--- Doctor's Salary Calculation ---
Base Salary: $8000.00, Extra Hours: 10
Total Salary (Doctor): $8750.00

--- Nurse's Salary Calculation ---
Base Salary: $3000.00, Extra Hours: 20
Total Salary (Nurse): $3600.00

--- Admin Staff's Salary Calculation ---
Base Salary: $2000.00, Extra Hours: 15
Total Salary (Admin Staff): $2375.00

--- Polymorphism with Staff reference ---
Base Salary: $9000.00, Extra Hours: 5
Calculated Salary: $9400.00

Base Salary: $3200.00, Extra Hours: 18
Calculated Salary: $3776.00

Base Salary: $2100.00, Extra Hours: 12
Calculated Salary: $2412.00
*/
