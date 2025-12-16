package br.ufpb.dcx.Atividade4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SistemaGerenciaProfsMapsTest {

        @Test
        public void testGerenciaProfsMap() {
            SistemaGerenciaProfsMap sistema = new SistemaGerenciaProfsMap();

            try {
                // i) Cadastrar o professor chamado “José” de matrícula 111
                sistema.cadastraProfessor(111, "José");

                // ii) Consultar disciplinas de José e verificar que a lista está vazia
                List<String> disciplinasJose = sistema.consultaNomesDisciplinasDoProfessor(111);
                assertEquals(0, disciplinasJose.size(), "José não deveria ter disciplinas cadastradas ainda");

                // iii) Cadastrar a disciplina “POO”, de código 22, alocada ao professor José
                Horario aula1 = new Horario( DiaDaSemana.TERCA, 10,12);
                Horario aula2 = new Horario(DiaDaSemana.TERCA, 13,15);
                List<Horario> horariosPoo= new ArrayList<>();
                horariosPoo.add(aula1);
                horariosPoo.add(aula2);

                sistema.cadastraDisciplina("POO", 22, 111, horariosPoo);

                // iv) Consultar disciplinas de José e verificar que a lista tem apenas “POO”
                disciplinasJose = sistema.consultaNomesDisciplinasDoProfessor(111);
                assertEquals(1, disciplinasJose.size(), "José deveria ter apenas uma disciplina");
                assertEquals("POO", disciplinasJose.get(0), "A disciplina cadastrada deveria ser POO");

                // v) Consultar horários de José e verificar se estão corretos
                List<Horario> horariosJose = sistema.consultaHorariosDeAulaDoProfessor(111);
                assertEquals(2, horariosJose.size(), "José deveria ter dois horários de aula");
                assertTrue(horariosJose.contains(aula1), "Horário TERÇA 10-12 deveria estar presente");
                assertTrue(horariosJose.contains(aula2), "Horário TERÇA 13-15 deveria estar presente");

            } catch (Exception e) {
                fail("Exceção não esperada: " + e.getMessage());
            }
        }
    }