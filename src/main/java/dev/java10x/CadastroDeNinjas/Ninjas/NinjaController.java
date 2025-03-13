package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota! Hello World";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Mostrar Ninja por ID (READ)
    @GetMapping("/todosID")
    public String mostrarNinjaPorId() {
        return "Mostrar Ninja por ID";
    }

    // Alterar dados do Ninja Por ID (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId() {
        return "Altarar Ninja por ID";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId() {
        return "Ninja deletado por ID";
    }
}
