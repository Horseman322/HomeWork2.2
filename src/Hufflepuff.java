public class Hufflepuff extends Hogwards {
    private int oreLoving;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int magic, int transgression, int oreLoving, int loyal, int honest) {
        super(name, magic, transgression);
        this.oreLoving = oreLoving;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getOreLoving() {
        return oreLoving;
    }

    public void setOreLoving(int oreLoving) {
        this.oreLoving = oreLoving;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
    private int ability() {
        return oreLoving + loyal + honest;
    }

    public void compareHufflepuff(Hufflepuff hufflepuff){
        int ability1 = ability();
        int ability2 = hufflepuff.ability();
        if(ability1 > ability2){
            System.out.printf("Пуффендуец %s лучше, Пуффендуйца %s: %d VS %d%n", getName(), hufflepuff.getName(), ability1, ability2);
        } else if (ability1 < ability2){
            System.out.printf("Пуффендуец %s лучше, Пуффендуйца  %s: %d VS %d%n", getName(), hufflepuff.getName(), ability1, ability2);
        } else {
            System.out.printf("Пуффендуец %s такой же, как Пуффендуец  %s: %d VS %d%n", getName(), hufflepuff.getName(), ability1, ability2);
        }
    }
    public String toString() {
        return String.format("%s; трудолюбие %d; верность %d; честность %d", super.toString(), oreLoving, loyal, honest);
    }
}
