import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        double t=0;
        double hauteur=0.000;
        double vitesse= 0.000;
        double accel= 9.81;
        double g = 9.81;
        double t0 =0.0;
        double v0=0.000;
        double surface = 2.0;
        double s = surface / masse;
        int depasse =0;
        int accelinferiour=0;
        int disminucionaltura=0;
        do {
        	double q = (Math.exp(-s*(t-t0)));
           	vitesse = (g / s) * (1 -q) + v0 * q; 
        	hauteur = h0 - (g / s) * (t - t0) - ((v0 - (g / s)) / s) * (1 - q);
        	//hauteur = h0 - g/s*(t-t0)-(v0-g/s)/s*(1-q);
        	accel = g-(s*vitesse);
        	if ((vitesse>342.99)&& (depasse==0)) {
        		System.out.println("## Felix depasse la vitesse du son");
        	depasse=1;	
        	}
        	if ((accel < 0.5)&&(accelinferiour==0)){
        		System.out.println("## Felix a atteint sa vitesse maximale");
        		accelinferiour=1;	
        	}
        	if ((hauteur < 2500)&&(disminucionaltura==0)&&(t>0)){
            	s=25.0/masse;
            	System.out.println("## Felix ouvre son parachute");
            	disminucionaltura=1;
            	t0=t;
            	h0=hauteur;
            	v0=vitesse;
            	//Cambiar t0, v0 y h0 por sus valores actuales
            }
        	if (hauteur > 0){
            System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, hauteur, vitesse, accel);
        	}        	
            t= t+1;        
        } while (hauteur > 0);
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}