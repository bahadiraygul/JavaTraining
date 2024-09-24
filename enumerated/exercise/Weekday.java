package enumerated.exercise;

public class Weekday {
    public static void main(String[] args) {

        System.out.println("Saturday is holiday: " + Weekdays.SATURDAY.isHoliday());
        System.out.println("Firday is weekday: " + Weekdays.FRIDAY.isWeekDay());
        Weekdays.TUESDAY.whichIsGreater(Weekdays.FRIDAY);
    }

    enum Weekdays {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY,
        SUNDAY;

        boolean isWeekDay(){
            return this != SATURDAY && this != SUNDAY;
        }

        boolean isHoliday(){
            return this == SATURDAY || this == SUNDAY;
        }

        void whichIsGreater(Weekdays weekday){
            if(this.ordinal() < this.ordinal()){
                System.out.println("Before " +   weekday);
            }else{
                System.out.println("After " + weekday);
            }
        }
    }
}
