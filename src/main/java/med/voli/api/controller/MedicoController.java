package med.voli.api.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import med.voli.api.DTO.DadosCadastroMedico;
import med.voli.api.medico.Medico;
import med.voli.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dadosCadastroMedico) {
        repository.save(new Medico(dadosCadastroMedico));

    }
}
