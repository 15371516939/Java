package absclass02;
//矩形
public class Rectangle  extends Shape{
    public Rectangle(double width,double height){
        super(width,height);

    }


    @Override
    public double getArea() {
        return this.x * this.y;
    }


    }
