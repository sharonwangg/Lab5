import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /** checkings */
        CHECKINGS,
        /** savings */
        SAVINGS,
        /** student */
        STUDENT,
        /** workplace */
        WORKPLACE
    }

    /**
     * The number of the account.
     */
    private int accountNumber;

    /**
     * Type of account.
     */
    private BankAccountType accountType;

    /**
     * Balance of account.
     */
    private double accountBalance;

    /**
     * Name of owner.
     */
    private String ownerName;

    /**
     * Interest rate.
     */
    private double interestRate;

    /**
     * Interest earned.
     */
    private double interestEarned;

    /**
     * Constructor setting ownerName and accountType.
     * @param name value to set ownerName to
     * @param accountCategory value to set accountType to
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
    }

    /**
     * Sets accountNumber.
     * @param setAccountNumber value to set accountNumber to
     */
    public void setAccountNumber(final int setAccountNumber) {
        accountNumber = setAccountNumber;
    }

    /**
     * Returns accountNumber.
     * @return accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets accountType.
     * @param setAccountType value to set accountType to
     */
    public void setAccountType(final BankAccountType setAccountType) {
        accountType = setAccountType;
    }

    /**
     * Returns accountType.
     * @return accountType
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * Sets account balance.
     * @param setAccountBalance value to set accountBalance to
     */
    public void setAccountBalance(final double setAccountBalance) {
        accountBalance = setAccountBalance;
    }

    /**
     * Returns accountBalance.
     * @return accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets owner name.
     * @param setOwnerName String to set ownerName to
     */
    public void setOwnerName(final String setOwnerName) {
        ownerName = setOwnerName;
    }

    /**
     * Returns ownerName.
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets interest rate.
     * @param setInterestRate value to set interestRate to
     */
    public void setInterestRate(final double setInterestRate) {
        interestRate = setInterestRate;
    }

    /**
     * Returns interest rate.
     * @return interest rate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Sets interestEarned.
     * @param setInterestEarned value to set interestEarned to
     */
    public void setInterestEarned(final double setInterestEarned) {
        interestEarned = setInterestEarned;
    }

    /**
     * Returns interestEarned.
     * @return interestEarned
     */
    public double getInterestEarned() {
        return interestEarned;
    }
}
