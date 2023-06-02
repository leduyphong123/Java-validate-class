

public class Main{
    public static String[] arr = {"C0223G","A0323G"};
    public static String[] arr2 = {"M0318G","P0323A"};
    public static void main(String[] args){
        ClassExample classExample = new ClassExample();
        for (String e: arr){
            System.out.println(classExample.validate(e));
        }
        for (String e: arr2){
            System.out.println(classExample.validate(e));
        }
    }
}