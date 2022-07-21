/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//proyecto descargado desde github a traves de de eclipse git
package tictactoe;

public enum Simbolo {
    X('X'),
    O('O'),
    VACIO('-');

    private char simbolo;

    private Simbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }

}
