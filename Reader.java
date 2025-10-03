public class Reader {
    
    private String element;
    private Converter converter;

    public Reader(String element, Converter converter){
        this.element = element;
        this.converter= converter;
    }

    //Metodos

    public void parseInput(){
        switch (element) {
            case "LLINE":
                converter.makeLine();
                break;

            case "PRAGRAPH":
               converter.makeParagraph();
               break;
            case "TABLE"
            default:
                break;
        }
    }
}
