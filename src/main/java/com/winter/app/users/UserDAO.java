package com.winter.app.users;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.winter.app.users.UserDAO.";
	
	public int join(UserDTO userDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"join", userDTO);
				
	}
	
	//user 한명의 정보를 조회,(username)
	public UserDTO getDetail(UserDTO userDTO)throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getDetail", userDTO);
	}

}
