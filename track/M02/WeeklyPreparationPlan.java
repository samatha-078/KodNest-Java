public class  WeeklyPreparationPlan{
    public static void main(String[] args) {

        int java_prep_hrs = 2;
        int app_prep_hrs = 1;
        int num_of_days = 5;

        int weekly_java_prep_hrs = java_prep_hrs * num_of_days;
        int weekly_app_prep_hrs = app_prep_hrs * num_of_days;

        int total_prep = weekly_java_prep_hrs + weekly_app_prep_hrs;

        System.out.println("Java: " + weekly_java_prep_hrs);
        System.out.println("Aptitude: " + weekly_app_prep_hrs);
        System.out.println("Total: " + total_prep);
    }

}
    

