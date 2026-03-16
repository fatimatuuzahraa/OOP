public class Movie {

    private String movieTitle;
    private String movieGenre;
    private int length;
    private String timeSlot;

    public Movie(String movieTitle, String movieGenre, int length, String timeSlot){
        this.movieTitle = movieTitle;
        this.movieGenre = movieGenre;
        this.length = length;
        this.timeSlot = timeSlot;
    }

    public String getTitle(){
        return movieTitle;
    }

    @Override
    public String toString(){
        return String.format(
                "%s (%s) %d mins Show:%s",
                movieTitle, movieGenre, length, timeSlot
        );
    }
}