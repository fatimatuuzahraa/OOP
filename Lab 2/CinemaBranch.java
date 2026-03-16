public class CinemaBranch {

    private String branchName;
    private String city;
    private String location;
    private Screen[] screens;

    public CinemaBranch(String branchName, String city, String location){
        this.branchName = branchName;
        this.city = city;
        this.location = location;

        Movie movie1 = new Movie("Iron Man","Action",155,"6 PM");
        Movie movie2 = new Movie("Interstellar","Sci-Fi",165,"8 PM");

        screens = new Screen[2];

        screens[0] = new Screen("HallA","IMAX",movie1,4,5,SeatType.VIP);
        screens[1] = new Screen("HallB","Standard",movie2,3,6,SeatType.PREMIUM);
    }

    public String getBranchName(){
        return branchName;
    }

    public Screen[] getScreens(){
        return screens;
    }

    @Override
    public String toString(){
        return String.format(
            "Branch:%s City:%s Location:%s",
            branchName, city, location
        );
    }
}