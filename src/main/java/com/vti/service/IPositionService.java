package com.vti.service;

import java.util.List;

import com.vti.entity.Position;

public interface IPositionService {

	List<Position> getAllPositions();

	Position getPositionById(int id);

	void createPosition(Position position);

	void updatePosition(Position position);

	void deletePosition(int id);

}
