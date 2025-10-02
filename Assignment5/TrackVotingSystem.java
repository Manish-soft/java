import java.util.*;

class TrackVotingSystem {

    public static void main(String[] args) {

      
        Set<Integer> voterIDs = new TreeSet<>();

   
        voterIDs.add(201);
        voterIDs.add(202);
        voterIDs.add(203);
        voterIDs.add(202);  

       
        System.out.println("Total voters: " + voterIDs.size());
    }
}
