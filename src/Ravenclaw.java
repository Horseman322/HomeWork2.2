public class Ravenclaw extends Hogwards {
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Ravenclaw(String name, int magic, int transgression, int smart, int wise, int witty, int fullOfCreativity) {
        super(name, magic, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }
    private int ability() {
        return smart + wise + witty + fullOfCreativity;
    }
    public void compareRavenclaw(Ravenclaw ravenclaw){
        int ability1 = ability();
        int ability2 = ravenclaw.ability();
        if(ability1 > ability2){
            System.out.printf("Пуффендуец %s лучше, Пуффендуйца %s: %d VS %d%n", getName(), ravenclaw.getName(), ability1, ability2);
        } else if (ability1 < ability2){
            System.out.printf("Пуффендуец %s лучше, Пуффендуйца  %s: %d VS %d%n", getName(), ravenclaw.getName(), ability1, ability2);
        } else {
            System.out.printf("Пуффендуец %s такой же, как Пуффендуец  %s: %d VS %d%n", getName(), ravenclaw.getName(), ability1, ability2);
        }
    }
    public String toString() {
        return String.format("%s; ум %d; мудрость %d; остроумие %d; творчество", super.toString(), smart, wise, witty, fullOfCreativity);
    }
}
