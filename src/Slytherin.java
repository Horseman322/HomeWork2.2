public class Slytherin extends Hogwards {
    private int cunning;
    private int determination;
    private int ambition;
    private int recourseFulness;
    private int thirstForPower;

    public Slytherin(String name, int magic, int transgression, int cunning, int determination, int ambition, int recourseFulness, int thirstForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.recourseFulness = recourseFulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getRecourseFulness() {
        return recourseFulness;
    }

    public void setRecourseFulness(int recourseFulness) {
        this.recourseFulness = recourseFulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    private int ability() {
        return cunning + determination + ambition + recourseFulness + thirstForPower;
    }
    public void compareSlytherin(Slytherin slytherin){
        int ability1 = ability();
        int ability2 = slytherin.ability();
        if(ability1 > ability2){
            System.out.printf("Слизеринец %s лучше, слизеринца %s: %d VS %d%n", getName(), slytherin.getName(), ability1, ability2);
        } else if (ability1 < ability2){
            System.out.printf("Слизеринец %s лучше, слизеринца  %s: %d VS %d%n", getName(), slytherin.getName(), ability1, ability2);
        } else {
            System.out.printf("Слизеринец %s такой же, как слизеринец  %s: %d VS %d%n", getName(), slytherin.getName(), ability1, ability2);
        }
    }
    public String toString() {
        return String.format("%s; хитрость %d; решительность %d; амбициозность %d; находчивость %d; жажда власти %d", super.toString(), cunning, determination, ambition, recourseFulness, thirstForPower);
    }
}


