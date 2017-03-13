import com.nmnet.mapper.JobMapper;
import com.nmnet.pojo.Job;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by NMNET on 2017/3/13 0013.
 */
public class JobTest {

    private JobMapper jobMapper;

    @Before
    public void init() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        jobMapper = ac.getBean(JobMapper.class);
    }

    @Test
    public void queryAllJobs() {
        List<Job> jobs = jobMapper.queryAllJobs();
        System.out.println(jobs);
    }

    @Test
    public void queryJobById() {
        Job job = jobMapper.queryJobById(3);
        System.out.println(job);
    }

}
