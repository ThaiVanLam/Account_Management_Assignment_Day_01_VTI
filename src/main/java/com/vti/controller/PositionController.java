package com.vti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.entity.Position;
import com.vti.service.IPositionService;

@RestController
@RequestMapping(value = "api/v1/positions")
public class PositionController {
	@Autowired
	private IPositionService positionService;

	@GetMapping
	public List<Position> getAllPositions() {
		return positionService.getAllPositions();
	}

	@GetMapping(value = "/{id}")
	public Position getPositionById(@PathVariable(name = "id") int id) {
		return positionService.getPositionById(id);
	}

	@PostMapping
	public void createPosition(@RequestBody Position position) {
		positionService.createPosition(position);
	}

	@PutMapping(value = "/{id}")
	public void updatePosition(@PathVariable(name = "id") int id, @RequestBody Position position) {
		position.setId(id);
		positionService.updatePosition(position);
	}

	@DeleteMapping(value = "/{id}")
	public void deletePosition(@PathVariable(name = "id") int id) {
		positionService.deletePosition(id);
	}

}
