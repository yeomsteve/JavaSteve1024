package kr.kh.spring.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.kh.spring.service.AdminService;
import kr.kh.spring.vo.BoardTypeVO;

@Controller
public class AdminController {

		@Autowired
		AdminService adminService;
	
		@RequestMapping(value="/admin/board/type/list")
		public ModelAndView boardTypeList(ModelAndView mv) {
			//admin서비스에게 모든 게시글 타입을 가져오라고 요청
			ArrayList<BoardTypeVO> list = adminService.getBoardType();
			mv.addObject("list", list);
			mv.setViewName("/admin/boardTypeList");
			return mv;			
		}
}
