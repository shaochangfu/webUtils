package org.webutils.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.webutils.beans.Person;
import org.webutils.dao.PersonDao;

@Controller
@RequestMapping(value = "/person")
public class PersonController {
  private Logger logger = LoggerFactory.getLogger(PersonController.class);

  @Autowired
  private PersonDao personDao;

  @RequestMapping(value = "list", method = RequestMethod.GET)
  public String getAddressList(Model model) {
    logger.debug("list");
    model.addAttribute("people", personDao.selectAll());
    return "person/list";
  }
}
