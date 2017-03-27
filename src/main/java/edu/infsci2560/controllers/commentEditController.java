package edu.infsci2560.controllers;

import edu.infsci2560.models.Kancolle;
import edu.infsci2560.repositories.KancolleRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author kolobj
 */
@Controller
public class commentEditController {
    @Autowired
    private KancolleRepository repository;
    
    @RequestMapping(value = "Kancolle/edit/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) { 
        Kancolle comment = repository.findOne(id);
        return new ModelAndView("commentEdit", "comment", comment);
    }
    
    @RequestMapping(value = "Kancolle/edit/{id}", method = RequestMethod.PUT, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public String update( @Valid Kancolle comment, BindingResult result) {
        repository.save(comment);
        return "redirect:/Kancolle";
    }        
}