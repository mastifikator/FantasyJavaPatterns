package Adapter;

public class HumanToOrcBarracksAdapter extends Orc{

    private Human human;

    public HumanToOrcBarracksAdapter(Human human) {
        this.human = human;
    }

    @Override
    public int tellMeTheOrcPassword() {
        return super.tellMeTheOrcPassword();
    }
}
