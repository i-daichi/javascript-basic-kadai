public abstract class Kato_Chapter17{
    public String familyName="katou";
    public String givenName;
    public String address;

    public void commonIntroduce(){
        Svstem.out.println("私の名前は"+familyName+givenName+"です");
    }

    abstract public void eachIntroduce();

    public void execIntroduce(){
        commonIntroduce();
        eachIntroduce();
    }
}