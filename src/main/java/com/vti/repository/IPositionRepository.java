package com.vti.repository;

import java.util.List;

import com.vti.entity.Position;

public interface IPositionRepository {

	List<Position> getAllPositions();

	Position getPositionById(int id);

	void createPosition(Position position);

	void updatePosition(Position position);

	void deletePosition(int id);

}
