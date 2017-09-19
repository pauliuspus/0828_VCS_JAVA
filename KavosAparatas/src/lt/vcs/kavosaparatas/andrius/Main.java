package lt.vcs.kavosaparatas.andrius;

import lt.vcs.kavosaparatas.andrius.aparatai.KavosAparatas;
import lt.vcs.kavosaparatas.andrius.puodeliai.KavosPuodelis;
import lt.vcs.kavosaparatas.andrius.resursai.Produktai;
import lt.vcs.kavosaparatas.andrius.servisai.KavosAparatuServisas;

// Main klasë kurioje bandau naudoti kavos aparatus
public class Main {

    // Metodas kuris padetu atskirti aparato metodu atspausdinamus rezultatus
    private static void spausdinkSkirtuka() {
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {

        KavosPuodelis p = new KavosAparatas().gaminkKava("normali");

        System.out.println(p);

      

    }
}
