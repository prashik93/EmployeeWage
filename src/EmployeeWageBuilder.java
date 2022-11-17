public class EmployeeWageBuilder {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        int empWagePerDay = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            empWagePerDay = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee is Present and his wage per day is : " + empWagePerDay);
        } else {
            System.out.println("Employee is Absent and his wage per day is : " + empWagePerDay);
        }
    }
}