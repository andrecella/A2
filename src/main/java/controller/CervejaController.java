package main.java.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
@RequestMapping("/java/")
public class CervejaController {
    @GetMapping("/")
    @GetMapping("/{cervejaNome}")
    @GetMapping("/")
    public ResponseEntity buscarTodosProdutos() {
        List<ProdutoDTO> listaDeProdutos = produtoService.listarTodos();
        return ResponseEntity.ok(listaDeProdutos);
    }
    @PostMapping("/")
    public ResponseEntity salvarNovoProduto(@RequestBody ProdutoDTO novoProdutoDTO) {
        try {
            novoProdutoDTO = produtoService.salvarNovoProduto(novoProdutoDTO);
            return ResponseEntity.ok(novoProdutoDTO);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }



}
