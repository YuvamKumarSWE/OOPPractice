public class Month {

    protected int monthNumber;

    public Month() {
        this.monthNumber = 1;
    }

    public Month(String month) {
        try {
            this.monthNumber = Months.valueOf(month.toUpperCase()).getMonthNumber();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid month name. Defaulting to January.");
            this.monthNumber = 1;
        }
    }

    public Month(int month){
        if (month < 1 || month > 12){
            this.monthNumber = 1;
        }
        else{
            this.monthNumber = month;
        }
    }

    // Enum for months
    public enum Months {
        JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4),
        MAY(5), JUNE(6), JULY(7), AUGUST(8),
        SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);

        private final int monthNumber;

        Months(int monthNumber) {
            this.monthNumber = monthNumber;
        }

        public int getMonthNumber() {
            return monthNumber;
        }
    }

    public int getMonthNumber(){
        return monthNumber;
    }

    public void setMonthNumber(int month){
        if (month < 1 || month > 12){
            this.monthNumber = 1;
        }
        else{
            this.monthNumber = month;
        }
    }



}