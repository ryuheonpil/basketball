package impl;

import java.util.List;

import model.Member_record;
import model.Team_record;

public interface RecordService {
	
	public List<Team_record> m_recordTeamSelectAll();
	public List<Team_record> m_recordTeamSelect(String t_name);

	public List<Member_record> m_recordMemberSelectAll();
	public List<Member_record> m_recordMemberSelect(String m_name);
	
}
