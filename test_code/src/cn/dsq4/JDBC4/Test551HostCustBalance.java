package cn.dsq4.JDBC4;

/**
 * @author: 段市庆
 * @date: 2021/7/9 16:34
 * @Description: Host_cust_balance 表封装
 */
public class Test551HostCustBalance {
    private int SMART_TRANS_ACCT_NO;
    private int CURR_USEABLE_BALANCE;
    private int CURR_BALANCE;
    private int TRANS_DATE;

    public int getSMART_TRANS_ACCT_NO() {
        return SMART_TRANS_ACCT_NO;
    }

    public void setSMART_TRANS_ACCT_NO(int SMART_TRANS_ACCT_NO) {
        this.SMART_TRANS_ACCT_NO = SMART_TRANS_ACCT_NO;
    }

    public int getCURR_USEABLE_BALANCE() {
        return CURR_USEABLE_BALANCE;
    }

    public void setCURR_USEABLE_BALANCE(int CURR_USEABLE_BALANCE) {
        this.CURR_USEABLE_BALANCE = CURR_USEABLE_BALANCE;
    }

    public int getCURR_BALANCE() {
        return CURR_BALANCE;
    }

    public void setCURR_BALANCE(int CURR_BALANCE) {
        this.CURR_BALANCE = CURR_BALANCE;
    }

    public int getTRANS_DATE() {
        return TRANS_DATE;
    }

    public void setTRANS_DATE(int TRANS_DATE) {
        this.TRANS_DATE = TRANS_DATE;
    }

    @Override
    public String toString() {
        return "Test551HostCustBalance{" +
                "SMART_TRANS_ACCT_NO=" + SMART_TRANS_ACCT_NO +
                ", CURR_USEABLE_BALANCE=" + CURR_USEABLE_BALANCE +
                ", CURR_BALANCE=" + CURR_BALANCE +
                ", TRANS_DATE=" + TRANS_DATE +
                '}';
    }


}
