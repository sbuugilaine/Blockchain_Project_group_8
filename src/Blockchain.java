import java.util.ArrayList;

public class Blockchain {
    private ArrayList<Block> blocks;

    public Blockchain() {
        blocks = new ArrayList<>();
        blocks.add(createGenesisBlock());
    }

    private Block createGenesisBlock() {
        ArrayList<String> transactions = new ArrayList<>();
        transactions.add("Genesis block");
        return new Block("", transactions);
    }

    public void addBlock(ArrayList<String> transactions) {
        Block previousBlock = blocks.get(blocks.size() - 1);
        Block block = new Block(previousBlock.getBlockHash(), transactions);
        blocks.add(block);
    }

    public ArrayList<Block> getBlocks() {
        return blocks;
    }
}



