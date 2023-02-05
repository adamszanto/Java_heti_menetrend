public class FebruaryMonth {
    private final int[] februaryMonth = new int[28];

    public FebruaryMonth() {
        for(int i = 0; i < 28; i++) {
            this.februaryMonth[i] = (int)((Math.random() * (10 - -15) + -10));
        }
    }

    // Print the elements of the array next to each other on the console!
    public void printFebruary() {
        for(int i = 0; i < 28; i++) {
            System.out.print(this.februaryMonth[i] + " ");
        }
        System.out.println();
    }

    // 1/a. What is the lowest average temperature in February, only counting Saturdays?
    public void lowestSaturday() {
        int saturday = 2;
        int lowestSaturday = februaryMonth[saturday];

        for(int i = saturday; i < 28; i = i+7) {
            if(februaryMonth[i] < lowestSaturday) {
                lowestSaturday = februaryMonth[i];
            }
            //    System.out.println(februaryMonth[i]);
        }

        System.out.println("Lowest saturday: " + lowestSaturday);
    }

    // 1/b. What is the average of the February average temperature data?

    public void averageFebruary() {
        double sum = 0;

        //    System.out.println(this.februaryMonth.length);
        for(int i = 0; i < this.februaryMonth.length; i++) {
            sum += februaryMonth[i];
        }

        //    System.out.println(sum);
        System.out.format("Average: %.3f%n", sum/this.februaryMonth.length);
    }

    // 1/c. What is the average temperature data of the weekdays!

    public void averageWeekdays() {
        double sum = 0;
        int saturday = 2;
        int sunday = 3;


        //    System.out.println(this.februaryMonth.length);
        for(int i = 0; i < this.februaryMonth.length; i++) {
            if(i == saturday) {
                saturday+=7;
            }
            else if(i == sunday) {
                sunday+=7;
            } else {
                sum+=februaryMonth[i];
            }
        }
        System.out.format("Average: %.3f%n", sum/this.februaryMonth.length);
    }

    // 1/d. What day (Monday ... Sunday) does the highest average temperatue in February fall on?
    public void highestFebruary() {
        int highest = februaryMonth[0];
        int highestDay = 0;

        for(int i = 0; i < februaryMonth.length; i++) {
            if(februaryMonth[i] > highest) {
                highest = februaryMonth[i];
                highestDay = i;
            }
        }

        String[] daysOfWeek = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};


        // 2. megoldÃ¡s, de ebben az esetben csÃ¼tÃ¶rtÃ¶kkel kell kezdeni a daysOfWeek

        System.out.println("Highest: " + highest);
        System.out.println("Day : " + highestDay);

        System.out.println("The highest day is " + daysOfWeek[highestDay%7]);
    }

}