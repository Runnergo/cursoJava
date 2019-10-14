/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Runnergo
 */
import java.util.Date;
import java.time.LocalDate;

public class MyDateCard {

    public int añoAtual;
    public int mesActual;
    public int mes;
    public int año;

    public MyDateCard(LocalDate date) {
        this.añoAtual=date.getYear();
        this.mesActual=date.getMonthValue();
    }

    public MyDateCard(int mes, int año) {

        this.mes = mes;
        this.año = año;
    }

    public int getDateAño() {
        return this.año;
    }

    public int getDateMes() {
        return this.mes;
    }

    public void setDate(int mesNuevo, int añoNuevo) {

        this.mes = mesNuevo;
        this.año = añoNuevo;
    }

    public boolean dateEstado() {
        if ((this.mes >this.mesActual && this.año >=this.añoAtual) || (this.año >this.añoAtual)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Fecha caducidad: " + mes + "/" + año;
    }

    public String expiredCard() {
        return "fecha caducada, reconfigure targeta";
    }
}
