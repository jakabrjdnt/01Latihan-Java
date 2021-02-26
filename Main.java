
package seriusinimah;

import java.util.Scanner;

/*** Naks bab1
 * @author jakab
 */

final class Main {
    
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("Memulai program sederhana");
        System.out.println("-------------------------");
        Main gow = new Main();
        
        gow.inputOption();
        System.out.println("Terimakasih....");
        
    }
    
    private static void inputOption(){
        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean islanjutkan = true;
        double s=0,a=0,t=0,r=0,m=0,p=0,l=0,L=0,K=0;
        
        // Objk Bangun datar
        
        while(islanjutkan){
            clearScreen();
            System.out.println("\nBangun datar yg akan dihitung: \n");
            System.out.println("1. Persegi");
            System.out.println("2. Segitiga");
            System.out.println("3. Lingkaran");
            System.out.println("4. Jajargenjang");
            System.out.println("5. Persegi Panjang");
            System.out.println("6. Semua bangun datar");
            System.out.println("7. Batal");

            System.out.print("\nPilihan anda: ");
            pilihanUser = terminalInput.next();

            switch(pilihanUser){
                case "1":
                    System.out.println("\t=========");
                    System.out.println("\t PERSEGI");
                    System.out.println("\t=========");
                    System.out.print("Masukan nilai sisi: ");
                    s = terminalInput.nextDouble();
                    // lalu fungsi hitungan
                    CallBD psg = new Persegi(s);
                    System.out.println("Luas     = " + psg.getLuas());
                    System.out.println("Keliling = " + psg.getKelg());
                    break;
                case "2":
                    System.out.println("\t===============");
                    System.out.println("\t SEGITIGA SIKU");
                    System.out.println("\t===============");
                    System.out.print("Masukan nilai alas: ");
                    a = terminalInput.nextDouble();
                    System.out.print("Masukan nilai tinggi: ");
                    t = terminalInput.nextDouble();
                    m = Math.sqrt(a*a+t*t);
                    //
                    CallBD sgt = new Segitiga(a,t,m);
                    System.out.println("Luas     = " + sgt.getLuas());
                    System.out.println("Keliling = " + sgt.getKelg());
                    break;
                case "3":
                    System.out.println("\t===========");
                    System.out.println("\t LINGKARAN");
                    System.out.println("\t===========");
                    System.out.print("Masukan nilai jari-jari: ");
                    r = terminalInput.nextDouble();
                    //
                    CallBD lkg = new Lingkaran(r);
                    System.out.println("Luas     = " + lkg.getLuas());
                    System.out.println("Keliling = " + lkg.getKelg());
                    break;
                case "4":
                    System.out.println("\t==============");
                    System.out.println("\t JAJARGENJANG");
                    System.out.println("\t==============");
                    System.out.print("Masukan nilai alas: ");
                    a = terminalInput.nextDouble();
                    System.out.print("Masukan nilai tinggi: ");
                    t = terminalInput.nextDouble();
                    System.out.print("Masukan nilai miring: ");
                    m = terminalInput.nextDouble();
                    //
                    CallBD jjg = new Jajargenjang(a,t,m);
                    System.out.println("Luas     = " + jjg.getLuas());
                    System.out.println("Keliling = " + jjg.getKelg());
                    break;
                case "5":
                    System.out.println("\t=================");
                    System.out.println("\t PERSEGI PANJANG");
                    System.out.println("\t=================");
                    System.out.print("Masukan nilai panjang: ");
                    p = terminalInput.nextDouble();
                    System.out.print("Masukan nilai lebar: ");
                    l = terminalInput.nextDouble();
                    //
                    CallBD psp = new PersegiPanjang(p,l);
                    System.out.println("Luas     = " + psp.getLuas());
                    System.out.println("Keliling = " + psp.getKelg());
                    break;
                case "6":
                    System.out.println("\t====================");
                    System.out.println("\t SEMUA BANGUN DATAR");
                    System.out.println("\t====================");
                    System.out.println("Dimensi bangun ruang ditetapkan...");
                    System.out.println("------------------------------------");
                    //
                    CallBD psga = new Persegi(5);
                    System.out.println("Persegi(s=4)");
                    System.out.println("Luas     = " + psga.getLuas());
                    System.out.println("Keliling = " + psga.getKelg());
                    System.out.println("------------------------------------");
                    CallBD sgta = new Segitiga(6,8,10);
                    System.out.println("Segitiga(a=6,t=8,m=10");
                    System.out.println("Luas     = " + sgta.getLuas());
                    System.out.println("Keliling = " + sgta.getKelg());
                    System.out.println("------------------------------------");
                    CallBD lkga = new Lingkaran(10);
                    System.out.println("Lingkaran(r=10)");
                    System.out.println("Luas     = " + lkga.getLuas());
                    System.out.println("Keliling = " + lkga.getKelg());
                    System.out.println("------------------------------------");
                    CallBD jjga = new Jajargenjang(8,4,5);
                    System.out.println("Jajargenjang(a=8,t=4,m=5");
                    System.out.println("Luas     = " + jjga.getLuas());
                    System.out.println("Keliling = " + jjga.getKelg());
                    System.out.println("------------------------------------");
                    CallBD pspa = new PersegiPanjang(10,5);
                    System.out.println("Persegi Panjang(p=10,l=5)");
                    System.out.println("Luas     = " + pspa.getLuas());
                    System.out.println("Keliling = " + pspa.getKelg());
                    System.out.println("------------------------------------");
                    break;
                case "7":
                    System.exit(0);
                    break;
                default:
                    System.err.println("\nInput anda salah!(1-7)");
            }
            
            islanjutkan = getYorN("Apakah anda ingin lanjut?");
        }
        
    }
    
    private static boolean getYorN(String message){
        Scanner terminalInput = new Scanner(System.in);
        System.out.println("\n"+message+"(y/n)");
        String pilihanUser = terminalInput.next();
        
        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.err.println("Mohon pilih y/n");
            System.out.println("\n"+message+"(y/n)");
            pilihanUser = terminalInput.next();
        }
        return pilihanUser.equalsIgnoreCase("y");
    }
    
    private static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.println("\033\143");
            }
        } catch (Exception e) {
            System.err.println("Tidak bisa clearscreen");
        }
    }
    
    
}
