package de.mlauinger.gmhelper.character;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */

public class AttributeTest {

    @Test
    public void testPositiveBonusCalulation() {
        Attribute attr = new Attribute("Test", 12);
        assertEquals(attr.getBonus(), 1);
    }

    @Test
    public void testNegativeBonusCalulation() {
        Attribute attr = new Attribute("Test", 9);
        assertEquals(attr.getBonus(), -1);
    }

    @Test
    public void testTwoValueResultInSameNegativeBonus() {
        Attribute attr1 = new Attribute("Test", 9);
        Attribute attr2 = new Attribute("Test2", 8);
        assertEquals(attr1.getBonus(), -1);
        assertEquals(attr2.getBonus(), attr1.getBonus());
    }

    @Test
    public void testTwoValueResultInSameNullBonus() {
        Attribute attr1 = new Attribute("Test", 10);
        Attribute attr2 = new Attribute("Test2", 11);
        assertEquals(attr1.getBonus(), 0);
        assertEquals(attr2.getBonus(), attr1.getBonus());
    }

    @Test
    public void testTwoValueResultInSamePositiveBonus() {
        Attribute attr1 = new Attribute("Test", 14);
        Attribute attr2 = new Attribute("Test2", 15);
        assertEquals(attr1.getBonus(), 2);
        assertEquals(attr2.getBonus(), attr1.getBonus());
    }
}
