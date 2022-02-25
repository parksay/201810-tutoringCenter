package board.dao;

import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BoardConfig {

	private static SqlSessionFactory ssf;
	
	static {
			String resource = "mybatisBoard.xml";
		
			try {
				Reader reader = Resources.getResourceAsReader(resource);
				ssf = new SqlSessionFactoryBuilder().build(reader);
				reader.close();
			}
			catch(Exception e){
				System.out.println("마이바티스 오류");
				e.printStackTrace();
			}
	}
	
	public static SqlSessionFactory getSqlSessionFactory(){
		return ssf;
	}
	
}
