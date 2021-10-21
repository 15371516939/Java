package absclass02;
//规则梯形(上下底平行）
public class Trapezoid extends Shape{
    public Trapezoid(double width,double height){
        super(width,height);

    }
    @Override
    public double getArea() {
        return (this.x * this.y)/2;
    }
}

