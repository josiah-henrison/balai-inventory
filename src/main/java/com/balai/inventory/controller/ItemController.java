package com.balai.inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.balai.inventory.repository.AreaRepo;
import com.balai.inventory.repository.ItemRepo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
@RequestMapping("/items")
public class ItemController {
    private final ItemRepo repo;
    private final AreaRepo rArea;

    @GetMapping("/view")
    public String viewItems(Model model) {
        model.addAttribute("items", repo.findAll());
        return "view-items";
    }

    @GetMapping("/{id}/use")
    public String getMethodName(@PathVariable int id, Model model) {
        model.addAttribute("item", repo.findById(id).get());
        model.addAttribute("areas", rArea.findAll());
        return "use-item";
    }

    @PostMapping("/{id}/use")
    public String useItem(@RequestBody ViewItemDto request,
        @PathVariable int id) {
        //TODO: process POST request
        
        return "use-item";
    }
    
}
