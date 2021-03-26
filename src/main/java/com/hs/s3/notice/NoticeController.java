package com.hs.s3.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/notice/**")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	// --- getList ---------------------------------------
	@RequestMapping(value = "noticeList")
	public void getList(Model model) throws Exception {
		List<NoticeDTO> ar =noticeService.getList();
		model.addAttribute("list", ar);
	}
	
	// --- getSelect ---------------------------------------
	@RequestMapping(value = "noticeSelect")
	public void getSelect(NoticeDTO noticeDTO, Model model) throws Exception {
		noticeDTO = noticeService.getSelect(noticeDTO);
		model.addAttribute("DTO", noticeDTO);
	}
}
