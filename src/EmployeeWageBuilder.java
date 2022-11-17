public class EmployeeWageBuilder {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        int PART_TIMR_HOUR = 4;
        int empWagePerDay = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_FULL_TIME) {
            empWagePerDay = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee is full time present and his wage per day is : " + empWagePerDay);
        } else if (empCheck == IS_PART_TIME) {
            empWagePerDay = WAGE_PER_HOUR * PART_TIMR_HOUR;
            System.out.println("Employee is part time present and his wage per day is : " + empWagePerDay);
        } else {
            System.out.println("Employee is Absent and his wage per day is : " + empWagePerDay);
        }
    }
}