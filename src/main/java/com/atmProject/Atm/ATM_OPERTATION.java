package com.atmProject.Atm;

public class ATM_OPERTATION extends ATM_ABSTRACT{
    String arr[][] = new String[2][10];
    
    ATM_STORE check = new ATM_STORE();
    int idx = 0;
    
    @Override
    void withdrawMoney(double withdrawMoney) {
        
        arr[0][idx] = ""+withdrawMoney;
        arr[1][idx] = "Amount withdrawn";

        if(check.getBalance() <= 0){
            System.out.println("Cannot initiate process due to insufficient balance");
            System.exit(0);
        }else{
            check.setBalance(check.getBalance() - withdrawMoney);
            System.out.println("Please collect your amount");
        }
        idx++;
        viewBalance();
    }

    @Override
    void depositMoney(double depositMoney) {
        
        arr[0][idx] = ""+depositMoney;
        arr[1][idx] = "Amount deposited";

        check.setBalance(check.getBalance() + depositMoney);
        System.out.println("Added "+depositMoney+" to your account");
        idx++;
        viewBalance();      
    }

    @Override
    void miniStatement() {

        for(int i = 0 ; i < 10 && arr[0][i] != null ; i++){
            System.out.println(arr[0][i]+" "+arr[1][i]);
        }

        System.out.println("Availabel balance: " + check.getBalance());
    }

    @Override
    void viewBalance() {
        System.out.println("Available balance " + check.getBalance());   
    }
    
}
