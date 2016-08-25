package com.kzsrm.service;

import java.util.List;

import com.kzsrm.baseservice.BaseServiceMybatis;
import com.kzsrm.model.Homework;

public interface HomeworkService extends BaseServiceMybatis<Homework, String> {

	/**
	 * 作业列表
	 * 
	 * @return
	 */
	List<Homework> getHomeworkList(String userId,String homeworkId, int pageCount);
	
	/**
	 * 已答题数量
	 * 
	 * @return
	 */
	Integer getHasDoneSubNum(int homeworkId, String userId);

}