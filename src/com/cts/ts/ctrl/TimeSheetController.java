package com.cts.ts.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class TimeSheetController /*extends AbstractController*/{
	
	private static final Logger logger = LoggerFactory.getLogger(TimeSheetController.class);

	private String message;

//	@Override
	@RequestMapping(value = "/ts/register", method = RequestMethod.POST)
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return new ModelAndView("ts_RegisterScreen","", message);
	}
	
	
	public void setMessage(String message) {
        this.message = message;
    }
}
