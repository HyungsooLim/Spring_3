package com.hs.s3.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hs.s3.board.BoardDTO;
import com.hs.s3.util.Pager;

@Controller
@RequestMapping(value = "/qna/**")
public class QnaController {

	@Autowired
	private QnaService qnaService;
	
	@GetMapping("qnaList")
	public ModelAndView getList(Pager pager) throws Exception {
		ModelAndView mv = new ModelAndView();
		List<BoardDTO> ar =qnaService.getList(pager);
		mv.addObject("list", ar);
		mv.addObject("board", "qna");
		mv.setViewName("board/boardList");
		
		return mv;
	}
	
	@GetMapping("qnaInsert")
	public ModelAndView setInsert(ModelAndView mv) throws Exception {
		mv.setViewName("board/boardInsert");
		mv.addObject("board", "qna");
		return mv;
	}
	
}
