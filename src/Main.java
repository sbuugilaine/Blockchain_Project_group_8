import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


                Blockchain blockchain = new Blockchain();

                // add some transactions to the blockchain to demonstrate supply chain tracking


                ArrayList<String> transactions1 = new ArrayList<>();
                ArrayList<String> transactions2 = new ArrayList<>();
                ArrayList<String> transactions3 = new ArrayList<>();
                ArrayList<String> transactions4 = new ArrayList<>();
                ArrayList<String> transactions5 = new ArrayList<>();
                ArrayList<String> transactions6 = new ArrayList<>();


                transactions1.add("Order: 2101");
                transactions1.add("Provider: 223");
                transactions1.add("Date: 21.04.2023");
                transactions1.add("Ordered products: Burana");
                transactions1.add("Status: order placed");
                transactions1.add("Provider places an order with their online ordering system");
                blockchain.addBlock(transactions1);

                transactions2.add("Order: 2101");
                transactions2.add("Provider: 223");
                transactions2.add("Date: 21.04.2023");
                transactions2.add("Ordered products: Burana");
                transactions2.add("Status: order routed to distribution center 2");
                transactions2.add("Distributor receives the order, which is routed to the distribution center");
                blockchain.addBlock(transactions2);

                transactions3.add("Order: 2101");
                transactions3.add("Provider: 223");
                transactions3.add("Date: 22.04.2023");
                transactions3.add("Ordered products: Burana");
                transactions3.add("Status: picked, packed, shipped at distribution center 2");
                transactions3.add("Sophisticated WMS systems are used to enable the pick-pack-ship operations.");
                blockchain.addBlock(transactions3);

                transactions4.add("Order: 2101");
                transactions4.add("Provider: 223");
                transactions4.add("Date: 23.04.2023");
                transactions4.add("Ordered products: Burana");
                transactions4.add("Status: received at destination warehouse 3");
                transactions4.add("Orders are picked using different technology based on inventory velocity and product handling requirements");
                blockchain.addBlock(transactions4);

                transactions5.add("Order: 2101");
                transactions5.add("Provider: 223");
                transactions5.add("Date: 23.04.2023");
                transactions5.add("Ordered products: Burana");
                transactions5.add("Status: packed and shipped via UPS");
                transactions5.add("Orders are packed and shipped by a suitable matter depending on the size of the order");
                blockchain.addBlock(transactions5);

                transactions6.add("Order: 2101");
                transactions6.add("Provider: 223");
                transactions6.add("Date: 23.04.2023");
                transactions6.add("Ordered products: Burana");
                transactions6.add("Status: order received");
                transactions6.add("Order is received at the provider.");
                blockchain.addBlock(transactions6);



                // print out the entire blockchain, including the block hash, previous hash, and list of transactions for each block
                for (Block block : blockchain.getBlocks()) {
                    System.out.println("Block Hash: " + block.getBlockHash());
                    System.out.println("Previous Hash: " + block.getPreviousHash());
                    System.out.println("Transactions: " + block.getTransactions());
                    System.out.println("");

            }

        }
}

