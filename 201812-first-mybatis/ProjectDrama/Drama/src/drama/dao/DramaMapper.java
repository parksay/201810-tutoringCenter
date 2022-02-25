package drama.dao;

import java.util.ArrayList;
import java.util.HashMap;

import drama.vo.DramaVO;
import drama.vo.ReplyVO;

public interface DramaMapper {

	public ArrayList<DramaVO> printDrama(int choice);
	public ArrayList<DramaVO> searchDrama(HashMap hm);
	public ArrayList<DramaVO> getDrama();
	public ArrayList<ReplyVO> getReply();
}
