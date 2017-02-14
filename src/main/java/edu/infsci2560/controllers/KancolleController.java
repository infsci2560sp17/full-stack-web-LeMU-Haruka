package edu.infsci2560.controllers;

import edu.infsci2560.models.Kancolle;
import edu.infsci2560.repositories.KancolleRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author kolobj
 */
@Controller
public class KancolleController {
    @Autowired
    private KancolleRepository repository;
    
    @RequestMapping(value = "Kancolle", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("Kancolle", "Kancolle", repository.findAll());
    }
    
    @RequestMapping(value = "Kancolle/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Kancolle kancolle, BindingResult result) {
        repository.save(kancolle);
        return new ModelAndView("Kancolle", "Kancolle", repository.findAll());
    }
    
}