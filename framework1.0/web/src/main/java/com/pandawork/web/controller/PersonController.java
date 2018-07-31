package com.pandawork.web.controller;

import com.pandawork.common.entity.Person;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.pandawork.web.spring.AbstractController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
//qqqq
@Controller
@RequestMapping("/person")
public class PersonController extends AbstractController {
    @Autowired
    PersonService personService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String personList(Model model) {
        try {
            List<Person> list = null;
            list = personService.listAll();
            model.addAttribute("personList", list);
            return "home";
        } catch (Exception e) {
            LogClerk.errLog.error(e);
        }
        return "home";
    }


    @RequestMapping(value = "/toadd", method = RequestMethod.GET)
    public String toadd(){
        return "addperson";
    }

    @RequestMapping(value = "/addPerson", method = RequestMethod.POST)
    public String addPerson(Person person) {
        try {
            personService.addPerson(person);
            return "redirect:/person/list";
        } catch (Exception e) {
            LogClerk.errLog.error(e);
        }
        return "redirect:/person/list";
    }

    @RequestMapping(value = "/delPerson",method = RequestMethod.GET)
    public String delPerson(int id) {
        try {
            personService.delPerson(id);
            return "redirect:/person/list";
        } catch (Exception e) {
            LogClerk.errLog.error(e);
        }
        return "redirect:/person/list";
    }

//    @RequestMapping(value = "/edit",method = RequestMethod.GET)
//    public String edit(Person person,@PathVariable("id") int id,Model model){
//        try{
//            personService.selectById(person,id);
//            model.addAttribute("person",person);
//            return "edit";
//        }catch(SSException e){
//            LogClerk.errLog.error(e);
//        }
//        return "edit";
//    }
    @RequestMapping(value = "/toupdatePerson",method = RequestMethod.GET)
    public String toUpdate(){
        return "updatePerson";
    }

    @RequestMapping(value = "/updatePerson",method = RequestMethod.POST)
    public String updatePerson(Person person){

        try {
            personService.updatePerson(person);
            return "redirect:/person/list";
        }catch(Exception e){
            LogClerk.errLog.error(e);
        }
        return "updatePerson";
    }



    @RequestMapping(value = "/selectPerson",method = RequestMethod.POST)
    public String selectPerson(@RequestParam String keyWord,Model model){
        List<Person> resultList = null;
        try {
            resultList = personService.selectPerson(keyWord);
            model.addAttribute("resultList",resultList);
            System.out.println(keyWord);
            return "selectperson";
        }catch (Exception e){
            LogClerk.errLog.error(e);
        }
        return "selectperson";
    }
}
