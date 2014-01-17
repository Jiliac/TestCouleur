import Comparaison.ListePoints;

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

	/*
	 * III - comparer a une forme
	 * 
	 * 
	 * III - preambule: pour determiner la dimension generale des formes
	 * auxquelles on compare il faudrait creer un indice de dispersion generale
	 * 
	 * III - a - pour chaque forme, pour chaque point, on le raproche d'un point
	 * de la forme; on associe une distance à ce point
	 * 
	 * III - b - on calcule un indice de "distance" à la forme est on determine
	 * la forme qui est la plus proche
	 */

}
