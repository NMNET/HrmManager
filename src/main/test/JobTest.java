import com.nmnet.mapper.JobMapper;
import com.nmnet.pojo.Job;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by NMNET on 2017/3/13 0013.
 */
public class JobTest {

    
    @Test
    public void queryAllJobs() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        JobMapper jobMapper = ac.getBean(JobMapper.class);
        List<Job> jobs = jobMapper.queryAllJobs();
        System.out.println(jobs);
    }

    @Test
    public void queryJobById() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        JobMapper jobMapper = ac.getBean(JobMapper.class);
        Job job = jobMapper.queryJobById(3);
        System.out.println(job);
    }

}
