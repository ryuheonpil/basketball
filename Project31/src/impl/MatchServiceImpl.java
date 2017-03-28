package impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.Total_match;
import service.MatchService;

public class MatchServiceImpl implements MatchService {
	private SqlSessionFactory sqlSessionFactory;

	public MatchServiceImpl() {
		InputStream is = null;
		try {
			is = Resources.getResourceAsStream("compiguration.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public int m_matchingAdd(Total_match total_match) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(MatchService.class).m_matchingAdd(total_match);
		} finally {
			session.close();
		}
	}

	@Override
	public int m_matchingAdminAdd(Total_match total_match) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(MatchService.class).m_matchingAdminAdd(total_match);
		} finally {
			session.close();
		}
	}

	@Override
	public int m_matchingUpdate(Total_match total_match) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(MatchService.class).m_matchingUpdate(total_match);
		} finally {
			session.close();
		}
	}

	@Override
	public int m_matchingAdminUpdate(Total_match total_match) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(MatchService.class).m_matchingAdminUpdate(total_match);
		} finally {
			session.close();
		}
	}

	@Override
	public Total_match m_matchingSearch(int no) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(MatchService.class).m_matchingSearch(no);
		} finally {
			session.close();
		}
	}

	@Override
	public int m_matchingAdminDelete(int no) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(MatchService.class).m_matchingAdminDelete(no);
		} finally {
			session.close();
		}
	}

	@Override
	public List<Total_match> m_matchingSelectAll() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(MatchService.class).m_matchingSelectAll();
		} finally {
			session.close();
		}
	}

	@Override
	public Date m_matchingToday(Date date) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(MatchService.class).m_matchingToday(date);
		} finally {
			session.close();
		}
	}

}
