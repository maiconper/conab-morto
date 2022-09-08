package conab.morto.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MortoController {

    @Autowired
    private MortoRepository mortoRepository;    


    @GetMapping("/")
    public String home(){
     
        
        return "homePage";
    }

    @GetMapping("/buscar")
    public String busca(){


        return "homePage";
    }
   
    @PostMapping("/buscar")
    public String home(@RequestParam("conteudo")String conteudo, Model model){
       
        List<Morto> mortos = mortoRepository.findByConteudo(conteudo);
        System.out.print(mortos.size());
        model.addAttribute("mortos",mortos);
        System.out.println(conteudo);
        
        return "homePage";
    }
    
}
