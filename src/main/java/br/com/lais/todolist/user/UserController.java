package br.com.lais.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * MODIFICADOR
 * 
 * public
 * private
 * protected
 * 
 */

@RestController
@RequestMapping("/users")
public class UserController {
    /*
     * TIPOS - Revisão
     * 
     * String(texto)
     * Integer (int) numeros inteiros
     * Double (double) numeros com casas decimais, + precisao.
     * Float (float)
     * Char(A C)
     * Date (data)
     * void 
     */

    /*
      * Body - Corpo
    */
  @PostMapping("/")
  public void create(@RequestBody UserModel userModel){
    System.out.println(userModel.getUsername());
  }

    

}
