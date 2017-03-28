package impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.Member_record;
import model.Team_record;

public class RecordServiceImpl implements RecordService{
	private SqlSessionFactory sqlSessionFactory;

	public RecordServiceImpl() {
		InputStream is = null;

		try {
			is = Resources.getResourceAsStream("configuration.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			if (is != null) {
				try {
					is.close();

				} catch (IOException e) {
					e.printStackTrace();

				}
			}
		}
	}

	@Override
	public List<Team_record> m_recordTeamSelectAll() {
		SqlSession session = sqlSessionFactory.openSession();
		try { 
			return session.getMapper(RecordService.class).m_recordTeamSelectAll();
		} finally {
			session.close();
		}
	}	

	@Override
	public List<Member_record> m_recordMemberSelectAll() {
		SqlSession session = sqlSessionFactory.openSession();
		try { 
			return session.getMapper(RecordService.class).m_recordMemberSelectAll();
		} finally {
			session.close();
		}
	}

	@Override
	public List<Team_record> m_recordTeamSelect(String t_name) {
		SqlSession session = sqlSessionFactory.openSession();
		try { 
			return session.getMapper(RecordService.class).m_recordTeamSelect(t_name);
		} finally {
			session.close();
		}
	}

	@Override
	public List<Member_record> m_recordMemberSelect(String m_name) {
		SqlSession session = sqlSessionFactory.openSession();
		try { 
			return session.getMapper(RecordService.class).m_recordMemberSelect(m_name);
		} finally {
			session.close();
		}
	}

	
	
	
}
