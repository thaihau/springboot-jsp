package com.hellokoding.springboot;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class HelloController {


  ObjectMapper objectMapper = new ObjectMapper();

  private static final String PAYEEID = "payeeId";

  @RequestMapping("/hello")
  public String hello(Model model,
      @RequestParam(value = "name", required = true, defaultValue = "World") String name,
      HttpServletRequest request) throws JsonProcessingException {
    model.addAttribute("name", name);

    System.out.println("METHOD" + request.getMethod());
    System.out.println("METHOD" + request.getParameterMap());

    for (String param : request.getParameterMap().keySet()) {
      System.out.println("param [" + param + "]=[" + request.getParameter(param) + "]");
    }
    boolean hasError = true;
    String payeeId = request.getParameter(PAYEEID);
    //TODO validate all the parameters
    if (("payee1").equals(payeeId)) {
      model.addAttribute("status", "valid");
      hasError = false;
    } else {
      model.addAttribute("status", "invalid");
    }

//TODO Object ot JSON string
    if (!hasError) {
      Payee payee = new Payee();
      payee.setPayeeId(payeeId);
      String jsonInString = objectMapper.writeValueAsString(payee);
      model.addAttribute("json", jsonInString);
    }
    return "hello";
  }
}
