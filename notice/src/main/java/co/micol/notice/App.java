package co.micol.notice;

import java.util.ArrayList;
import java.util.List;

import co.micol.notice.service.NoticeService;
import co.micol.notice.service.NoticeVO;
import co.micol.notice.serviceImpl.NoticeServiceImpl;
import co.micol.student.dto.StudentVO;
import co.micol.student.service.StudentService;
import co.micol.student.serviceImpl.StudentServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	
//    	StudentService studentDao = new StudentServiceImpl();
//    	List<StudentVO> list = new ArrayList<StudentVO>();
//    	list = studentDao.selectListStudent();
//    	for(StudentVO vo : list) {
//    		
//    	}
    	
//    	NoticeSerivce notice = new NoticeServiceImpl();
//    	List<NoticeVO> list = new ArrayList<>();
//    	list = notice.noticeSelectList();
//    	list = dao.noticeSelectList();
//    	
//    	for(NoticeVO vo : list) {
//    		vo.toString();
//    		
//    	}
//    	
//    	NoticeVO vo = new NoticeVO();
//    	vo.setId(1);
//    	vo = dao.noticeSelect(vo);
//    	vo.toString();
//    	System.out.println("===공지사항 세부 내역===");
//    	System.out.println(vo.getSubject());
    	
    	Menu menu = new Menu();
    	menu.run();
    	
    		
    	
    }
 
}
