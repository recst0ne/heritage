/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage_exo1;
import Animal.Animal;
import Animal.Chien;
import Animal.Oiseau;
/**
 *
 * @author CDA03-02
 */
public class Heritage_exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    //Animal animal = new Animal("Boudu", "Carcanipinsson", 132);  
        
    Chien leeloo = new Chien ("Leeloo", "chien", 2, "Husky");
      
    System.out.println(leeloo);   
    System.out.println(leeloo.manger(" de la pâté ou des croquettes"));
    System.out.println(leeloo.aboyer());
    System.out.println(leeloo.dormir());
    
    Oiseau oiseau = new Oiseau("Donald", "canard", 4, 12447);    
    
    System.out.println(oiseau);
    System.out.println(oiseau.manger("des graines"));
    System.out.println(oiseau.voler());
    System.out.println(oiseau.dormir());
    }  
}
