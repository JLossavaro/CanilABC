/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execoes;

import java.io.IOException;

/**
 *
 * @author Luiz Henrick
 */
public class ErroDeLeituraException extends IOException {
   
    public ErroDeLeituraException(){
        super("Erro de leitura");
    }
}
