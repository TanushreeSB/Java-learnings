// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class MultiDimensionalArrayExample {
    public static void main(String[] args) {
     int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };

        for (int row = 0; row < myNumbers.length; row++) {
          for (int col = 0; col < myNumbers[row].length; col++) {
            System.out.println("myNumbers[" + row + "][" + col + "] = " + myNumbers[row][col]);
          }
        } 
    }
}

/*

myNumbers[0][0] = 1
myNumbers[0][1] = 4
myNumbers[0][2] = 2
myNumbers[1][0] = 3
myNumbers[1][1] = 6
myNumbers[1][2] = 8
myNumbers[1][3] = 5
myNumbers[1][4] = 2

=== Code Execution Successful ===

*/
