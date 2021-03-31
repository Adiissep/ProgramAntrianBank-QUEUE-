package Antrian;
/**
 *
 * @author ADVANG4C
 */
import java.util.*;
public class antrian {
    private String [] data;
    private static int counters = 0;
    private int palingdepan, palingbelakang, maksElemen;
    public antrian(int ukuran){
    palingdepan=0;
    palingbelakang=0;
    maksElemen = ukuran;
    data = new String[ukuran];
    }
    antrian next;
    public void insert (String x){
        if(palingbelakang==maksElemen){
            System.out.println("Antrian Penuh");
            System.out.println(x+" Tidak Masuk antrian");
        } else{
            jikanull(x);
            data[palingbelakang]=x;
            palingbelakang++;
            next=null;
            System.out.println("Antrian ditambahkan");
        } 
    }
    public void jikanull(String x){
        if(maksElemen==0){
           data[palingdepan]=x;
           palingdepan++;
           next=null;
        }
    }
    public String infopalingbelakang(){
        return data[palingbelakang-1];
    }
    public String infopalingdepan(){
        return data[palingdepan+0];
    }
    public String removenull(){
        removeQueueByPosition();
        String d = data[palingdepan];
        data[palingdepan]=null;     
        palingdepan++;
        
        return d;
    }
    
    public void infoAntrian(){
        if(maksElemen==0)System.out.println("- Kosong -");
        else{
            for (int i = 0; i < data.length; i++) {
            System.out.println(i+1+"."+data[i]);
        }
    }
    }
    private void removeQueueByPosition(){
    if(counters == 0){
        System.out.println("Belum ada antrian!");
    }
    else{
        infoAntrian();
        int loopX = 0;
        int alpha = 0;

        while(loopX == 0) {
            System.out.print("Masukkan posisi (0 - "+(counters-1)+"): ");
            Scanner alphaX = new Scanner(System.in);
            try {
                alpha = alphaX.nextInt();
                if(alpha > counters){
                    System.out.println("Tidak ada data di posisi tersebut!");    
                    loopX = 0;
                }
                else{
                    counters--;
                    for(int i = alpha; i < counters; i++){
                        data[i] = data[i+1];
                    }
                    infoAntrian();
                    System.out.println("Antrian index ke: "+alpha+" telah dihapus!");
                    loopX = 1;

                }
            
            }
            catch(InputMismatchException e) {
                System.out.println("Masukan harus berupa Angka!");
                loopX = 0;
            }
        }
    }
    }
    public void format(){
       for(int i=0; i<this.data.length;i++){
        if (this.data[i] != null){
            this.data[i] = null;
            maksElemen--;
            }
        }     
    }
    public int removenullindex(){
        if (maksElemen==0)System.out.println("- Kosong -");
        else{
            infoAntrian(); 
                int removeSelection = maksElemen;   
                maksElemen--;     
        }
        return 0;
        
    }

    
}
