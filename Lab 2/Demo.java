public class Demo {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", "Sci-Fi", 148, "18:00");
        Movie movie2 = new Movie("Titanic", "Romance", 195, "20:30");
        Movie movie3 = new Movie("Avengers: Endgame", "Action", 181, "21:00");

        System.out.println("=== Movies ===");
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);

        Screen screen1 = new Screen("Screen 1", "S001", ScreenType.THREE_D, 5);
        Screen screen2 = new Screen("Screen 2", "S002", ScreenType.IMAX, 5);

        System.out.println("\n=== Screen Seats ===");
        System.out.println("Screen 1 Seats:");
        screen1.displaySeats();
        System.out.println("\nScreen 2 Seats:");
        screen2.displaySeats();

        CinemaBranch branch1 = new CinemaBranch("Downtown Cinema", "New York", 2);
        branch1.screens[0] = screen1;
        branch1.screens[1] = screen2;

        System.out.println("\n=== Cinema Branch ===");
        System.out.println("Branch: " + branch1);

        Company company = new Company("CineMagic", 1);
        company.branches[0] = branch1;

        System.out.println("\n=== Company ===");
        System.out.println(company);

        Seat seatToBook = screen1.seats[0][0];
        System.out.println("\nBooking seat: " + seatToBook.getSeatID());
        if (!seatToBook.isAvailable()) {
            System.out.println("Seat already booked. Setting it to booked now.");
            seatToBook.isAvailable = false;
        }
        System.out.println("Seat availability after booking: " + seatToBook.isAvailable());

        System.out.println("\nUpdated Seats for Screen 1:");
        screen1.displaySeats();
    }
}