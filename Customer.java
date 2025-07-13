public class Customer {
    private int roomBooking;
	private String name;
	private int feedback;
	
    Customer(int roomBooking, String name) {
        this.roomBooking = roomBooking;
        this.name = name;
        this.feedback = 0;
    }

    public String getName(){
        return name;
    }

    public int getBooking(){
        return roomBooking;
    }

    public int getFeedback(){
        return feedback;
    }

    public void setFeedback(int i){
        feedback = feedback + i;
    }
}