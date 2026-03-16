public class CinemaBranch {

    private String branchName;
    private String city;
    Screen[] screens;

    public CinemaBranch(String branchName, String city, int numScreens) {
        this.branchName = branchName;
        this.city = city;
        this.screens = new Screen[numScreens];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < screens.length; i++) {
            sb.append(screens.toString());
        }

        return sb.toString();
    }
}