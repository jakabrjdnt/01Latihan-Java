
package seriusinimah;

public class Jajargenjang extends CallBD {
    
    public Jajargenjang(double a, double t, double m){
        this.a = a;
        this.t = t;
        this.m = m;
        this.L = a*t;
        this.K = (a+m)*2;
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
