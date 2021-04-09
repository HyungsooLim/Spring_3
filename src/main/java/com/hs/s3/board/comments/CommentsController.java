package com.hs.s3.board.comments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/comments/**")
public class CommentsController {

	@Autowired
	private CommentsService commentsService;
	
	
	@GetMapping("commentsList")
	public ModelAndView getList(CommentsDTO commentsDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		System.out.println(commentsDTO.getNum());
		List<CommentsDTO> ar = commentsService.getList(commentsDTO);
		
		mv.addObject("list", ar);
		mv.setViewName("comments/commentsList");
		
		return mv;
	}
	
	@PostMapping("commentsInsert")
	public void setInsert(CommentsDTO commentsDTO) throws Exception {
		System.out.println(commentsDTO.getWriter());
		System.out.println(commentsDTO.getContents());
	}
	
	
	
	
	
	
}
