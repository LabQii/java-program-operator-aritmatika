package modul4;
public class IbuData {
    private static void Munculkan(Bilangan[]OB, double a, double b){
        OB[0] = new Penjumlahan();
        OB[1] = new Pengurangan();
        OB[2] = new Perkalian();
        OB[3] = new Pembagian();
        
        for (int c = 0; c < OB .length; c++){
                OB[c].set_A(a);
                OB[c].set_B(b);
                OB[c].set_C();
                OB[c].tampil();
    }
}   
public static void main(String[]args){
    Bilangan[] arrl = new Bilangan[4];
    Munculkan(arrl, 10.5, 0.5);
}
}
