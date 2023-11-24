import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.senac.sp.epicservico.model.Task;
import br.senac.sp.epicservico.repository.TaskRepository;
import jakarta.validation.Valid;

@Controller
@RequestMapping ("servico")

public class ServicoController {

    @Autowired
    ServicoRepository repository;

    @GetMapping
    public String index(Model model){
        var lista = repository.findAll();
        model.addAttribute("servico", lista);
        return "sevico/index";
    }

    @GetMapping("new") //localhost:8080/task/new
    public String form(){
        return "servico/form";
    }

    @PostMapping("new") //receber os valores do form // salvar no BD // redirecionar para lista/ task
    public String save(@Valid Servico task, BindingResult result){
       if(result.hasErrors()) return "servico/form";
        repository.save(servico);
        return "redirect:/servico";
    }
}
