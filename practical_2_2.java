/**
 * Practical 2 (Part A) - Cinema Show
 * Concepts: encapsulation, methods that validate and report success,
 * a final capacity, a static total shared by all shows, overloaded constructors.
 */
public class practical_2_2 {
    private String title;
    private int seatsAvailable;
    private final int capacity;             // set once, cannot change
    private static int totalBooked = 0;     // across EVERY show

    public practical_2_2(String title, int capacity) {
        this.title = title;
        this.capacity = capacity;
        this.seatsAvailable = capacity;     // starts empty: all seats free
    }

    public practical_2_2(String title) {       // default capacity 100
        this(title, 100);
    }

    /** Book n seats; succeeds only if enough remain. Returns true on success. */
    public boolean book(int n) {
        if (n > 0 && n <= seatsAvailable) {
            seatsAvailable -= n;                        
            totalBooked   += n;
            return true;
        }
        return false;                       // not enough seats: nothing changes
    }
    
    /** Cancel n seats, but never let availability exceed the capacity. */
    public void cancel(int n) {
        
        if (n > 0) {
            seatsAvailable += n;
            totalBooked   -= n;
            if (seatsAvailable > capacity) seatsAvailable = capacity;
        }
    }

    public int getSeatsAvailable() { return seatsAvailable; }
    public static int getTotalBooked() { return totalBooked; }

    public static void main(String[] args) {
        practical_2_2 a = new practical_2_2("Interstellar", 5);   // small, to show limits
        practical_2_2 b = new practical_2_2("Dune");              // default cappractical_2_2
        System.out.println("A book 3 -> " + a.book(3) + " | seats " + a.getSeatsAvailable()); // true, 2
        System.out.println("A book 4 -> " + a.book(4) + " | seats " + a.getSeatsAvailable()); // false, 2
        a.cancel(1);
        System.out.println("A cancel 1 | seats " + a.getSeatsAvailable());                    // 3
        System.out.println("B book 10 -> " + b.book(10) + " | seats " + b.getSeatsAvailable());// true, 90
        System.out.println("Total booked across shows: " + practical_2_2.getTotalBooked());       // 13
    }
}
