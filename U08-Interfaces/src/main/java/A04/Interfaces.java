/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A04;

/**
 *
 * @author ariad
 */
interface Imprimible {
    void imprimir();
}

interface Escaneable {
    void escanear();
}

interface Multifuncion extends Imprimible, Escaneable {
}
