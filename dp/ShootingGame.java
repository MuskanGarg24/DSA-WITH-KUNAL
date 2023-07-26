import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShootingGame {
    public static int GetMaxPoints(List<Integer> markers) {
        // Create a mutable copy of the markers list
        List<Integer> mutableMarkers = new ArrayList<>(markers);

        // Sort the mutableMarkers in descending order
        Collections.sort(mutableMarkers, Collections.reverseOrder());

        int jamesPoints = 0;
        int bobPoints = 0;

        // Iterate through the mutableMarkers
        while (!mutableMarkers.isEmpty()) {
            // James shoots first
            jamesPoints += mutableMarkers.get(0);
            mutableMarkers.remove(0);

            // Bob shoots next
            bobPoints += mutableMarkers.get(0);
            mutableMarkers.remove(0);
        }

        // Compare James' and Bob's scores
        if (jamesPoints > bobPoints) {
            return jamesPoints;
        } else {
            return bobPoints;
        }
    }

    public static void main(String[] args) {
        List<Integer> markers1 = List.of(11, 20, 2, 10);
        System.out.println(GetMaxPoints(markers1)); // Output: 30

        List<Integer> markers2 = List.of(20, 2, 10, 11);
        System.out.println(GetMaxPoints(markers2)); // Output: 30
    }
}
