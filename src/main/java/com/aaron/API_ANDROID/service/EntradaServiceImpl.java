package com.aaron.API_ANDROID.service;

import com.aaron.API_ANDROID.domain.Compra;
import com.aaron.API_ANDROID.domain.Entrada;
import com.aaron.API_ANDROID.domain.Tarifa;
import com.aaron.API_ANDROID.domain.Usuario;
import com.aaron.API_ANDROID.repository.CompraRepository;
import com.aaron.API_ANDROID.repository.EntradaRepository;
import com.aaron.API_ANDROID.repository.TarifaRepository;
import com.aaron.API_ANDROID.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
public class EntradaServiceImpl implements EntradaService{

    @Autowired
    private EntradaRepository entradaRepository;

    @Autowired
    private CompraService compraService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private TarifaRepository tarifaRepository;

    @Override
    public Set<Entrada> findAll() {
        return entradaRepository.findAll();
    }

//    @Override
//    public Set<Entrada> addEntrada(int id_usuario, ArrayList<Entrada> entradas, ArrayList<Tarifa> tarifas) {
//        Compra NuevaCompra = compraService.addCompra(id_usuario);
//        Set<Entrada> EntradasNuevas = (Set<Entrada>) new ArrayList<Entrada>();
//
//        for (int i=0;i<entradas.size();i++){
//            Entrada entrada = new Entrada();
//            Tarifa tarifa = tarifaRepository.getQuery(tarifas.get(i).getNombre_tarifa());
//            entrada.setButaca(entradas.get(i).getButaca());
//            entrada.setCompra(NuevaCompra);
//            entrada.setSesion(entradas.get(i).getSesion());
//            entrada.setTarifa(tarifa);
//            entrada.setImporte(tarifa.getImporte());
//
//            entradaRepository.save(entrada);
//
//            EntradasNuevas.add(entrada);
//        }
//        NuevaCompra.setEntrada((List<Entrada>) EntradasNuevas);
//        return EntradasNuevas;
//    }
}
