import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class VendingMachineTest {

    @org.junit.Test
    //checking balance at the start of the program
    public void initialVendingMachineBalance() {

        VendingMachine vendingMachine = new VendingMachine();
        assertEquals(0, vendingMachine.balance);
    }

    @org.junit.Test
    // confirming REVENUE balance at the start of the programm
    public void initialrevenueBalanceTest() {

        VendingMachine vendingMachine = new VendingMachine();
        assertEquals(0, vendingMachine.revenue);
    }

    @org.junit.Test
    //insertCoin but revenue remains the same
    public void insertCoinButRevenueRemains() {

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin();
        assertEquals(1, vendingMachine.balance);
        assertEquals(0, vendingMachine.revenue);
    }

    @org.junit.Test
    public void refundTest() {

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.refund();
        assertEquals(0, vendingMachine.balance);
    }

    @org.junit.Test
    // no coin  inserted
    public void noInsertCoinTest() {

        VendingMachine vendingMachine = new VendingMachine();
        assertFalse("coin present int the machine", vendingMachine.vendCandyBar());
    }

    @org.junit.Test
    //three coins inserted
    public void threeCoinsInserted() {

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin();
        vendingMachine.insertCoin();
        vendingMachine.insertCoin();
        vendingMachine.vendCandyBar();
        assertEquals(3, vendingMachine.getRevenue());
    }

    @org.junit.Test
    //extra check restock
    public void restock() {

        VendingMachine vendingMachine = new VendingMachine();
        assertEquals(20, VendingMachine.CANDY_CAPACITY);
    }
}
