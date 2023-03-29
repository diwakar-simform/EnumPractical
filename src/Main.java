enum Days {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

public class Main {

    public static void main(String[] args) {
        System.out.println("We have the following enum constants :-");
        for (Days d : Days.values()){
            System.out.println(d);

        }
    }

}