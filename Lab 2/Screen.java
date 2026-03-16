public class Screen {

    private String id;
    private String type;
    private Movie currentMovie;
    private Seat[][] seatLayout;

    public Screen(String id, String type, Movie currentMovie, int totalRows, int totalCols, SeatType defaultType){
        this.id = id;
        this.type = type;
        this.currentMovie = currentMovie;

        seatLayout = new Seat[totalRows][totalCols];

        for(int r = 0; r < totalRows; r++){
            for(int c = 0; c < totalCols; c++){
                String rowLabel = String.valueOf((char)('A' + r));
                seatLayout[r][c] = new Seat(rowLabel, c + 1, defaultType);
            }
        }
    }

    public String getScreenID(){
        return id;
    }

    public Seat[][] getSeats(){
        return seatLayout;
    }

    public void displaySeats(){
        for(int r = 0; r < seatLayout.length; r++){
            for(int c = 0; c < seatLayout[r].length; c++){
                System.out.print(seatLayout[r][c] + " | ");
            }
            System.out.println();
        }
    }

    public void bookSeat(String seatID){
        for(int r = 0; r < seatLayout.length; r++){
            for(int c = 0; c < seatLayout[r].length; c++){

                Seat s = seatLayout[r][c];

                if(s.getSeatID().equals(seatID)){
                    if(!s.isBooked()){
                        s.bookSeat();
                        System.out.println("Seat " + seatID + " booked");
                    } 
                    else{
                        System.out.println("Seat already booked");
                    }
                    return;
                }
            }
        }
        System.out.println("Seat not found");
    }

    @Override
    public String toString(){
        return String.format("Screen:%s Type:%s Movie:%s", id, type, currentMovie);
    }
}