package kr.kh.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping(value = "/login", method=RequestMethod.GET)//uri
	public ModelAndView login(ModelAndView mv) {			
			mv.setViewName("login");	//화면이름		
			return mv;						
	}		
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)//uri
	public ModelAndView loginPost(ModelAndView mv, String id, String pw) {			
			System.out.println(id);
			System.out.println(pw);
			mv.setViewName("login");				
			return mv;						
	}		
}
