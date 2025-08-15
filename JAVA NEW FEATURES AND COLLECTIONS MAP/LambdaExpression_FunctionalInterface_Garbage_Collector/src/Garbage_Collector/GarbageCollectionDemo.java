package Garbage_Collector;
public class GarbageCollectionDemo {
    public static void main(String[] args) {
        // Creating an object
        GarbageCollectionDemo obj = new GarbageCollectionDemo();

        // Making object eligible for GC
        obj = null;

        // Request GC using System class
        System.gc();

        {
        	System.out.println("welcome instance block");
        }

        // OR using Runtime class (another way)
        // Runtime.getRuntime().gc();
    }


    // Finalize method gets called before object is garbage collected
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called and object deleted!");
    }
}
