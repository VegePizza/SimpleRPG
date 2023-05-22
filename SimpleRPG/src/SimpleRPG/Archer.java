package SimpleRPG;

// The Archer class extends the Hero class.
public class Archer extends Hero {
        
    // Constructor for an Archer object.
    public Archer(String name) {
        super(name, "Archer", 100, 5, 10, 5, 1, 6);
    }

    // The Archer's specific attack method, which overrides the attack method in Hero.
    @Override
    public void attack() {
        System.out.println("*** " + this.name + " shoots an arrow with agility " + this.agility + " ***");
    }
}

