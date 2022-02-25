package board.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import board.vo.BoardVO;

public class BoardDAO {
	SqlSessionFactory ssf = BoardConfig.getSqlSessionFactory();

public int insertBoard(BoardVO b) {
	SqlSession ss = null;
	int check = 0;
	try{
		ss = ssf.openSession();
		BoardMapper bmapper = ss.getMapper(BoardMapper.class);
		check = bmapper.insertBoard(b);
		ss.commit();	
	}
	catch(Exception e){
		System.out.println("insert �� ����");
		e.printStackTrace();
	}
	finally{
		if( ss != null ) {
			ss.close();
			}
	}
	return check;
	}


public ArrayList<BoardVO> selectBoard() { 
	SqlSession ss = null;
	ArrayList<BoardVO> list = null;
	try {
		ss = ssf.openSession();
		BoardMapper bmapper = ss.getMapper(BoardMapper.class);
		list = bmapper.selectBoard();
		ss.commit();
	} catch (Exception e) {
		System.out.println("����Ʈ �� ����");
		e.printStackTrace();
		}
	finally{
		ss.close();
	}
	return list;
}

public int removeBoard(int n) {
	SqlSession ss = null;
	int check = 0;
	try{
		ss = ssf.openSession();
		BoardMapper bmapper = ss.getMapper(BoardMapper.class);
		check = bmapper.deleteBoardbyNum(n);
		ss.commit();
	} catch(Exception e) {
		System.out.println("������ �� ����");
		e.printStackTrace();
	} finally{
		ss.close();
	}
	return check;
}

public ArrayList<BoardVO> search(int type, String keyword) {
	SqlSession ss = null;
	ArrayList<BoardVO> list = null;
	try {
			ss = ssf.openSession();
			BoardMapper bmapper = ss.getMapper(BoardMapper.class);
			
			HashMap<String, Object> hmap = new HashMap<>();
			hmap.put("type", type);
			hmap.put("keyword", keyword);
			list = bmapper.searchbyID(hmap);
			ss.commit();
		} catch(Exception e) {
			System.out.println("��ġ �� ����");
			e.printStackTrace();
		} finally {
			ss.close();
		}
	return list;
}

public int update(int num, int column, String revise) {
	SqlSession ss = null;
	HashMap<String, Object> hm = new HashMap<>();
	hm.put("num", num);
	hm.put("column", column);
	hm.put("revise", revise);
	int check = 0;
	try {
		ss = ssf.openSession();
		BoardMapper bmapper = ss.getMapper(BoardMapper.class);
		check = bmapper.updateBoard( hm );
		ss.commit();
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("������Ʈ �� ����");
	} finally {
		ss.close();
	}
	
	return check;
	
}
	
}
