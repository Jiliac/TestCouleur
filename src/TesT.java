public class TesT {

	public static void main(String[] args) {
		Segmentation seg = new Segmentation();
		ListePoints frontiere = seg.getFrontiere();
		int indice = frontiere.comparaisonCercle();
		/*
		 * Là j'ai un indice qui quantifie si la liste de point est proche ou non d'un cercle
		 * Cet indice ne demande plus qu'à être exploité
		 */
	}


}
