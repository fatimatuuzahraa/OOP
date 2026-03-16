public class Movie {

    private String title;
    private String genre;
    private int duration;
    private String showTime;

    Movie(String title, String genre, int duration, String showTime) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.showTime = showTime;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public String getShowTime() {
        return showTime;
    }
    @Override
    public String toString() {
        return String.format(
                "Movie: %s | Genre: %s | Duration: %d mins | ShowTime: %s", title, genre, duration, showTime
        );
    }
}