public class Dog {
    private int location;
    private String owner;

    public Dog(){
        location = 0;
        owner = "Humane Society";
    }

    public int getLocation(){
        return location;
    }

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