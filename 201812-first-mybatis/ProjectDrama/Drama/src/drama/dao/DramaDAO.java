package drama.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import drama.vo.DramaVO;
import drama.vo.ReplyVO;


public class DramaDAO {
	
	
	private SqlSessionFactory ssf; 
	
	public DramaDAO() {
		ssf = DramaConfig.getSqlSessionFactory();
	}
	
	public ArrayList<DramaVO> print(int choice) {
		SqlSession ss = null;
		ArrayList<DramaVO> tmp_list = null;
		try {
			ss = ssf.openSession();
			DramaMapper dmapper = ss.getMapper(DramaMapper.class);
			tmp_list = dmapper.printDrama(choice);
			ss.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("프린트 중 오류");
		} finally {
		ss.close();
		return tmp_list;
		}
	}
	
	
	
	public ArrayList<DramaVO> searchFor(int choice, String keyword) {
		SqlSession ss = null;
		ArrayList<DramaVO> tmp_list = null;
		
		HashMap<String, Object> hm = null;
		hm = new HashMap<String,Object>();
		hm.put("choice", choice);
		hm.put("keyword", keyword);
		
		try {
			ss = ssf.openSession();
			DramaMapper dm = ss.getMapper(DramaMapper.class);
			tmp_list = dm.searchDrama(hm);
			ss.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("서치 중 오류");
		} finally {
			ss.close();
		}	
		return tmp_list;	
		
	}
	

	public ArrayList<DramaVO> getDlist() {
	
	SqlSession ss = null;
	ArrayList<DramaVO> tmp_list = null;
	try {
		ss = ssf.openSession();
		DramaMapper dmapper = ss.getMapper(DramaMapper.class);
		tmp_list = dmapper.getDrama();
		ss.commit();
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("드라마 리스트 중 오류");
	} finally {
	ss.close();
	}
	return tmp_list;
	}
	
	public ArrayList<ReplyVO> getRlist() {
	SqlSession ss = null;
	ArrayList<ReplyVO> tmp_list = new ArrayList<>();
	try {
		ss = ssf.openSession();
		DramaMapper dmapper = ss.getMapper(DramaMapper.class);
		tmp_list = dmapper.getReply();
		System.out.println(tmp_list.size());
		ss.commit();
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("드라마 리스트 중 오류");
	} finally {
	ss.close();
	}
	return tmp_list;
	}
}
