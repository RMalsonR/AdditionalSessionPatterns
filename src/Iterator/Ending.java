package Iterator;


public class Ending implements WordPart {

    private String part;

    public Ending(String part) {
        this.part = part;
    }

    @Override
    public String getWordPart() {
        return part;
    }
}