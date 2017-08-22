package tutorial;

public class Marathon {
    public static void main(String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"   
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265  
        };
        int lowestIndex = 0;
        int lowestValue = times[lowestIndex];
        for (int i = 0; i <names.length; i++) {
            if(times[i]<lowestValue) {
                lowestIndex = i;
                lowestValue = times[i];
            }
            System.out.println(names[i]+": "+times[i]);
        }
        double bestTime = lowestValue/60.0;
        System.out.println("The best time belonged to " + names[lowestIndex] + " with a time of " + bestTime + " minutes.");
    }
}
