
package seriusinimah;

public class PersegiPanjang extends CallBD{
    
    public PersegiPanjang(double p, double l){
        this.p = p;
        this.l = l;
        this.L = p*l;
        this.K = (p+l)*2;
    }
    
    @Override
    double getLuas(){
        return L;
    }
    @Override
    double getKelg(){
        return K;
    }
}
