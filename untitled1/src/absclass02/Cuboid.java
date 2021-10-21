package absclass02;

public class Cuboid extends Shape{
    public Cuboid(double width,double height,double length){
        super(width,height,length);
    }

    @Override
    public double getArea() {
        return this.x * this.y * this.z;
    }
    }
