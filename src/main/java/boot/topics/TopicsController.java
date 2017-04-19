package boot.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by HeroDishonest on 16.04.2017.
 */
@RestController
public class TopicsController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topics> ShowAllTopics(){
        return topicService.getTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topics getTopic(@PathVariable String id){
        return topicService.getTopicById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public  void addTopic(@RequestBody Topics topic){
        topicService.getTopics().add(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public  void addTopic(@RequestBody Topics topic, @PathVariable String id){
        topicService.updateTopic(topic, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public  void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }

}
