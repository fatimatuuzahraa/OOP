public class Screen {
    private String name;
    private String screenID;
    private ScreenType screenType;
    Seat[][] seats;

    public Screen(String name, String screenID, ScreenType screenType, int seatCount) {
        this.name = name;
        this.screenID = screenID;
        this.screenType = screenType;
        this.seats = new Seat[seatCount][];
        seats[0] = new Seat[10];
        seats[1] = new Seat[11];
        seats[2] = new Seat[12];
        seats[3] = new Seat[13];
        seats[4] = new Seat[13];
        for(int i = 0; i<seats.length;i++){
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = new Seat(SeatType.Regular, " " + i);
            }
        }

    }
    public void displaySeats(){
        for(int i = 0; i<seats.length;i++){
            System.out.println();
            for (int j = 0; j < seats[i].length; j++) {
                System.out.println(seats[i][j]+ "  ");
            }
        }
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i<seats.length;i++){
            stringBuilder.append("/n");
            for (int j = 0; j < seats[i].length; j++) {
                stringBuilder.append(seats[i][j]+ "  ");
            }
        }
        return stringBuilder.toString();
    }
}

enum ScreenType {
    TWO_D("2D"),
    THREE_D("3D"),
    IMAX("IMAX");

    String displayName;

    ScreenType(String displayName) {
        this.displayName = displayName;
    }
}