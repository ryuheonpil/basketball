package impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.N_board;
import service.NoticeBoardService;

public class NoticeBoardServiceImpl implements NoticeBoardService {

	private SqlSessionFactory sqlSessionFactory;

	public NoticeBoardServiceImpl() {
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public int m_noticeSearch(String title) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(NoticeBoardService.class).m_noticeSearch(title);
		} finally {
			session.close();
		}
	}

	@Override
	public int m_noticeWrite(N_board n_board) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(NoticeBoardService.class).m_noticeWrite(n_board);
		} finally {
			session.close();
		}
	}

	@Override
	public int m_noticeUpdate(N_board n_board) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(NoticeBoardService.class).m_noticeUpdate(n_board);
		} finally {
			session.close();
		}
	}

	@Override
	public int m_noticeDelete(int b_no) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(NoticeBoardService.class).m_noticeDelete(b_no);
		} finally {
			session.close();
		}
	}

	@Override
	public N_board m_noticeSelectOne(int b_no) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(NoticeBoardService.class).m_noticeSelectOne(b_no);
		} finally {
			session.close();
		}
	}

	@Override
	public List<N_board> m_noticeSelectAll() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(NoticeBoardService.class).m_noticeSelectAll();
		} finally {
			session.close();
		}
	}

}
