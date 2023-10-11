package modul4;
public class Penjumlahan extends Bilangan{
    @Override
    protected void set_C(){
    this.c = this.a + this.b;
    }
    @Override
    protected void tampil(){
        System.out.println("Operasi Penjumlahan:");
        System.out.println("Bil A = " +this.get_A());
        System.out.println("Bil B = " +this.get_B());
        System.out.println("Bil A + B = " +this.get_C());
        System.out.println("");
    }  
}