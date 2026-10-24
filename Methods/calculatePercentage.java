package Methods;

public class calculatePercentage {

    static void findTotalPercent(int obtainedMarks, int totalMarks){

        int percentage = (obtainedMarks * 100) / totalMarks;
        System.out.println("Total percentage is : " + percentage + " %");

    }
    public static void main(String[] args) {
        
        // Passing argument in method call
        findTotalPercent(389, 500);

    }
}
