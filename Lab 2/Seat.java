public class Seat{

	private static int counter = 1;
	
	private String seatID;
	private String rowNo;
	private SeatType seatType;
	boolean isAvailable;

	Seat(SeatType seatType, String rowNo){
		this.seatID = rowNo + String.format("%02d", counter++);
		this.rowNo = rowNo;
		this.seatType = seatType;
	}

	public String getSeatID() {
		return seatID;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public String getRowNo() {
		return rowNo;
	}

	public boolean isAvailable() {
		return isAvailable;
	}
	@Override
	public String toString(){
		return String.format("%s %s %s %f %b", seatID, seatType, rowNo ,seatType.price, isAvailable);
	}
	
}

enum SeatType{
	Regular(10), Premium(15), VIP(20);
	
	double price;

	SeatType(int price){
		this.price = price;
	}
}