package com.aaron.API_ANDROID.service;

import com.aaron.API_ANDROID.domain.*;
import com.aaron.API_ANDROID.domain.DTO.EntradaDTO;
import com.aaron.API_ANDROID.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class CompraServiceImpl implements CompraService{

    @Autowired
    private CompraRepository compraRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private TarifaRepository tarifaRepository;

    @Autowired
    private EntradaRepository entradaRepository;

    @Autowired
    private ButacaRepository butacaRepository;

    @Autowired
    private SesionRepository sesionRepository;

    @Override
    public Set<Compra> findAll() {
        return compraRepository.findAll();
    }

    @Override
    public Set<Compra> findCompraIdUsuario(int id_usuario) {
        System.out.println(id_usuario);
        return compraRepository.getQuery(id_usuario);
    }

    @Override
    public Compra addCompra(ArrayList<EntradaDTO> entradas) {
        Compra compra = new Compra();
        compra.setUsuario(usuarioRepository.getQuery(entradas.get(0).getId()));
        String date = String.valueOf(LocalDate.now());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        date = LocalDate.parse(date).format(formatter);
        compra.setFecha_compra(date);
        Compra NuevaCompra = compraRepository.save(compra);
        List<Entrada> lstEntradas = new ArrayList<>();

        for (int i=0;i<entradas.size();i++){
            Entrada entrada = new Entrada();
            Tarifa tarifa = tarifaRepository.getQuery(entradas.get(i).getTarifa());
            Butaca butaca = butacaRepository.getQuery(entradas.get(i).getButaca());
            Sesion sesion = sesionRepository.getSesionById(entradas.get(i).getSesion());

            entrada.setButaca(butaca);
            entrada.setSesion(sesion);
            entrada.setTarifa(tarifa);
            entrada.setImporte(tarifa.getImporte());
            entrada.setCompra(NuevaCompra);

            lstEntradas.add(entradaRepository.save(entrada));
        }

        return NuevaCompra;
    }
}
