package com.example.FaturaTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.Fatura.Fatura;

public class FaturaTest {
    @Test
    public void instanciarFatura() {
        Fatura fatura = new Fatura("Cliente Teste", "Endereço Teste", "CONSULTORIA", 1000.0);
        assertEquals(fatura.getClass().getSimpleName(), "Fatura");
    }

    @Test
    public void testGetNomeCliente() {
        Fatura fatura = new Fatura("Cliente Teste", "Endereço Teste", "CONSULTORIA", 1000.0);
        assertEquals("Cliente Teste", fatura.getNomeCliente());
    }

    @Test
    public void testGetValor() {
        Fatura fatura = new Fatura("Cliente Teste", "Endereço Teste", "CONSULTORIA", 1000.0);
        assertEquals(1000.0, fatura.getValor(), 0.01);
    }

    @Test
    public void testGetTipoServico() {
        Fatura fatura = new Fatura("Cliente Teste", "Endereço Teste", "CONSULTORIA", 1000.0);
        assertEquals("CONSULTORIA", fatura.getTipoServico());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testServicoNaoEsperadoAoCriarClasse() {
        new Fatura("Cliente Teste", "Endereço Teste", "", 1000.0);
    }

}
