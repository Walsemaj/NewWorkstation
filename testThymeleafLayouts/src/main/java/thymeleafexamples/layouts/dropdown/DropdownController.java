package thymeleafexamples.layouts.dropdown;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Layout Dialect usage example.
 */
@Controller
@Secured("ROLE_USER")
class DropdownController {

    private DropdownRepository dropdownRepository;

    @Autowired
    public DropdownController(DropdownRepository dropdownRepository) {
        this.dropdownRepository = dropdownRepository;
        init();
    }

    private void init() {
    	dropdownRepository.save(new Dropdown("Shopping", "Buy Milk and Butter...", "2014.01.01 13:22:42"));
    	dropdownRepository.save(new Dropdown("Books", "Read 'Lords of The Ring'", "2014.01.02 15:22:42"));
    }

    @ModelAttribute("page")
    public String module() {
        return "dropdowns";
    }

    @RequestMapping(value = "dropdown", method = RequestMethod.GET)
    public String messages(Model model) {
        model.addAttribute("dropdowns", dropdownRepository.findAll());
        return "dropdown/list";
    }
}
