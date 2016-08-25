package com.kzsrm.service;

import com.kzsrm.baseservice.BaseServiceMybatis;
import com.kzsrm.model.Option;
import com.kzsrm.model.Subject;
import com.kzsrm.model.SubjectExamLog;

public interface SubjectExamLogService  extends BaseServiceMybatis<SubjectExamLog, String> {
	/**
	 * 更新或保存答题记录
	 * @param opt
	 * @param sub
	 * @param userId
	 */
	void saveOrUpdate(Option opt, Subject sub, String userId);

}
