import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.sp.epicservico.model.Task;

public interface ServicoRepository extends JpaRepository<Servico,Long> {

    
}