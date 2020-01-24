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
public abstract class Animal {
    protected String nom;
    protected String espece;
    protected  int age;
    
    
    public Animal(String p_nom, String p_espece, int p_age){
        this.nom = p_nom;
        this.espece = p_espece;
        this.age = p_age;
    }
//        public Animal(String p_nom, String p_espece){
//        this.nom = p_nom;
//        this.espece = p_espece;
//        
//    }
//        
//    public Animal(String p_nom){
//    this.nom = p_nom;          
//    }
    
    public String getNom(){
        return this.nom;
    }
    
    public String getEspece(){
        return this.espece;
    }
    public int getAge(){
        return this.age;
    }
    public void setNom(String p_nom){
        this.nom = p_nom;
    }

    public void setEspece(String p_espece){
        this.espece = p_espece;
    }
    
    public void setAge(int p_age){
        this.age = p_age;
    }    
    
    
    public String manger(String nourriture){
        return "Je peux manger " + nourriture; 
    }
    
    public abstract String dormir();
    
    @Override
    public String toString(){
    return "Je m'appelle " + nom + " j'ai " + age + " ans, je suis un " + espece;
    }
}
