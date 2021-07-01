package isp.lab3.exercise1;

public class Tree{
    public int height;
    public Tree(){
        this.height=15;
    }
    public void grow(int meters){
        this.height=this.height+meters;
    }
    
    public String toString(){
        return this.height+"";
    }
    
    public static void main(String[] args) {
        Tree stejar;
        stejar=new Tree();
        String s=stejar.toString();
        System.out.println("Scris cu string: " + s);
        stejar.grow(5);
        System.out.println("Stejar care a crescut " + stejar.height);
 
    }
}


