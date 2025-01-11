public class PenDistribution {

    public static void main(String[] args) {

        // Total number of pens available
        int penTotalPen = 14; 
        
        // Number of students to distribute the pens among
        int noOfStudent = 3; 
        
        // Calculate the remaining pens after equal distribution
        int remainingPen = 14 % 3; 
        
        // Calculate how many pens each student gets
        int penStudentGet = 14 / 3;

        // Display the result: pens per student and leftover pens
        System.out.println("The Pen Per Student is " + penStudentGet + 
                           " and the remaining pen not distributed is " + remainingPen);
    }
}
