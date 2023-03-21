import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest
{
    Product p1;

    @BeforeEach
    void setUp()
    {
        p1 = new Product("Brad","Robot","000002",256.77);
    }

    @org.junit.jupiter.api.Test
    void setIDSeed()
    {
        p1.setIDSeed(1);
        assertEquals(1,p1.getIDSeed());
    }

    @org.junit.jupiter.api.Test
    void setName()
    {
        p1.setName("Toaster");
        assertEquals("Toaster",p1.getName());
    }

    @org.junit.jupiter.api.Test
    void setDesciprtion()
    {
        p1.setDesciprtion("Toasts");
        assertEquals("Toasts",p1.getDesciprtion());
    }

    @org.junit.jupiter.api.Test
    void setID()
    {
        p1.setID("000009");
        assertEquals("000009",p1.getID());
    }

    @org.junit.jupiter.api.Test
    void setCost()
    {
        p1.setCost(129.99);
        assertEquals(129.99,p1.getCost());
    }

    @org.junit.jupiter.api.Test
    void toCSVRecord()
    {
        assertEquals("Brad,Robot,000002,256.77",p1.toCSVRecord());
    }

    @org.junit.jupiter.api.Test
    void testToString()
    {
        assertEquals("Product{name='Brad', desciprtion='Robot', ID='000002', cost='256.77}",p1.toString());
    }
}