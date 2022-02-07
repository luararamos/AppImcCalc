package co.tiagoaguiar.codelab.myapplication;

public class MainItem {

    private int id;
    private int drawableI;
    private int textStringId;
    private  int color;

    public MainItem(int id, int drawableI, int textStringId, int color) {
        this.id = id;
        this.drawableI = drawableI;
        this.textStringId = textStringId;
        this.color = color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setDrawableI(int drawableI) {
        this.drawableI = drawableI;
    }

    public void setTextStringId(int textStringId) {
        this.textStringId = textStringId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getColor() {
        return color;
    }

    public int getDrawableI() {
        return drawableI;
    }

    public int getTextStringId() {
        return textStringId;
    }
}
