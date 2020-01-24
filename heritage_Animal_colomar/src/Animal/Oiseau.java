/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author CDA03-02
 */
public class Oiseau extends Animal {
    
   private int nombreDePlumes; 
   
   
   
    public Oiseau(String p_nom,String p_espece,int p_age, int p_plume){    
    super(p_nom, p_espece, p_age);
    this.nombreDePlumes = p_plume;
    }
    
    
    public int getPlume(){
        return this.nombreDePlumes;
    }
    
    public void getPlume(int p_plume){
     this.nombreDePlumes = p_plume;
    }
    
    public String voler(){
        return "Jack! Je vole!";
    }
    
    @Override
    public String manger(String nourriture){
        return "Je ne mange que " + nourriture;
    }
    
   @Override
   public String dormir(){
      return "je dors dans un nid";
   }
   
  @Override
  public String toString(){
      return super.toString()+ " et j'ai " + nombreDePlumes + " plumes";
  }

}