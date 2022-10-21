package TreinamentoSelenium;

import org.junit.Test;
import org.testng.Assert;

public class Guilda1 {

    @Test
    public void assertEqualsFails() {

        Assert.assertEquals("cachorro", "gato");

    }
    @Test
    public void assertEqualsSucess() {

        Assert.assertEquals("gato", "gato");

    }

    @Test
    public void assertTrueFails() {

        Assert.assertTrue(false);

    }

    @Test
    public void assertTrueSucess() {

        Assert.assertTrue(true);

    }

    @Test
    public void assertFalseFails() {

        Assert.assertFalse(true);

    }

    @Test
    public void assertFalseSucess() {

        Assert.assertFalse(false);

    }
}



