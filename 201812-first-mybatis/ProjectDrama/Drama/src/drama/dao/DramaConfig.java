package drama.dao;

import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DramaConfig {
	private static SqlSessionFactory ssf;
	
	static { 
		String resource = "drama_config.xml";
		
		try {
			Reader reader = Resources.getResourceAsReader(resource); 
			ssf = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("config Áß ¿À·ù");
		}		
	}
	
	public static SqlSessionFactory getSqlSessionFactory(){
	return ssf;
	}
	
}
