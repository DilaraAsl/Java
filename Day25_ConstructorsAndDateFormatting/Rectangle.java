package Day25_ConstructorsAndDateFormatting;

public class Rectangle {
    public double length;
    public double width;
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return (length+width)*2;
    }


    public String toString() {
        return "Rectangle{" +
                " length=" + length +
                ", width=" + width +
                " area : "+ area()+
                " perimeter : "+ perimeter()+
                '}';
    }
}
