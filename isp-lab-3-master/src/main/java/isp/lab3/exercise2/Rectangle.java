package isp.lab3.exercise2;

public class Rectangle{
    private int length=2;
    private int width=1;
    private String color="red";
    
    public Rectangle(int lung, int lat){
        this.length=lung;
        this.width=lat;
    }
    
    public Rectangle(int lung, int lat, String Color){
        this.length=lung;
        this.width=lat;
        this.color=Color;
    }
    
    public int getLength(){
        return length;
    }
    
    public int getWidth(){
        return width;
    }
    
    public String getColor(){
        return color;
    }
    
    public int getPerimeter(){
        return 2*length+2*width;
    }
    
    public int getArea(){
        return length*width;
    }
    
    public static void main(String[] args) {
        Rectangle patrat;
        patrat= new Rectangle(4,4);
        System.out.println(patrat.getLength() + " " + patrat.getWidth() + " " + patrat.getColor() + " " + patrat.getPerimeter() + " " + patrat.getArea());
        Rectangle dreptunghi_verde;
        dreptunghi_verde=new Rectangle(3,5,"green");
        System.out.println(dreptunghi_verde.getLength() + " " + dreptunghi_verde.getWidth() + " " + dreptunghi_verde.getColor() + " " + dreptunghi_verde.getPerimeter() + " " + dreptunghi_verde.getArea());
    }
}