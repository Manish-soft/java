 class Q9DuplicateElements {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 1}; 
        boolean hasDuplicates = false;

        System.out.print("Duplicate elements: ");
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                continue; 
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    hasDuplicates = true;
                    break;
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found");
        }
    }
}
