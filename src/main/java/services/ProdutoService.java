package services;

import java.dtos.ProdutoCervDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import static java.time.Period.between;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository CervejaRepository;

    @Autowired

    public List<ProdutoCervDTO> listarTodos(){
        List<ProdutoCervDTO> listaProdutosDTO = new ArrayList<ProdutoCervDTO>();
        List<Produto> produtos= produtoRepository.findAll();
        for (Produto produto : produtos) {
            ProdutoCervDTO ProdutoCervDTO = new ProdutoCervDTO(produto.getId(), produto.getNome(), produto.getFabricante(), produto.getTipo());
            listaProdutosDTO.add(ProdutoCervDTO);
        }
        return listaProdutosDTO;
    }

    public ProdutoCervDTO buscaProdutoPorId(Long produtoId){
        Produto produto = produtoRepository.findById(produtoId);
        if(produto==null)
            throw new RuntimeException(Phraseology.MENSAGEM_PRODUTO_NAO_EXISTE);
        ProdutoCervDTO ProdutoCervDTO = new ProdutoCervDTO(produto.getId(), produto.getNome(), produto.getFabricante(), produto.getTipo());
        return ProdutoCervDTO;
    }

    public ProdutoCervDTO salvarNovoProduto(ProdutoCervDTO ProdutoCervDTO) {

        Produto produtoQueVaiSerGravado;

        if(ProdutoCervDTO.getId()!=null){
              Produto verificaSeExisteProduto = produtoRepository.findById(ProdutoCervDTO.getId());
              if(verificaSeExisteProduto!=null)


        }

        produtoQueVaiSerGravado = new Produto();

        return this.registrarProduto(produtoQueVaiSerGravado,ProdutoCervDTO);
    }
}
