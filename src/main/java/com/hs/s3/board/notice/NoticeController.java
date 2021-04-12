package com.hs.s3.board.notice;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.hs.s3.board.BoardDTO;
import com.hs.s3.board.BoardFileDTO;
import com.hs.s3.util.Pager;
import com.hs.s3.util.Pager_backUp;

@Controller
@RequestMapping(value = "/notice/**")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;

	// --- getList ---------------------------------------
	@RequestMapping(value = "noticeList")
	public ModelAndView getList(ModelAndView mv, Pager pager) throws Exception {
		List<BoardDTO> ar = noticeService.getList(pager);
		mv.addObject("list", ar);
		mv.addObject("pager", pager);
		mv.addObject("board", "notice");
		mv.setViewName("board/boardList");
		
		return mv;
	}

	// --- getSelect ---------------------------------------
	@RequestMapping(value = "noticeSelect")
	public ModelAndView getSelect(BoardDTO boardDTO, ModelAndView mv) throws Exception {
		boardDTO = noticeService.getSelect(boardDTO);
		mv.addObject("DTO", boardDTO);
		mv.addObject("board", "notice");
		mv.setViewName("board/boardSelect");
		
		return mv;
	}

	// --- setInsert ---------------------------------------
	@RequestMapping(value = "noticeInsert")
	public ModelAndView setInsert(ModelAndView mv) throws Exception {
		mv.setViewName("board/boardInsert");
		mv.addObject("board", "notice");
		return mv;
	}

	@RequestMapping(value = "noticeInsert", method = RequestMethod.POST)
	public ModelAndView setInsert(BoardDTO boardDTO, MultipartFile[] files) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = noticeService.setInsert(boardDTO, files);
		
		String message = "글 등록 실패";
		String path = "./noticeList";
		if(result>0) {
			message = "글 등록 성공";
			path = "./noticeList";
		}
		
		mv.addObject("msg", message);
		mv.addObject("path", path);
		mv.setViewName("common/commonResult");
		
		return mv;
	}

	// --- setUpdate ---------------------------------------
	@GetMapping("noticeUpdate")
	public ModelAndView setUpdate(BoardDTO boardDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		boardDTO = (NoticeDTO)noticeService.getSelect(boardDTO);
		mv.addObject("DTO", boardDTO);
		mv.addObject("board", "notice");
		mv.setViewName("board/boardUpdate");
		return mv;
	}

	@PostMapping("noticeUpdate")
	public ModelAndView setUpdate(BoardDTO boardDTO, ModelAndView mv, MultipartFile[] files) throws Exception {
		int result = noticeService.setUpdate(boardDTO, files);
		
		// 성공하면 리스트로 이동
		// 실패하면 수정실패, 리스트로 이동
		if(result>0) {			
		mv.setViewName("redirect:./noticeList");
		} else {
			mv.addObject("msg", "수정 실패");
			mv.addObject("path", "./noticeList");
			mv.setViewName("common/commonResult");
		}
		return mv;
	}
	
	// --- setDelete ---------------------------------------
	@PostMapping("noticeDelete")
	public ModelAndView setDelete(BoardDTO boardDTO, ModelAndView mv) throws Exception {
		int result = noticeService.setDelete(boardDTO);
		String message="삭제 실패";
		String path = "./noticeList";
		if(result > 0) {
			message="삭제 성공";
		}
		mv.addObject("msg", message);
		mv.addObject("path", path);
		mv.setViewName("common/commonResult");
		return mv;
	}
	
	// --- setFileDelete ---------------------------------------	
	@GetMapping("fileDelete")
	public ModelAndView setFileDelete(BoardFileDTO boardFileDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = noticeService.setFileDelete(boardFileDTO);
		
		mv.addObject("result", result);
		mv.setViewName("common/ajaxResult");
		return mv;
	}
	
	
}
