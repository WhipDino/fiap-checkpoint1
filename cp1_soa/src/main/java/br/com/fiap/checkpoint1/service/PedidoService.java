package br.com.fiap.checkpoint1.service;

import br.com.fiap.checkpoint1.model.Pedido;
import br.com.fiap.checkpoint1.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    
    @Autowired
    private PedidoRepository repository;

    public List<Pedido> findAll() {
        return repository.findAll();
    }

    public Pedido findById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }

    public Pedido save(Pedido pedido) {
        return repository.save(pedido);
    }

    public Pedido update(Long id, Pedido pedido) {
        Pedido existingPedido = findById(id);
        pedido.setId(existingPedido.getId());
        return repository.save(pedido);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}