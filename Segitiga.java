
package seriusinimah;

public class Segitiga extends CallBD{
    
    public Segitiga(double a, double t, double m){
        this.a = a;
        this.t = t;
        this.m = m;
        this.L = a*t/2;
        this.K = a+t+m;
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
