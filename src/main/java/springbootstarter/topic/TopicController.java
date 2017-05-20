package springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by marti on 2017-04-22.
 */
@RestController
public class TopicController
{
    @Autowired
    private TopicService topicService;

    @RequestMapping(value = "/topics",method = RequestMethod.GET)
    public List<Topic> getAllTopics()
    {
        return topicService.getAllTopics();
    }

    @RequestMapping(value = "/topics/{id}",method = RequestMethod.GET)
    public Topic getTopic(@PathVariable String id)
    {
        return topicService.getTopic(id);
    }

    @RequestMapping(value = "/topics",method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic)
    {
        topicService.addTopic(topic);
    }

    @RequestMapping(value = "/topics/{id}",method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id)
    {
        topicService.updateTopic(topic,id);
    }

   /* @RequestMapping(value = "/topics",method = RequestMethod.DELETE)
    public void deleteTopic(@RequestBody Topic topic)
    {
        topicService.addTopic(topic);
    }*/
}
