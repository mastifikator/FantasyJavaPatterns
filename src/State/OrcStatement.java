package State;

public abstract class OrcStatement {

    Orc orc;

    public OrcStatement(Orc orc) {
        this.orc = orc;
    }

    public void orcBeat(){
        System.out.println("Орк, палка, бить!" );
    }

    public void orcRun(){
        System.out.println("Орк, бежать!" );
    }

    public abstract void orcCry();

}
