public class EmployeeWageBuilder {
    public static void main(String[] args) {
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        int PART_TIMR_HOUR = 4;
        int empWagePerDay = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        switch ((int) empCheck) {
            case 1 -> {
                empWagePerDay = WAGE_PER_HOUR * FULL_DAY_HOUR;
                System.out.println("Employee is full time present and his wage per day is : " + empWagePerDay);
            }
            case 2 -> {
                empWagePerDay = WAGE_PER_HOUR * PART_TIMR_HOUR;
                System.out.println("Employee is part time present and his wage per day is : " + empWagePerDay);
            }
            default -> System.out.println("Employee is Absent and his wage per day is : " + empWagePerDay);
        }
    }
}