public class AnimalTest{

     public static void main(String []args){
        Animal dog = new Dog();
        Animal hen = new Hen();
        
        System.out.println("Dog:"+ dog.tryToFly());
        System.out.println("Hen:"+ hen.tryToFly());
     }
}
