/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2120180199.sk02.pbo.ti20192020.pkg3.pkg4.pkg02;

/**
 *
 * @author User1
 */
public class SK02PBOTI201920203402 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LINE Line = new LINE();
        Line.chat=100;        
        Line.videoCall=10;        
        Line.telefon=25;        
        System.out.println(Line.nama);
        System.out.println("Chat anda sekarang "+Line.chat);
        System.out.println("Anda tidak menjawab "+Line.telefon);
        System.out.println("Video call dari Sepikan anda "+Line.videoCall);
        Line.megirimGambar();
        Line.mengirimPesan(4, 2);
        Line.mengirimVideo(300);
        Line.grup(250);
    }
    
}
