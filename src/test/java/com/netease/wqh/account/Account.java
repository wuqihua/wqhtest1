package com.netease.wqh.account;

public class Account {

    private int accountId;

    private String description;

    private Long endDate;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }
    private static Integer CODE = 5;

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", description='" + description + '\'' +
                ", endDate=" + endDate +
                '}';
    }
}
