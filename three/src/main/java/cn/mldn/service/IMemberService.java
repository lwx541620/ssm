package cn.mldn.service;

import java.util.List;

import cn.mldn.vo.Member;

public interface IMemberService 
{
	public boolean add(Member vo) throws Exception;

	public List<Member> split(String column, String keyWord, int currentPage, int lineSize) throws Exception;
}
