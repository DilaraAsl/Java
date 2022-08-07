package day28_Encapsulation.encapsulation;

public class Square {
    private int side;
    public Square(int side){
        setSide(side);
    }
    public void setSide(int side){
        if(side<0){
            System.err.println("Side cannot be a negative no: "+side);
            System.exit(1);
        }
        this.side=side;
    }
    public int getSide(){
        return side;
    }
    public String calcArea(){
        return "Area of the square is : "+side*side;
    }
    public String calcPerimeter(){
        return "Area of the square is : "+4*side;
    }
    public String toString(){
        return "Square side: "+getSide()+"\n "+calcArea()+"\n "+calcPerimeter();
    }
}
