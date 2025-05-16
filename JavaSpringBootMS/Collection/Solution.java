package JavaSpringBootMS.Collection;

import java.util.*;

// Define IPortfolio interface
// By default all the variable ans method are public and abstract
// Abstrat method should be defined in the inherit class
interface IPortfolio {
    Map<String, Integer> getAllocations();
}

// Create a class which Implements IPortfolio interface
class SimplePortfolio implements IPortfolio {
    private final Map<String, Integer> allocations;

    // created a constucter which set/store the allocation values as in SET collection
    public SimplePortfolio(Map<String, Integer> allocations) {
        this.allocations = allocations;
    }

    //overriding a method to print the allocation
    @Override
    public Map<String, Integer> getAllocations() {
        return allocations;
    }
}

// create a class PortfolioManager with the rebalance logic
class PortfolioManager {
    // method to rebalance portfolio based on target allocation.
    // method which takes curr and target as an argument as in MAP.
    public static Map<String, Integer> rebalancePortfolio(IPortfolio currentPortfolio, IPortfolio targetPortfolio) {
        Map<String, Integer> currentAllocations = currentPortfolio.getAllocations();
        Map<String, Integer> targetAllocations = targetPortfolio.getAllocations();
        Map<String, Integer> adjustments = new LinkedHashMap<>();

        for (String asset : targetAllocations.keySet()) {
            int current = currentAllocations.getOrDefault(asset, 0);
            int target = targetAllocations.get(asset);
            adjustments.put(asset, target - current); // Positive = Buy, Negative = Sell
        }

        return adjustments;
    }
}

// Main solution class
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read Number of assets
        // Taking input as string, then converthing the string of a number into interger.
        // Integer.parseInt() = converts a string representation of a number into an integer
        int n = Integer.parseInt(scanner.nextLine()); 

        // Read Asset names
        // split use for divide a string ino array
        String[] assetNames = scanner.nextLine().split(" "); 

        // Read current allocation as string and convert it into Integer
        int[] currentAllocations = Arrays.stream(scanner.nextLine().split(" "))
                                         .mapToInt(Integer::parseInt)
                                         .toArray();
        int[] targetAllocations = Arrays.stream(scanner.nextLine().split(" "))
                                        .mapToInt(Integer::parseInt)
                                        .toArray();

        // Create a map for current and target allocation
        Map<String, Integer> currentMap = new LinkedHashMap<>();
        Map<String, Integer> targetMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            currentMap.put(assetNames[i], currentAllocations[i]);
            targetMap.put(assetNames[i], targetAllocations[i]);
        }

        //Create portfolio object
        IPortfolio currentPortfolio = new SimplePortfolio(currentMap);
        IPortfolio targetPortfolio = new SimplePortfolio(targetMap);

        //call rebalance method
        Map<String, Integer> adjustments = PortfolioManager.rebalancePortfolio(currentPortfolio, targetPortfolio);

        // result
        for (String asset : assetNames) {
            int adj = adjustments.getOrDefault(asset, 0);
            System.out.println(asset + ": " + (adj >= 0 ? "+" : "") + adj + "%");
        }

        scanner.close();
    }
}
