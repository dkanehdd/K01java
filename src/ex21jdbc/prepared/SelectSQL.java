package ex21jdbc.prepared;

import java.sql.SQLException;

import ex21jdbc.connect.IConnectImpl;

public class SelectSQL extends IConnectImpl{
	
	public SelectSQL() {
		super("kosmo","1234");
	}
	
	@Override
	public void execute() {
		try {
			while(true) {
				String sql = "SELECT * FROM board "
				//+ " WHERE name LIKE '%?%'";//에러발생:부적합한 열 인덱스
					+"WHERE title LIKE '%'||?||'%' "
					+ " ORDER BY ||?|| desc ";
				
				psmt = con.prepareStatement(sql);
				psmt.setString(1, scanValue("찾는제목"));
				psmt.setString(2, "visitcount");
				rs = psmt.executeQuery();
				while(rs.next()) {
					String id = rs.getString("id");
					String postdate = rs.getString("postdate");
					String title = rs.getString("title");
					String visitcount = 
							rs.getString("visitcount");
					
					System.out.printf("%s %s %s %s\n",
							id,postdate,title,visitcount);
				} 
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	public static void main(String[] args) {
		new SelectSQL().execute();
	}

}
