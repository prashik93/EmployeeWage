public class EmployeeWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;
    public static final int NUMBER_OF_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;
    public static void main(String[] args) {
        int totalWorkingHours = 0;
        int day = 0;
        while ((day < NUMBER_OF_WORKING_DAYS) && (totalWorkingHours <= MAX_WORKING_HOURS)) {
            day++;
            int workingHours = 0;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case IS_FULL_TIME ->
                    workingHours = (workingHours + FULL_DAY_HOUR);
                case IS_PART_TIME ->
                    workingHours = (workingHours + PART_TIME_HOUR);
                default ->
                    workingHours = 0;
            }
            totalWorkingHours = totalWorkingHours + workingHours;
            System.out.println("Total Working Days are : " + day + " And Total Working Hours are : " + totalWorkingHours);
        }
        int wagesForAMonth = (totalWorkingHours * WAGE_PER_HOUR);
        System.out.println("Wages for a month is : " + wagesForAMonth);
    }
}