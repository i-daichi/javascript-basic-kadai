class KatoExec_Chapter17{
    public void main(){
        KatoHanako_Chapter17 hanako= new KatoHanako_Chapter17();
        KatoTaro_Chapter17 taro= new KatoTaro_Chapter17();
        KatoIchiro_Chapter17 ichiro= new KatoIchiro_Chapter17();

        hanako.setGivenName();
        hanako.execIntroduce();

        taro.setGivenName();
        taro.execIntroduce();

        ichiro.setGivenName();
        ichiro.execIntroduce();
    }
}