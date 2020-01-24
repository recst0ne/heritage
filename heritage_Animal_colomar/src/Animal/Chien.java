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
public class Chien extends Animal{
    private String race;
   
    
    public Chien(String p_nom,String p_espece,int p_age, String p_race){    
    super(p_nom, p_espece, p_age);
    this. race = p_race;
    }
    
  public String aboyer(){
      return "J'aboie";      
  }

  
  public String getRace(){
      return this.race;
  }
  
    public void getRace(String p_race){
      this.race = p_race;
  }
  
  
   @Override
   public String dormir(){
      return "je dors dans une niche";
   }
   
  @Override
  public String toString(){
      return  super.toString()+" et je suis de race " + race;
  }
   
   
}
