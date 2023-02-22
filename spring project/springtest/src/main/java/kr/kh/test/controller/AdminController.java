package kr.kh.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class AdminController {

	@RequestMapping(value = "/admin/board/type/list", method = RequestMethod.GET)
	public ModelAndView board(ModelAndView mv) {
		mv.setViewName("/admin/boardTypeList");
		return mv;
	}
}
