
public class Circle {
       
        public double radius;
        
        
        public Circle(){
            radius=3;
        
    }
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double getArea(){
        double area = radius * radius * Math.PI;
        return area;
}
    
    
    
    
}
