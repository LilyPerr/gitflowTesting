public class Cat {
    private int location;
    private String owner;

    public Cat(){
        location = 10;
        owner = "Humane Society";
    }

    public int getLocation(){ return location; }

    public void setLocation(int loc){
        location = loc;
    }

    public String getOwner(){
        return owner;
    }

    public void setOwner(String own){
        owner = own;
    }
}