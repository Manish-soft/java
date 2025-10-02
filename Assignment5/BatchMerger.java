import java.util.*;

 class BatchMerger {
    public static void main(String[] args) {
      
        List<String> morningBatch = Arrays.asList("Amit", "Priya");

        List<String> eveningBatch = Arrays.asList("Rohan", "Priya");

      
        Set<String> combinedBatch = new LinkedHashSet<>();
        combinedBatch.addAll(morningBatch);
        combinedBatch.addAll(eveningBatch);

       
        System.out.println("Combined batches: " + String.join(", ", combinedBatch));
    }
}
