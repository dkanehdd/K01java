package ex21jdbc.shopping;

import ex21jdbc.connect.IConnectImpl;

public class InsertShop extends IConnectImpl{
	
	public InsertShop() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		
		try {
			String sql = " INSERT INTO sh_goods "
					+ " (g_idx, goods_name, goods_price, p_code)" + 
					"    VALUES (goods_seq.nextval, ?, ?, ?)";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, scanValue("상품명:"));
			psmt.setString(2, scanValue("상품가격:"));
			psmt.setString(3, scanValue("상품코드:"));
			int affected = psmt.executeUpdate();
			if(affected==1) {
				System.out.println("상품입력 완료");
				System.out.println(affected+"행이 업데이트");
			}
			else {
				System.out.println("상품입력 실패");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	public static void main(String[] args)  {
		
		new InsertShop().execute();
	}

}
