package Interface;

 abstract class MultipleInheritanceExample2 implements  MultipleInheritanceExample1{

     @Override
     public void c() {
         System.out.println("String 1");
     }

     public abstract void a();

     public abstract void b();

     public abstract void d();
 }
