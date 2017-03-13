package com.nmnet.mapper;

import com.nmnet.pojo.Job;

import java.util.List;

/**
 * Created by NMNET on 2017/3/13 0013.
 */
public interface JobMapper {

    /**
     * 查询所有job
     * @return
     */
    List<Job> queryAllJobs();

    /**
     * 根据id查询job
     * @param id
     * @return
     */
    Job queryJobById(Integer id);

    /**
     * 增加一个新工作
     * @param job
     * @return
     */
    Integer addNewJob(Job job);

    /**
     * 根据id删除一个job
     * @param id
     * @return
     */
    Integer deleteJobById(Integer id);

    /**
     * 更新一个job
     * @param job
     * @return
     */
    Integer updateJob(Job job);



}
