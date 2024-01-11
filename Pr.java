public class Pr{
    public static void main(String[] args) {
        int[] inArr = {1,2,3,4,5,6,7,8,9,0};
       MainFrame MF = new MainFrame();
       // MF.bubblesorter(inArr);

         System.out.println("Before");
        MF.printArray(inArr);
        System.out.println();
        System.out.println("After");
        MF.Merger(inArr);
        MF.printArray(inArr);
       
    }
}