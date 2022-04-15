class Fruits{  
void eat(){
    System.out.println("eat.");
}  
}  
class Apple extends Fruits{  
{
    System.out.println("Apple ");
}  
}  
class Abhi{  
public static void main(String args[]){  
Apple a=new Apple();  
a.eat();  
}
}  
