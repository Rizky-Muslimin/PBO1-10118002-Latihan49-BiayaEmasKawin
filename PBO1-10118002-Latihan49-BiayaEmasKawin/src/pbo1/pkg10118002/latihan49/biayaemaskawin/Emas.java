
package pbo1.pkg10118002.latihan49.biayaemaskawin;

/**
 * NAMA  : Rizky Muslimin
 * KELAS : IF 1
 * NIM   : 10118002
 */
public class Emas {
    
   public int hargaGram;
   public double beratEmas;

    public int getHargaGram() {
        return hargaGram;
    }

    public void setHargaGram(int hargaGram) {
        this.hargaGram = hargaGram;
    }

    public double getBeratEmas() {
        return beratEmas;
    }

    public void setBeratEmas(double beratEmas) {
        this.beratEmas = beratEmas;
    }
   
    public double perhitungan(int hargaGram, double beratEmas) {
       
       return hargaGram * beratEmas ;
    }
    
}
