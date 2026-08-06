public class Report {
     
    public static void main(String[] args) {

        int Completed_topics = 17;
        int Total_topics = 20;
        int Daily_learning_hours = 3;
        int Learning_days = 5;

        int remaining_topics = Total_topics - Completed_topics;
        int weekly_learning_hrs = Daily_learning_hours * Learning_days;

        double pro_per = (double) Completed_topics * 100 / Total_topics;

        System.out.println("Completed Topics: " + Completed_topics);
        System.out.println("Remaining Topics: " + remaining_topics);
        System.out.println("Weekly Learning Hours: " + weekly_learning_hrs);
        System.out.println("Progress Percentage: " + pro_per);
    }
}

