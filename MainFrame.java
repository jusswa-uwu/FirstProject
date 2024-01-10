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


    
}
