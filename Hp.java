package Hp;

public class Hp {
    String jenis_hp;
    int tahun_pembuatan;

    public void setDataHp(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    public String getJenisHp(){
        return jenis_hp;
    }

    public int getTahunPembuatan(){
        return tahun_pembuatan;
    }

    public static void main(String[] args) {
        Hp hp = new Hp();
        hp.setDataHp("Android", 1900);
        System.out.println("Jenis hp: " + hp.jenis_hp);
        System.out.println("tahun pembuatan: " + hp.getTahunPembuatan());
    }
}