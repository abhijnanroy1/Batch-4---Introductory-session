class Fruits{  
void eat(){System.out.println("eating ");}  
}  
class Apple extends Fruits{  
void eat1(){System.out.println("eating1 ");}  
}  
class Apple1 extends Apple{  
void eat2(){System.out.println("eating2 ");}  
}  
class Abhi{  
public static void main(String args[]){  
Apple1 a=new Apple1();  
a.eat();  
a.eat1();  
a.eat2();  
}}  
