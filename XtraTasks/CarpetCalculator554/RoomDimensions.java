package XtraTasks.CarpetCalculator554;

public class RoomDimensions {
    private int width,length;


    public void setWidth(int width){
        this.width=width;
    }
    public int getWidth(){
        return width;
    }
    public void setLength(int length){
        this.length=length;
    }
    public int getLength(){
        return length;
    }

    public RoomDimensions(int width, int length){
        setWidth(width);
        setLength(length);


    }
    public RoomDimensions(RoomDimensions obj2){
        width=obj2.width;
        length=obj2.length;

    }
    public int roomArea(){
        int area=getWidth()*getLength();
        return area;
    }


    public String toString() {
        return "RoomDimensions{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
