package com.hs.s3.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hs.s3.board.BoardDTO;
import com.hs.s3.util.Pager;
import com.hs.s3.util.Pager_backUp;

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
		mv.addObject("pager", pager);
		mv.setViewName("board/boardList");
		
		return mv;
	}
	
	@GetMapping("qnaSelect")
	public ModelAndView getSelect(BoardDTO boardDTO, ModelAndView mv) throws Exception {
		boardDTO = qnaService.getSelect(boardDTO);
		mv.addObject("board", "qna");
		mv.addObject("DTO", boardDTO);
		mv.setViewName("board/boardSelect");
		return mv;
	}
	
	@GetMapping("qnaInsert")
	public ModelAndView setInsert(ModelAndView mv) throws Exception {
		mv.setViewName("board/boardInsert");
		mv.addObject("board", "qna");
		return mv;
	}
	
	@PostMapping("qnaInsert")
	public ModelAndView setInsert(BoardDTO boardDTO, ModelAndView mv) throws Exception {
		int result = qnaService.setInsert(boardDTO);
		mv.setViewName("redirect:./qnaList");
		return mv;
	}
	
	@GetMapping("qnaReply")
	public ModelAndView setReply(ModelAndView mv) throws Exception {
		mv.addObject("board", "qna");
		mv.setViewName("board/boardReply");
		return mv;
	}
	
	@PostMapping("qnaReply")
	public ModelAndView setReply(QnaDTO qnaDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = qnaService.setReply(qnaDTO);
		mv.setViewName("redirect:./qnaList");
		return mv;
	}
	
	@PostMapping("qnaDelete")
	public ModelAndView setDelete(BoardDTO boardDTO, ModelAndView mv) throws Exception {
		int result = qnaService.setDelete(boardDTO);
		String message="삭제 실패";
		String path = "./qnaList";
		if(result>0) {
			message="삭제 성공";
		}
		mv.addObject("msg", message);
		mv.addObject("path", path);
		mv.setViewName("common/commonResult");
		
		return mv;
	}
	
	@GetMapping("qnaUpdate")
	public ModelAndView setUpdate(BoardDTO boardDTO, ModelAndView mv) throws Exception{
		boardDTO = qnaService.getSelect(boardDTO);
		mv.addObject("DTO", boardDTO);
		mv.addObject("board", "qna");
		mv.setViewName("board/boardUpdate");
		
		return mv;
	}
	
	@PostMapping("qnaUpdate")
	public ModelAndView setUpdate(BoardDTO boardDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = qnaService.setUpdate(boardDTO);
		if(result>0) {
			mv.setViewName("redirect:./qnaList");
		}else {
			mv.addObject("msg", "수정 실패");
			mv.addObject("path", "./qnaList");
			mv.setViewName("common/commonResult");
		}
		
		return mv;
	}
	
}
