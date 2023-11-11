package com.example.demo.config;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;

import com.example.demo.exception.InquiryNotFoundException;

/**
 * @author yuich
 * 全てのControllerで共通処理を定義
 */
@ControllerAdvice
public class WebMvcControllerAdvice {
	
	
	/**
	 * 送信された空文字をnullに変換する
	 * @param dataBinder
	 */
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		dataBinder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}
	
	
	/**
	 * EmpltyResultDataAccessException発生時の処理
	 * @param e
	 * @param model
	 * @return
	 */
	@ExceptionHandler(EmptyResultDataAccessException.class)
	public String handleException(EmptyResultDataAccessException e, Model model) {
		model.addAttribute("message", e);
		return "error/CustomPage";
		
	}
	
	/**
	 * InquiryNotFoundExceptionを補足する処理
	 * @param e
	 * @param model
	 * @return error/CustomPage
	 */
	@ExceptionHandler(InquiryNotFoundException.class)
	public String handleException(InquiryNotFoundException e, Model model) {
		model.addAttribute("message", e);
		return "error/CustomPage";
	}
}
