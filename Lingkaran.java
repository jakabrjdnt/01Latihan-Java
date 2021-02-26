
package seriusinimah;

public class Lingkaran extends CallBD {
    
    public Lingkaran(double r){
        this.r = r;
        this.L = 3.14*r*r;
        this.K = 2*3.14*r;
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
