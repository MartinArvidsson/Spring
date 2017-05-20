package springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by marti on 2017-04-22.
 */
@Service
public class TopicService
{
    private  List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
                new Topic("Spring","Spring Framework","Spring Framework Description"),
                new Topic("Java","Core Java","Core Java Description"),
                new Topic("Javascript","Javascript","Javascript Description")
                ));

    public List<Topic> getAllTopics()
    {
        return topics;
    }

    public Topic getTopic(String id)
    {
        for(Topic t :getAllTopics())
        {
            System.out.println(t.getId().equals(id));
            if(t.getId().equals(id))
            {
                return t;
            }
        }
        return null;
    }

    public void addTopic(Topic topic)
    {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id)
    {
        for (int i = 0; i < topics.size(); i++)
        {
            Topic t = topics.get(i);
            if(t.getId().equals(id))
            {
                topics.set(i,topic);
            }
        }
    }
}
