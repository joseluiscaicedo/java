class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
  int numero, repeticion,cont,cont2;
        numero=0;repeticion=0; cont=0; cont2=0;
        for (int i=0; i< taille; i++){
            for (int j=0; j<taille; j++){
                if (tab1[i]==tab1[j])
                    cont+=1;
            }
            
            if (cont>repeticion){
                numero=tab1[i];
                repeticion=cont;
            }cont=0;
        }System.out.println("Le nombre le plus frequent dans le tableau est le : ");
        System.out.println(numero+" ("+repeticion+" x)");
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}
