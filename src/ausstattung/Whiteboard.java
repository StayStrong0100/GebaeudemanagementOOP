package ausstattung;

public class Whiteboard extends Tafel{

    private WhiteboardTyp exemplarTyp;

    public Whiteboard(WhiteboardTyp exemplarTyp){
        this.exemplarTyp = exemplarTyp;
    }

    public WhiteboardTyp getExemplarTyp() {
        return exemplarTyp;
    }

    public void setExemplarTyp(WhiteboardTyp exemplarTyp) {
        this.exemplarTyp = exemplarTyp;
    }
}
