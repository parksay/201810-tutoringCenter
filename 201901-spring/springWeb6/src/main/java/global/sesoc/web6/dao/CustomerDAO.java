package global.sesoc.web6.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.web6.vo.CustomerVO;

@Repository
public class CustomerDAO {

	
	@Autowired
	SqlSession sqlSession;
	
	public int insert(CustomerVO vo){
		
		int result=0;
		
		CustomerMapper cmapper = sqlSession.getMapper(CustomerMapper.class);
		result = cmapper.insertCustomer(vo);
		
		return result;
		
		/*
		 //private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
		//SqlSession ss = null;
		int result = 0;
		try {
			ss = factory.openSession();
			CustomerMapper cmapper = ss.getMapper(CustomerMapper.class);
			result = cmapper.insertCustomer(vo);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}		
		return result;*/
	}
	
	
	public CustomerVO getCustomer(String id){
		CustomerVO vo = null;
		CustomerMapper cmapper = sqlSession.getMapper(CustomerMapper.class);
		vo = cmapper.searchById(id);
		return vo;
	}
	
	public int updateCust(CustomerVO vo) {
		CustomerMapper cmapper = sqlSession.getMapper(CustomerMapper.class);
		int check = 0;
		check = cmapper.updateCustomer(vo);
		
		
		return check;
	}
	
}