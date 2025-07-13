import java.util.ArrayList;

public class Room {
	private int number;
	private int size;
	private ArrayList<Customer> occupants;
	private boolean clean;
	
    Room(int number, int size, boolean clean) {
        this.number = number;
        this.size = size;
        this.occupants = new ArrayList<Customer>();
        this.clean = clean;
    }

    public boolean getClean(){
        return clean;
    }

    public void setClean(boolean cleaned){
        clean = cleaned;
    }

    public int getSize(){
        return size;
    }

    public int getNumber(){
        return number;
    }

    public  ArrayList<Customer> getOccupants(){
        return this.occupants;
    }

    public boolean getEmpty(){
        if (occupants.isEmpty()==true){
            return true;
        }
        else{
            return false;
        }
    }

    public void addOccupant(Customer occupantIn) {
        if (this.occupants.size() < size) {
            this.occupants.add(occupantIn);
            occupantIn.setFeedback(1);
        }
        else {
            occupantIn.setFeedback(-1);
            return;
        }
        if (this.clean)
            occupantIn.setFeedback(1);
        else
            occupantIn.setFeedback(-1);
        this.clean = false;
    }

    public void removeOccupant(Customer occupantOut) {
        int index = -1;
        for (int i = 0; i < this.occupants.size(); i++) {
            if (this.occupants.get(i).equals(occupantOut))
                index = i;
        }
        if (index != -1)
            this.occupants.remove(index);
    }

}