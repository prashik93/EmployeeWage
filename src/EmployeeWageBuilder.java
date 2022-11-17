public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //CONSTANTS
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        int PART_TIMR_HOUR = 4;
        int NUMBER_OF_WORKING_DAYS = 20;
        int MAX_WORKING_HOURS = 100;

        //VARIABLES
        int fullDayPresent = 0;
        int partTimePresent = 0;
        int absent = 0;
        int totalWorkingHours = 0;
        int wagesForAMonth = 0;

        for (int day = 0; ((day < NUMBER_OF_WORKING_DAYS) && (totalWorkingHours < MAX_WORKING_HOURS)); day++) {
            int workingHours = 0;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case 1 -> {
                    workingHours = (workingHours + FULL_DAY_HOUR);
                    fullDayPresent++;
                }
                case 2 -> {
                    workingHours = (workingHours + PART_TIMR_HOUR);
                    partTimePresent++;
                }
                default -> {
                    workingHours = 0;
                    absent++;
                }
            }
            totalWorkingHours = totalWorkingHours + workingHours;
        }
        System.out.println("Full Day Present : " + fullDayPresent + " Part Time Present : " + partTimePresent + " Absent : " + absent);
        System.out.println("Working Hours : " + totalWorkingHours);
        wagesForAMonth = (totalWorkingHours * WAGE_PER_HOUR);
        System.out.println("Wages for a month is : " + wagesForAMonth);
    }
}