package pkg2120180199.sk02.pbo.ti20192020.pkg3.pkg4.pkg02;
public class LINE {
    String nama = "Line";
    int chat;
    int videoCall;
    int telefon;
    void megirimGambar(){
        System.out.println("selamat datang di aplikasi " + this.nama);
        
    }
    void mengirimPesan(int x, int y){
        int z= x%y;
        System.out.println("pesan akan dikirim secara singkat dalam "+ z + " detik");
    }
    void mengirimVideo(int ukuran){
        System.out.println("Anda hanya bisa mengirim video sebesar "+ ukuran + " Mb");
    }
    void grup(int a){
        System.out.println("maksimal anggota grup "+ a + " orang");
    } 
}
