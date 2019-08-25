package mmf.piskunou.mastermind.servlet;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import mmf.piskunou.mastermind.ColorFactory;
import mmf.piskunou.mastermind.Guesser;
import mmf.piskunou.mastermind.lettered.LetteredColorFactory;
import mmf.piskunou.mastermind.UniqueGuesser;
// START SNIPPET MastermindModule
public class MastermindModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(int.class)
                .annotatedWith(Names.named("nrColors"))
                .toInstance(6);
        bind(int.class)
                .annotatedWith(Names.named("nrColumns"))
                .toInstance(4);
        bind(ColorFactory.class)
                .to(LetteredColorFactory.class);
        bind(Guesser.class)
                .to(UniqueGuesser.class);
    }
// END SNIPPET
}
