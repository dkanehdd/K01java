package ex21jdbc.shopping;

import java.sql.SQLException;

import ex21jdbc.connect.IConnectImpl;

public class SelectAllShop extends IConnectImpl{

	public SelectAllShop() {
		super("kosmo", "1234");
	}
	@Override
	public void execute() {
		try {
			stmt = con.createStatement();
			
			String query = "SELECT g_idx, goods_name, "
					+ " trim(to_char(goods_price, '999,999,000')),"
					+ " to_char(regidate, 'yyyy-mm-dd hh24:mi'),"
					+ " p_code"
					+ " FROM sh_goods ";
			
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				String idx = rs.getString(1);//id컬럼
				String name = rs.getString(2);
				String price = rs.getString(3);
				String regidate = rs.getString(4);
				String code = rs.getString(5);
				System.out.printf("일련번호:%s 상품명:%s 가격:%s 등록일:%s 제품코드:%s\n",
						idx, name, price, regidate,code);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}

}
