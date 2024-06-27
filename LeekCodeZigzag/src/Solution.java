
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder(); //adds an object each iteration of the for loop
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // Create an instance of Solution class
        Solution solution = new Solution();

        // Input string and numRows
        String s = "PAYPALISHIRING";
        int numRows = 2;

        // Call the convert method
        String result = solution.convert(s, numRows);

        // Print the result
        System.out.println("Result: " + result);
    }
}

