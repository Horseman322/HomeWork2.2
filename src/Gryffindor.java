public class Gryffindor extends Hogwards {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    private int ability() {
        return nobility + honor + bravery;
    }

    public void compareGryffindor(Gryffindor gryffindor){
        int ability1 = ability();
        int ability2 = gryffindor.ability();
        if(ability1 > ability2){
            System.out.printf("Грифиндорец %s лучше, Грифиндорца %s: %d VS %d%n", getName(), gryffindor.getName(), ability1, ability2);
        } else if (ability1 < ability2){
            System.out.printf("Грифиндорец %s лучше, Грифиндорца  %s: %d VS %d%n", getName(), gryffindor.getName(), ability1, ability2);
        } else {
            System.out.printf("Грифиндорец %s такой же, как Грифиндорца  %s: %d VS %d%n", getName(), gryffindor.getName(), ability1, ability2);
        }
    }
    public String toString() {
        return String.format("%s; благородство %d; честь %d; храбрость %d", super.toString(), nobility, honor, bravery);
    }
}
