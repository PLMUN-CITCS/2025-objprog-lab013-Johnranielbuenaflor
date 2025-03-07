
// Define the class
public class ParametersAndArguments {

    // Main method
    public static void main(String[] args) {
        int roomWidth = 10;  // Argument for width
        int roomHeight = 15; // Argument for height

        int area = calculateArea(roomWidth, roomHeight); // Calling the method with arguments

        System.out.println("The calculated area is: " + area); // Print the result
    }

    // Method to calculate the area
    public static int calculateArea(int width, int height) { // Parameters: width and height
        int area = width * height; // Calculate area
        return area; // Return the calculated area
    }
}
