// Class Elemen merupakan parent class
class Elemen {
    private String nama;
    public int getJamSibuk;
    public int jumlah;
    
    public Elemen(String nama) {
        this.nama = nama;
    }

    public String getnama(){
        return nama;
    }

    public void cek(){

    }
    public int getJamSibuk(){
        return 0;
    }
}
// membuat kelas mahasiswa yang merupakan child dari kelas elemen
class Mahasiswa extends Elemen {
    private int sks;
    public int jamSibuk;

    public Mahasiswa(String nama, int Sks) {
        super(nama);
        sks=Sks;
        jamSibuk = sks * 3;
    }
    @Override
    public void cek(){
        System.out.println(getnama() + "adalah seorang mahasiswa dengan jam sibuk " + getJamSibuk());
    }

    public int getJamSibuk(){
        return jamSibuk;
    }
}
//class dosen yang merupakan chil dari kelas elemen
class Dosen extends Elemen {
    private int jumlahHariKerja;
    public int jamSibuk;

    public Dosen(String nama, int JumlahHariKerja) {
        super(nama);
        jumlahHariKerja=JumlahHariKerja;
        jamSibuk = jumlahHariKerja*8;
    }

    @Override
    public void cek(){
        System.out.println(getnama() + "adalah seorang dosen dengan jam sibuk " + getJamSibuk());
    }

    public int getJamSibuk(){
        return jamSibuk;
    }
}
//class asdos yang merupakan child dari kelas mahasiswa
class Asdos extends Mahasiswa{
    private int jamNgasdos;

    public Asdos(String nama, int sks, int JamNgasdos) {
        super(nama, sks);
        jamNgasdos=JamNgasdos;
        jamSibuk = jamSibuk + jamNgasdos;
    }
    @Override
    public void cek(){
        System.out.println(getnama() + "adalah seorang asdos dengan jam sibuk " + getJamSibuk());
    }

    public int getJamSibuk(){
        return jamSibuk;
    }

}
//class simulator merupakan driver class
public class Simulator {
    
    public static void main(String[] args) {
        Elemen a = new Asdos("Fairuzikun", 24, 1);//merupakan upcasting
        Elemen b = new Dosen("Raja OP Demanik", 5);//merupakan upcasting
        Elemen c = new Asdos("Angle-chan", 21, 1);//merupakan upcasting
        Elemen d = new Mahasiswa("Firman", 20);//merupakan upcasting
        Elemen e = new Mahasiswa("Nid to pass this sem", 23);//merupakan upcasting
        Elemen f = new Dosen("Nivotko", 3);//merupakan upcasting
    //Pada baris ke 84 sampai ke 89 merupakan salah jenis dari polymorphism yaitu upcasting.
    //polymorphism dapat dilihat dari objek dengan tipe elemen yang memiliki banyak bentuk
    //ada yang memiliki bentu sebagai asdos, dosen maupun mahasiswa.
       
    //Menjumlahkan jam sibuk pada setiap objek yang dibuat
        int jumlah = a.getJamSibuk() + b.getJamSibuk() + ((Asdos) c).getJamSibuk() 
                + ((Mahasiswa) d).getJamSibuk() + ((Mahasiswa) e).getJamSibuk() + ((Dosen) f).getJamSibuk();
         
        //memanggil method cek pada setiap objek
        a.cek();
        b.cek();
        c.cek();
        d.cek();
        e.cek();
        f.cek();
        
    //menampilkan jumlah total jam sibuk dari semua objek yang dibuat.
        System.out.println("Total jam sibuk elemen Fasilkom adalah " + jumlah);   
    }
}