package global.sesoc.web5.dao;
import java.util.ArrayList;

import global.sesoc.web5.vo.BbsVO;

public interface BbsMapper {

	public int inputBbs(BbsVO vo);
	public ArrayList<BbsVO> getList();
	public int deleteBbs(BbsVO vo);
}
