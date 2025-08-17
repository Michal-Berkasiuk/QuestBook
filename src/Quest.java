import java.util.List;

public class Quest {

    private boolean attainable;
    private boolean completed;
    private final String title;
    private final String description;
    private List<Quest> prerequisites;
    private List<Quest> advancements;

    public Quest( boolean completed, boolean attainable, String title, String description ) {
        this.completed = completed;
        this.attainable = attainable;
        this.title = title;
        this.description = description;
    }

    public String Title(){
        return title;
    }
    public String Description(){
        return description;
    }
    public boolean Completed() {
        return completed;
    }
    public boolean Attainable() {
        return attainable;
    }

    public List<Quest> Advancements() {
        return advancements;
    }

    public boolean isFinalQuest(){
        return advancements.isEmpty();
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    private void setAttainable(boolean attainable) {
        this.attainable = attainable;
    }

}
