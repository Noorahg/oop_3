package com.company;

public class Fish {
    private String name;
    private String species;
    private String colour;
    private String food;
    private int age;
    private int dateoflastfeeding;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSpecies(){
        return species;
    }
    public void setSpecies(String species){
        this.species=species;
    }
    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour=colour;
    }
    public String getFood(){
        return  food;
    }
    public void setFood(String food){
        this.food=food;
    }
     public int getAge(){
        return age;
     }
     public void setAge( int age){
        this.age=age;
     }
     public int getDateoflastfeeding() {
        return dateoflastfeeding;
     }
     public void setDateoflastfeeding(int dateoflastfeeding){
        this.dateoflastfeeding=dateoflastfeeding;
     }
     void checkfeed(int dateoflastfeeding){
        if(dateoflastfeeding<=6){
            System.out.println("Не надо кормить");
        } else{
            System.out.println("Надо покормить");
        }

     }


}
