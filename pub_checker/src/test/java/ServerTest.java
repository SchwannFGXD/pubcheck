import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ServerTest {

    Server server;
    Guest bob;

    @BeforeEach
    public void setUp(){
        server = new Server();
        bob = new Guest("Bob",19, 5,50, Access.UNBANNED,'£',Drinks.MOJITO);
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void guestIsOver18() {
        boolean maybe = server.canServeGuest(bob);
        assertThat(maybe).isEqualTo(true);
        bob.setAge(18);
        boolean maybe2 = server.canServeGuest(bob);
        assertThat(maybe2).isEqualTo(false);
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void guestHasEnoughMoney() {
        boolean maybe = server.canServeGuest(bob);
        assertThat(maybe).isEqualTo(true);
        bob.setMoney(4);
        boolean maybe2 = server.canServeGuest(bob);
        assertThat(maybe2).isEqualTo(false);
    }



    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)
    @Test
    public void guestIsSober() {
        boolean maybe = server.canServeGuest(bob);
        assertThat(maybe).isEqualTo(true);
        bob.setSobriety(49);
        boolean maybe2 = server.canServeGuest(bob);
        assertThat(maybe2).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    public void guestIsNotBanned() {
        boolean maybe = server.canServeGuest(bob);
        assertThat(maybe).isEqualTo(true);
        bob.setAccess(Access.BANNED);
        boolean maybe2 = server.canServeGuest(bob);
        assertThat(maybe2).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)
    @Test
    public void guestHasCorrectCurrency() {
        boolean maybe = server.canServeGuest(bob);
        assertThat(maybe).isEqualTo(true);
        bob.setCurrency('$');
        boolean maybe2 = server.canServeGuest(bob);
        assertThat(maybe2).isEqualTo(false);
    }

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)
    @Test
    public void guestFavouriteDrinkCanBeServed() {
        boolean maybe = server.canServeGuest(bob);
        assertThat(maybe).isEqualTo(true);
        bob.setFavouriteDrink(Drinks.PINA_COLADA);
        boolean maybe2 = server.canServeGuest(bob);
        assertThat(maybe2).isEqualTo(false);
    }


}
