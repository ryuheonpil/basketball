package impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.Team_f_board;
import service.TeamFreeboardService;

public class TeamFreeboardServiceimpl implements TeamFreeboardService {
	SqlSessionFactory sqlSessionFactory;

	public TeamFreeboardServiceimpl() {
		InputStream is = null;
		try {
			is = Resources.getResourceAsStream("configuration.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Team_f_board> t_freeSelectAll() {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(TeamFreeboardService.class).t_freeSelectAll();
		} finally {
			session.close();
		}
	}

	@Override
	public List<Team_f_board> t_freeSearch(String title) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(TeamFreeboardService.class).t_freeSearch(title);
		} finally {
			session.close();
		}
	}

	@Override
	public int t_freeWrite(Team_f_board team_f_board) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(TeamFreeboardService.class).t_freeWrite(team_f_board);
		} finally {
			session.close();
		}
	}

	@Override
	public int t_freeUpdate(Team_f_board team_f_board) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(TeamFreeboardService.class).t_freeUpdate(team_f_board);
		} finally {
			session.close();
		}
	}

	@Override
	public int t_freeDlete(int b_no) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(TeamFreeboardService.class).t_freeDlete(b_no);
		} finally {
			session.close();
		}
	}

	@Override
	public Team_f_board t_freeSelectOne(int b_no) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(TeamFreeboardService.class).t_freeSelectOne(b_no);
		} finally {
			session.close();
		}
	}

}
