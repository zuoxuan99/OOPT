
public class Q2 {

    public static void main(String[] args) {
        int[] list = {1, 2, 4, 5, 10, 100, 2, -22};
        System.out.println("Smallest Digit Position in list: " + smallestPosition(list));
    }
    public static int smallestPosition(int list[]) {
        int num = 0;
        
        for(int x =1;x< list.length;x++) {
            if (list[num] > list[x])
                num = x;
        }
        
        return num;
    }
}
