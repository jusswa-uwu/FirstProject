import java.sql.Array;

import javax.sql.rowset.spi.SyncFactory;
public class MainFrame{
    final static int height = 600;
    final static  int width = height/2+100;
   /*  JPanel MainPanel = new JPanel();
    JButton button0 = new JButton();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button5 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();
*/
    public void bubblesorter(int[] arr) {
        int n = arr.length;
            for(int i = 0;i<n;i++) {
                for(int j =i+1;j<n;j++) {
                    if(arr[i] < arr[j]) {
                        int temp;
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                 
                }
            }
            System.out.println("Arranged Num");
            for(int r:arr) {
                 System.out.print(r);
            }
           
}

    public void Merger(int[] arr) {
          int Arrlength = arr.length;
          if(Arrlength < 2) {
            return;
          }
          int midpoint = arr.length/2;
          int[] leftHand = new int[midpoint];
          int[] rightHand = new int[Arrlength- midpoint];
          for(int i =0;i<midpoint;i++) {
            leftHand[i] = arr[i]; 
          }
          for(int i = midpoint;i<arr.length;i++) {
            rightHand[i-midpoint] = arr[i];
          }
          Merger(leftHand);
          Merger(rightHand);

          Conquer(arr, leftHand, rightHand);
    }
    private static void Conquer(int[] inputArr,int[] leftHand,int[] rightHand) {
        int LeftSize = leftHand.length;
        int RightSize = rightHand.length;
        int i =0,j=0,k=0;
        
        while(i < LeftSize && j < RightSize) {
            if(leftHand[i] <= rightHand[j]) {
                inputArr[k] = leftHand[i];
                i++;
            }
            else {
                inputArr[k] = rightHand[j];
                j++;
            }
            k++;
        }
        if(i < LeftSize) {
            inputArr[i] = leftHand[i];
        }
        if(j < RightSize) {
            inputArr[j] = rightHand[j];
        }
        
    }
    public void printArray(int[] Array) {
        System.out.println();
        for(int r:Array) {
            System.out.print(r);
        }
    }
}
