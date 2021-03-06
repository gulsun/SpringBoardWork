package com.school.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.school.bean.BoardList;
import com.school.bean.Members;
import com.school.bean.ReplyList;

public interface MemberInterface {
	public int getLoginResult(Map<String, String> map);
	public Members getMemberInfo(String id);
	public List<BoardList> getBoardList(int pageNum);
	public int getPageCount();
	public BoardList getContents(int bnum);
	public List<ReplyList> getReply(int bnum);
	public int rInsert(ReplyList rl, DataSourceTransactionManager txManager);
	public int memInsert(Members mb);
	
}
