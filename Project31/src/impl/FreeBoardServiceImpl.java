package impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.F_board;
import service.FreeBoardService;

public class FreeBoardServiceImpl implements FreeBoardService {

	private SqlSessionFactory sqlSessionFactory;

	public FreeBoardServiceImpl() {
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
	public int m_freeSearch(String title) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(FreeBoardService.class).m_freeSearch(title);
		} finally {
			session.close();
		}
	}

	@Override
	public int m_freeWrite(F_board f_board) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(FreeBoardService.class).m_freeWrite(f_board);
		} finally {
			session.close();
		}
	}

	@Override
	public int m_freeUpdate(F_board f_board) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(FreeBoardService.class).m_freeUpdate(f_board);
		} finally {
			session.close();
		}
	}

	@Override
	public int m_freeDelete(int b_no) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(FreeBoardService.class).m_freeDelete(b_no);
		} finally {
			session.close();
		}
	}

	@Override
	public F_board m_freeSelectOne(int b_no) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(FreeBoardService.class).m_freeSelectOne(b_no);
		} finally {
			session.close();
		}
	}

	@Override
	public List<F_board> m_freeSelectAll() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(FreeBoardService.class).m_freeSelectAll();
		} finally {
			session.close();
		}
	}

}
