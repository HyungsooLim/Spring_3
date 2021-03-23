package com.hs.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankbookController {
	
	@Autowired
	private BankbookService bankbookService;

	// 상품 리스트 출력
	@RequestMapping(value = "/bankbook/bankbookList", method = RequestMethod.GET)
	public ModelAndView bankbookList() throws Exception {
		List<BankbookDTO> ar =bankbookService.getList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("list", ar);
		modelAndView.addObject("kind", "bankbook");
		modelAndView.setViewName("bankbook/bankbookList");
		
		return modelAndView;
	}

//	---------------------------------------------------------------------------------------
	// 상품 상세정보 출력
	@RequestMapping(value = "/bankbook/bankbookSelect", method = RequestMethod.GET)
	public ModelAndView bankbookSelect(BankbookDTO bankbookDTO, ModelAndView modelAndView) throws Exception {
		bankbookDTO=bankbookService.getSelect(bankbookDTO);
		modelAndView.addObject("DTO", bankbookDTO);
		modelAndView.setViewName("bankbook/bankbookSelect");
		return modelAndView;
	}

//	---------------------------------------------------------------------------------------	
	// 상품 등록 폼
	@RequestMapping(value = "/bankbook/bankbookAdd", method = RequestMethod.GET)
	public void bankbookAdd() throws Exception {

	}

//	---------------------------------------------------------------------------------------	
	// 상품 등록
	@RequestMapping(value = "/bankbook/bankbookAdd", method = RequestMethod.POST)
	public ModelAndView bankbookAdd(BankbookDTO bankbookDTO, ModelAndView modelAndView) throws Exception {
		int result = bankbookService.setWrite(bankbookDTO);
		modelAndView.setViewName("redirect:./bankbookList");
		return modelAndView;
	}

//	---------------------------------------------------------------------------------------	
	// 상품 수정 폼
	@RequestMapping(value = "/bankbook/bankbookUpdate", method = RequestMethod.GET)
	public void bankbookUpdate(BankbookDTO bankbookDTO, ModelAndView modelAndView) throws Exception {

	}

//	---------------------------------------------------------------------------------------	
	// 상품 수정
	@RequestMapping(value = "/bankbook/bankbookUpdate", method = RequestMethod.POST)
	public ModelAndView bankbookUpdate2(BankbookDTO bankbookDTO, ModelAndView modelAndView) throws Exception {

		modelAndView.setViewName("bankbook/bankbookList");
		return modelAndView;
	}

//	---------------------------------------------------------------------------------------	
	// 상품 삭제
	@RequestMapping(value = "/bankbook/bankbookDelete", method = RequestMethod.GET)
	public ModelAndView bankbookDelete(BankbookDTO bankbookDTO, ModelAndView modelAndView) throws Exception {

		modelAndView.setViewName("bankbook/bankbookList");
		return modelAndView;
	}

} // === Class END
	// =========================================================================================
