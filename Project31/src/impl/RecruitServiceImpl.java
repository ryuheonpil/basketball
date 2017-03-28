package impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.R_board;
import service.RecruitService;

public class RecruitServiceImpl implements RecruitService {
	private SqlSessionFactory sqlSessionFactory;
	public RecruitServiceImpl() {
		InputStream is = null;
		try {
			is = Resources.getResourceAsStream("compiguration.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (is != null){
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
	public int m_recruitWrite(R_board r_board) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(RecruitService.class).m_recruitWrite(r_board);			
		} finally {
			session.close();
		}
	}
	@Override
	public int m_recruitUpdate(R_board r_board) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(RecruitService.class).m_recruitUpdate(r_board);			
		} finally {
			session.close();
		}
	}
	@Override
	public int m_recruitDelete(int b_no) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(RecruitService.class).m_recruitDelete(b_no);			
		} finally {
			session.close();
		}
	}
	@Override
	public R_board m_recruitSearch(int b_no) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(RecruitService.class).m_recruitSearch(b_no);			
		} finally {
			session.close();
		}
	}
	@Override
	public List<R_board> m_recruitSelectAll() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(RecruitService.class).m_recruitSelectAll();			
		} finally {
			session.close();
		}
	}
	

}
