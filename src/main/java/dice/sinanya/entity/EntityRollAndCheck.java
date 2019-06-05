package dice.sinanya.entity;

public class EntityRollAndCheck {
    String nick;
    int random;
    int skill;

    public EntityRollAndCheck(String nick, int random, int skill) {
        this.nick = nick;
        this.random = random;
        this.skill = skill;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }
}
