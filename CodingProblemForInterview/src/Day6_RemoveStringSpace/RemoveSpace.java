package Day6_RemoveStringSpace;
public class RemoveSpace {
    public static void main(String[] args) {
        String name = "bablu kumar";
        String result = name.replace(" ", "");
        System.out.println(result);  // Output: bablukumar
        
        System.out.println(name.hashCode()==result.hashCode());
    }
}
