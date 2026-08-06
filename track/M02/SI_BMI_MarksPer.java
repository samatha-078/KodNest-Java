public class SI_BMI_MarksPer {
     public static void main(String[] args) {

        double Principle = 10000.0;
        float rate = 6.5f;
        float time = 2.0f;
        double weight = 72.0;
        double height = 1.8;
        float sub_marks = 100.0f;

        int s1marks = 78;
        int s2marks = 84;
        int s3marks = 69;
        int s4marks = 91;
        int s5marks = 88;

        int total_marks = s1marks + s2marks + s3marks + s4marks + s5marks;

        double simpleinterest = Principle * rate * time / sub_marks;
        double totalamount = Principle + simpleinterest;

        double bmi = weight / (height * height);

        double percentage = total_marks * 100.0 / 500;

        System.out.println("Simple Interest: " + simpleinterest);
        System.out.println("Total Amount: " + totalamount);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + total_marks);
        System.out.println("Percentage: " + percentage);
    }
}
