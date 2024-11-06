package markup;

import java.util.List;

public class Strikeout extends MarkDownElement {
    public Strikeout(List<MarkDown> elements) {
        super(elements);
    }

    public void toMarkdown(StringBuilder sb){
        sb.append("~");
        super.toMarkdown(sb);
        sb.append("~");
    }

    @Override
    public void toTypst(StringBuilder sb) {
        sb.append("#strike[");
        super.toTypst(sb);
        sb.append("]");
    }
}
