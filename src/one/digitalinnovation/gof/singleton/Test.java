package one.digitalinnovation.gof.singleton;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy

        Comportamento defensivo = new ComportamentoDenfesivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComprotamentoAgrevisso();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        Facade facade = new Facade();
        facade.migraCliente("Tamara", "38408218");
    }
}
