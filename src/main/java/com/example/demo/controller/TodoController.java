package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Todo;
import com.example.demo.repository.TodoRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class TodoController {

	private final TodoRepository repository;

	// Read
	@GetMapping("/")
	public String showAllTodo(@ModelAttribute Todo todo, Model model) {
		model.addAttribute("todos", repository.findAll());
		return "index";
	}

	// Create
	@PostMapping("/add")
	public String addTodo(@ModelAttribute Todo todo) {
		repository.save(todo);
		return "redirect:/";
	}

	// Update
	@PostMapping("/edit")
	public String editTodo(@ModelAttribute Todo todo) {
		repository.save(todo);
		return "redirect:/";
	}

	// Delete
	@GetMapping("/delete/{id}")
	public String deleteTodo(@PathVariable Long id) {
		repository.deleteById(id);
		return "redirect:/";
	}
}
