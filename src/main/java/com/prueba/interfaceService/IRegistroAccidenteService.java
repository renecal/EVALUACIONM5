package com.prueba.interfaceService;

import java.util.List;
import java.util.Optional;
import com.prueba.entity.RegistroAccidente;

public interface IRegistroAccidenteService {

	public List<RegistroAccidente> listarAccidente();
	public Optional<RegistroAccidente> listarAccidenteId(Long id);
	public int save (RegistroAccidente rAccidente);
	public void delete (Long id);
}
