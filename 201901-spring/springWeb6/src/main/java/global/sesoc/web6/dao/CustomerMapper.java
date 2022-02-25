package global.sesoc.web6.dao;

import global.sesoc.web6.vo.CustomerVO;

public interface CustomerMapper {

	public int insertCustomer(CustomerVO vo);
	public int updateCustomer(CustomerVO vo);
	public CustomerVO searchById(String id);
	
}
