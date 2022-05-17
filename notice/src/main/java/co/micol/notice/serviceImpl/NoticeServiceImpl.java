//package co.micol.notice.serviceImpl;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import co.micol.notice.dao.DataSource;
//import co.micol.notice.service.NoticeService;
//import co.micol.notice.service.NoticeVO;
//
//public class NoticeServiceImpl implements NoticeService {
//	private DataSource dao = DataSource.getInstance();
//	private Connection conn; // = dao.getConnection();
//
//	private PreparedStatement psmt; //
//	private ResultSet rs; //
//
//	@Override
//	public List<NoticeVO> noticeSelectList() {
//		// 전체조회
//		List<NoticeVO> list = new ArrayList<NoticeVO>();
//		NoticeVO vo;
//		String sql = "SELECT * FROM NOTICE"; // 컨트롤 쉬프트 x누르면 대문자
//		try {
//			conn = dao.getConnection();
//			psmt = conn.prepareStatement(sql);
//			rs = psmt.executeQuery();
//			while (rs.next()) {
//				vo = new NoticeVO();
//				vo.setId(rs.getInt("id"));
//				vo.setWriter(rs.getString("writer"));
//				vo.setTitle(rs.getString("title"));
//				vo.setWdate(rs.getDate("wdate"));
//				vo.setHit(rs.getInt("hit"));
//				list.add(vo);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(); // close로 끊고 리턴값을 받으면됨
//		}
//		return list;
//	}
//
//	@Override
//	public NoticeVO noticeSelect(NoticeVO vo) {
//		// 하나의 글 조회(글 세부조회, 한개의 공지사항을 읽을때..?)
//		String sql = "SELECT * FROM NOTICE WHERE ID = ?";
//		try {
//			conn = dao.getConnection();
//			psmt = conn.prepareStatement(sql);
//			psmt.setInt(1, vo.getId()); // 넘어온 아이디값을 받아서 글을 찾음
//			rs = psmt.executeQuery();
//			if (rs.next()) {
//				vo = new NoticeVO();
//				vo.setId(rs.getInt("id"));
//				vo.setWriter(rs.getString("writer"));
//				vo.setTitle(rs.getString("title"));
//				vo.setSubject(rs.getString("subject"));
//				vo.setWdate(rs.getDate("wdate"));
//				vo.setHit(rs.getInt("hit"));
//				
//				hitUpdate(vo.getId()); // 조회수 증가
//			} //
//		} catch (SQLException e) { // 모르면 그냥 Exception 해도 됨
//			e.printStackTrace();
//		} finally { // 뭐가 발생했든간에 finally close로 할수있게 해준다
//			close();
//		}
//
//		return vo;
//
//	}
//
////	@Override
////	public int noticeInsert(NoticeVO vo) {
////		//한명추가
////		int n = 0;
////		String sql = "INSERT INTO NOTICE VALUES(b_id.nextval,?,?,?,sysdate,0)";
////		try {
////			psmt = conn.prepareCall(sql);
////			psmt.setint(1, vo.getId());
////			psmt.setString(2, vo.getWriter());
////			psmt.setString(3, vo.getTitle());
////			psmt.setString(4, vo.getSubject());
////			psmt.setDate(5, vo.getWdate());
////			psmt.setString(6, vo.getHit());
////			n = psmt.executeUpdate();
////		}catch(SQLException e) {
////			e.printStackTrace();
////		}
////		
////		return n;
////	}
//
//	@Override
//	public int noticeUpdate(NoticeVO vo) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int noticeDelete(NoticeVO vo) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	private void close() {
//		try {
//			if (rs != null)
//				rs.close();
//			if (psmt != null)
//				psmt.close();
//			if (conn != null)
//				conn.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	private void hitUpdate(int id) {
//		String sql = "UPDATE NOTICE SET HIT = HIT + 1 WHERE ID = ?";
//		try {
//			psmt = conn.prepareStatement(sql);
//			psmt.setInt(1, id);
//			psmt.executeUpdate();
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//}
