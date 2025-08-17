import java.util.List;

public class QuestTree {

    private List<Quest> starterQuests;
    private List<Quest> finalQuests;
    public QuestTree(List<Quest> starterQuests, List<Quest> finalQuests) {
        this.starterQuests = starterQuests;
        this.finalQuests = finalQuests;
    }

    public void addQuest(Quest quest) {

    }

    private boolean findQuest(Quest quest, List<Quest> searchList) {

        boolean found = false;

        for (Quest q : searchList) {
            if (q.equals(quest)) {found = true; break;}

            else if (!q.isFinalQuest()){
                findQuest(quest, q.Advancements());
            }
        }
        return found;
    }

}
