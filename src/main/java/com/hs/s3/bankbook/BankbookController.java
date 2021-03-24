package com.hs.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/bankbook/**")
public class BankbookController {
	@Autowired
	private BankbookService bankbookService;

	@RequestMapping(value = "bankbookList", method = RequestMethod.GET)
	public ModelAndView getList(ModelAndView mv) throws Exception {
		List<BankbookDTO> ar = bankbookService.getList();
		mv.addObject("list", ar);
		mv.setViewName("bankbook/bankbookList");

		return mv;
	}

	@RequestMapping(value = "bankbookSelect")
	public ModelAndView getSelect(BankbookDTO bankbookDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		bankbookDTO = bankbookService.getSelect(bankbookDTO);

		mv.addObject("DTO", bankbookDTO);
		mv.setViewName("bankbook/bankbookSelect");

		return mv;
	}

	@RequestMapping(value = "bankbookDelete")
	public ModelAndView setDelete(BankbookDTO bankbookDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = bankbookService.setDelete(bankbookDTO);
		mv.setViewName("redirect:./bankbookList");
		
		return mv;
	}
	
	@RequestMapping(value = "bankbookUpdate")
	public void setUpdate(BankbookDTO bankbookDTO, Model model) throws Exception {
		bankbookDTO = bankbookService.getSelect(bankbookDTO);
		model.addAttribute("DTO", bankbookDTO);
	}
	
	@RequestMapping(value = "bankbookUpdate", method = RequestMethod.POST)
	public String setUpdate(BankbookDTO bankbookDTO) throws Exception{
		int result = bankbookService.setUpdate(bankbookDTO);
		return "redirect:./bankbookList";
	}

} // === Class END
	// =========================================================================================
