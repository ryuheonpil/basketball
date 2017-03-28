package impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.Team_intro;
import service.TeamInfoService;

public class TeamInfoServiceimpl implements TeamInfoService{
	
	SqlSessionFactory sqlSessionFactory;
	public TeamInfoServiceimpl() {
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
	public int t_infoWrite(Team_intro team_intro) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(TeamInfoService.class).t_infoWrite(team_intro);
		}
		finally {
			session.close();
		}
	}

	@Override
	public int t_infoUpdate(Team_intro team_intro) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(TeamInfoService.class).t_infoUpdate(team_intro);
		}
		finally {
			session.close();
		}
	}

	@Override
	public Team_intro t_infoSelectOne(int t_no) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(TeamInfoService.class).t_infoSelectOne(t_no);
		}
		finally {
			session.close();
		}
	}

	@Override
	public List<Team_intro> t_infoMemberList() {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.getMapper(TeamInfoService.class).t_infoMemberList();
		}
		finally {
			session.close();
		}
	}

}
