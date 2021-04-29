package com.aaron.API_ANDROID.service;

import com.aaron.API_ANDROID.domain.Butaca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ButacaServiceImpl implements ButacaService{

    @Autowired
    private ButacaService butacaService;

    @Override
    public Butaca findByIdButaca(int id) {
        return butacaService.findByIdButaca(id);
    }
}
