package com.hs.s3.board.notice;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hs.s3.util.Pager;

@Controller
@RequestMapping(value = "/notice/**")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;

	// --- getList ---------------------------------------
	@RequestMapping(value = "noticeList")
	public void getList(Model model, Pager pager) throws Exception {
		List<NoticeDTO> ar = noticeService.getList(pager);
		model.addAttribute("list", ar);
		model.addAttribute("pager", pager);
	}

	// --- getSelect ---------------------------------------
	@RequestMapping(value = "noticeSelect")
	public void getSelect(NoticeDTO noticeDTO, Model model) throws Exception {
		noticeDTO = noticeService.getSelect(noticeDTO);
		model.addAttribute("DTO", noticeDTO);
	}

	// --- setInsert ---------------------------------------
	@RequestMapping(value = "noticeInsert")
	public void setInsert() throws Exception {

	}

	@RequestMapping(value = "noticeInsert", method = RequestMethod.POST)
	public ModelAndView setInsert(NoticeDTO noticeDTO, ModelAndView mv) throws Exception {
		int result = noticeService.setInsert(noticeDTO);
		
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
	@RequestMapping(value = "noticeUpdate")
	public void setUpdate(NoticeDTO noticeDTO, Model model) throws Exception {
		noticeDTO = noticeService.getSelect(noticeDTO);
		model.addAttribute("DTO", noticeDTO);
	}

	@RequestMapping(value = "noticeUpdate", method = RequestMethod.POST)
	public String setUpdate(NoticeDTO noticeDTO) throws Exception {
		int result = noticeService.setUpdate(noticeDTO);
		return "redirect:./noticeList";
	}
	
	// --- setDelete ---------------------------------------
	@RequestMapping(value = "noticeDelete")
	public String setDelete(NoticeDTO noticeDTO) throws Exception {
		int result = noticeService.setDelete(noticeDTO);
		return "redirect:./noticeList";
	}
}
