package com.vti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.entity.Position;
import com.vti.repository.IPositionRepository;

@Service
public class PositionService implements IPositionService {
	@Autowired
	private IPositionRepository positionRepository;

	@Override
	public List<Position> getAllPositions() {
		return positionRepository.getAllPositions();
	}

	@Override
	public Position getPositionById(int id) {
		return positionRepository.getPositionById(id);
	}

	@Override
	public void createPosition(Position position) {
		positionRepository.createPosition(position);
	}

	@Override
	public void updatePosition(Position position) {
		positionRepository.updatePosition(position);
	}

	@Override
	public void deletePosition(int id) {
		positionRepository.deletePosition(id);
	}

}
