package boot.topics;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by HeroDishonest on 19.04.2017.
 */

@Service
public class TopicService {


    List<Topics> list = new ArrayList<>(Arrays.asList(
            new Topics("1", "Java", "11.4"),
            new Topics("2", "Python", "17.4"),
            new Topics("3", "C#", "24.4")
    ));

    public Topics getTopicById(String id){
        return list.stream().filter(topics -> topics.getId().equals(id)).findFirst().get();
    }

    public List<Topics> getTopics() {
        return list;
    }


    public void updateTopic(Topics topic, String id) {
        for (int i = 0; i <list.size() ; i++) {
            Topics temp = list.get(i);
            if (temp.getId().equals(id)){
                list.set(i,topic);
            }
        }
    }

    public void deleteTopic(String id) {
        list.removeIf(topics -> topics.getId().equals(id));
    }
}
