// private boolean saltWater (true == saltWater fish)
// boolean saltWater
// is a subclass of Pet
// implements Edible
public class Fish extends Pet implements Edible{
  private boolean saltWater;

  public Fish(){}
  public Fish(String name, String owner, boolean vaccinated){
    super(name, owner, vaccinated);
  }

  public Fish(String name, String owner, boolean vaccinated, boolean saltWater){
    super(name,owner, vaccinated);
    this.setSaltWater(saltWater);
  }

  public void setSaltWater(boolean saltWater){
    this.saltWater = saltWater;
  }
  public boolean getSaltWater(boolean saltWater){
    return this.saltWater;
  }

  @Override 
  public String sounds(){
    return "Womp womp womp";
  }

  @Override
  public String howToEat(){
    return "edible";
  }

  @Override
   public String toString(){
      return super.toString() + "\nSalt Water: " + Boolean.toString(saltWater);
  }
}