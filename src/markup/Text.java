package markup;

public class Text implements MarkDown {
    private String text;
    // Конструктор
    public Text(String text) {
        this.text = text;
    }

    public void toMarkdown(StringBuilder sb){
        sb.append(text);
    }

    @Override
    public void toTypst(StringBuilder sb) {
        sb.append(text);
    }
}
