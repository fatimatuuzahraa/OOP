public class Company {

    private String companyName;
    private CinemaBranch[] branches;

    public Company(){
        this.companyName = "Galaxy Star Cinemas";

        branches = new CinemaBranch[2];

        branches[0] = new CinemaBranch("Central Branch","Lahore","Downtown Avenue");
        branches[1] = new CinemaBranch("Harbor Branch","Karachi","Ocean Mall");
    }

    public void displayCompany(){
        System.out.println("Cinema Company: " + companyName);

        for(int i = 0; i < branches.length; i++){
            System.out.println(branches[i]);

            Screen[] screens = branches[i].getScreens();

            for(int j = 0; j < screens.length; j++){
                System.out.println(screens[j]);
                screens[j].displaySeats();
            }
        }
    }

    public void bookSeat(String branchName, String screenID, String seatID){
        for(int i = 0; i < branches.length; i++){
            if(branches[i].getBranchName().equals(branchName)){
                Screen[] screens = branches[i].getScreens();

                for(int j = 0; j < screens.length; j++){
                    if(screens[j].getScreenID().equals(screenID)){
                        screens[j].bookSeat(seatID);
                        return;
                    }
                }
            }
        }
        System.out.println("Branch or Screen does not exist");
    }
}