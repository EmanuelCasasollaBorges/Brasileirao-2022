package tabela;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TabelaBrasileirao {
    private List<Time> times;

    public TabelaBrasileirao() {
        times = new ArrayList<>();
    }

    public void adicionarTime(Time time) {
        times.add(time);
    }

    public void removerTime(String nome) {
        times.removeIf(time -> time.getNome().equals(nome));
    }

    public void exibirTabela() {
        times.sort(Comparator.comparingInt(Time::getPontos).reversed());
        for (Time time : times) {
            System.out.println(time);}
    }}
        
    