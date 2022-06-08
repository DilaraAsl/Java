package Day17_CustomClasses;

public class Rectangle {
    public int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int calcArea(){
        return this.length*this.width;
    }
    public int calcPer(){
        return 2*(this.length+this.width);
    }

    @Override
    public String toString() {
        return "Rectangle:" +
                "\nlength:" + length +
                " width=" + width + "Area : "+calcArea()+ "Perimeter: :"+calcPer();
    }
}
