import java.util.ArrayList;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Block {
    private String previousHash;
    private ArrayList<String> transactions;
    private String blockHash;

    public Block(String previousHash, ArrayList<String> transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;

        StringBuilder data = new StringBuilder();
        for (String transaction : transactions) {
            data.append(transaction);
        }

        try {
            this.blockHash = generateBlockHash(data.toString());
        } catch (NoSuchAlgorithmException e) {
            System.out.println("problems arise");
            throw new RuntimeException(e);
        }
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }

    public String getBlockHash() {
        return blockHash;
    }

    private String generateBlockHash(String data) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedHash = digest.digest(data.getBytes(StandardCharsets.UTF_8));
        StringBuilder hexString = new StringBuilder();

        for (byte b : encodedHash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
    }
}
