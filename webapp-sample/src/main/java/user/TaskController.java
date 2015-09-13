package user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("tasks")
public class TaskController {
    protected final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping("count")
    @ResponseBody
    public long count() {
        return taskRepository.count();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Task find(@PathVariable("id") Integer id) {
        return taskRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Task add(@RequestBody Task task) {
        task = taskRepository.save(task);
        return task;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Task> findAll() {
        return taskRepository.findAll();
    }
}