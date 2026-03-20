package com.exemplo.medtracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MedicationController {

    @Autowired
    private MedicationRepository repository;

    @GetMapping("/delete/{id}")
    public String deleteMedication(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/"; // Volta pra página inicial depois de apagar
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("medications", repository.findAll());
        model.addAttribute("newMedication", new Medication());
        return "index";
    }

    @PostMapping("/add")
    public String addMedication(@ModelAttribute Medication medication) {
        repository.save(medication);
        return "redirect:/"; // Atualiza a página após salvar
    }
}
