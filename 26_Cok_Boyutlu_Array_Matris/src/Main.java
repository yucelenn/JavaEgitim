public class Main {                                               //        0.sutun 1.sutun 2.sutun  .....
    public static void main(String[] args) {                      //0.satir     78    65      
                                                                  //1.satir     53    99
        int[][] array = new int[2][2];   // 2ye 2 matris.           2.satir 
        array[0][0]=78;      // 0x0 =78 oldu.                         ...
        array[0][1]=65;
        array[1][0]=53;
        array[1][1]=99;
                   //   0x0  0x1    1x0   1x1   boyle de alinir.
        int[][] dizi = {{10 , 20} , {30 , 40}};                  //  10  20    boyle olur.
        System.out.println(dizi[0][0]);                          //  30  40
        
        System.out.println("Array dizisi:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println("");
        }
        
        
        
    }
    
    
    
    
    
    
    
}
