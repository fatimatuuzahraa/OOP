public class Demo {

    public static void main(String[] args){

        Company company = new Company();

        company.displayCompany();

        company.bookSeat("Central Branch","HallA","A1");
        company.bookSeat("Harbor Branch","HallB","B3");
        company.bookSeat("Central Branch","HallA","A1");
    }
}