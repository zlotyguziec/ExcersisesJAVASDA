public class Main {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 3, 0, 2, 2, 2, 2, 3, 1, 5, 2, 4, 7 };

        int[] result = removeDuplicates(array, 0);

        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] removeDuplicates(int[] inputArray, int currentElement) {
        int[] result = countArrayLength(inputArray, currentElement);

        boolean possibleDuplicateInserted = false;
        int possibleDuplicate = inputArray[currentElement];
        int positionShift = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (possibleDuplicateInserted && inputArray[i] == possibleDuplicate) {
                positionShift++;
            } else {
                if (inputArray[i] == possibleDuplicate) {
                    possibleDuplicateInserted = true;
                    result[i - positionShift] = inputArray[i];
                } else {
                    result[i - positionShift] = inputArray[i];
                }
            }

        }

        int nextElement = currentElement + 1;

        if (nextElement >= result.length) {
            return result;
        } else {
            return removeDuplicates(result, nextElement);
        }
    }

    public static int[] countArrayLength(int[] inputArray, int currentElement) {
        int duplicateCounter = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[currentElement] == inputArray[i]) {
                duplicateCounter++;
            }
        }

        int[] result = new int[inputArray.length - duplicateCounter + 1];
        return result;
    }
}