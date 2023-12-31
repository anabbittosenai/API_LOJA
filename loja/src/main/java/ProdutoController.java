import com.loja.Produto;
import com.loja.TabelaProdutos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/loja/produtos")
public class ProdutoController {
    private TabelaProdutos tabelaDeProdutos;
    public ProdutoController() {
        this.tabelaDeProdutos = new TabelaProdutos();
    }
    @GetMapping
    public List<Produto> buscarTodosOsProdutosDaLoja() {
        return this.tabelaDeProdutos.buscarTodosOsProdutos();
    }
}
