
package seriusinimah;

public class Persegi extends CallBD {
    
    public Persegi(double s){
        this.s = s;
        this.L = s*s;
        this.K = 4*s;
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
