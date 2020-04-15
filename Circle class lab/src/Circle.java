public class Circle
{
    private double circleRadius;

    final double pi = 3.14159;

    public Circle(double setRadius)
    {
        circleRadius = setRadius;

    }

    public Circle()
    {
        circleRadius = 0.0;

    }
    public double getCircleRadius()
    {
        return circleRadius;
    }
    public double getPi()
    {
        return pi;
    }
    public void setCircleRadius(double newRadius)
    {
        circleRadius = newRadius;
    }
    public double getArea()
    {
       double circleArea = pi * circleRadius * circleRadius;
        return circleArea;
    }
    public double getDiameter()
    {
        double circleDiameter = circleRadius * 2;
        return circleDiameter;
    }
    public double getCircumference()
    {
        double circleCircumference = 2 * pi * circleRadius;
        return circleCircumference;
    }
}

