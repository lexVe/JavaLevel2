package Lesson2;

public class AdaptToArray {
    private String newString;
    private String[][] secondString;
    private int[][] intArray;
    private int sum = 0;

    public AdaptToArray(String s) {
        this.newString = s;
    }

    private String[][] getStringDoubleArr() throws IndexOutOfBoundsException {
        String[] firstString = newString.split("\n");
        secondString = new String[firstString.length][];
        for (int i = 0; i < firstString.length; i++) {
            secondString[i] = firstString[i].split(" ");
        }


        if (4 != secondString.length){
            throw new IndexOutOfBoundsException("Array is not 4х4");
        }

        for (String[] x : secondString){
            if (x.length != 4){
                throw new IndexOutOfBoundsException("Array is not 4х4");
            }
        }
        return secondString;
    }


    private int[][] convertStringArrToIntArr() throws NumberFormatException {
        intArray = new int[getStringDoubleArr().length][];
        for (int i = 0; i < getStringDoubleArr().length; i++) {
            intArray[i] = new int[getStringDoubleArr()[i].length];
            if(intArray.length != 4){
                throw new NumberFormatException("some elements not numbers");
            }
            for (int j = 0; j < secondString[i].length; j++) {
                intArray[i][j] = Integer.parseInt(secondString[i][j]);
                if (intArray[i].length !=4 ) {
                    throw new NumberFormatException("some elements not numbers");
                }
            }
        }
        return intArray;
    }

    private int getSumOfMatrix(){
        for (int[] x: convertStringArrToIntArr()) {
            for (int y : x) {
                sum += y;
            }
        }
        return sum;
    }

    public float getDivision() {
        return (float)getSumOfMatrix()/2;
    }
}
