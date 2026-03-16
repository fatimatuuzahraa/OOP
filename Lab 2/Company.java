public class Company {

    private String companyName;
    CinemaBranch[] branches; // array of branches

    public Company(String companyName, int numBranches) {
        this.companyName = companyName;
        this.branches = new CinemaBranch[numBranches];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Company: ").append(companyName).append("\nBranches:\n");

        for (CinemaBranch branch : branches) {
            sb.append(branch).append("\n");
        }

        return sb.toString();
    }
}