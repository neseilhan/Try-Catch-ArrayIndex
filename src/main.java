import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("Lutfen bir index girin : ");
        int index = inp.nextInt(); // index alma
        try{
            System.out.println(ArrayIndexOutofBounds(array,index)); //exception methodu cagırma.
        }
        catch(Exception e){
            System.out.println("Girilen index dizinin disindadir.");
        }
    }
    public static int ArrayIndexOutofBounds(int[] array, int index) throws Exception{
        if(index <0 || index >= array.length) { //array ve index alan exception methodu.
            throw new Exception();
        }
        return array[index];
    }
}