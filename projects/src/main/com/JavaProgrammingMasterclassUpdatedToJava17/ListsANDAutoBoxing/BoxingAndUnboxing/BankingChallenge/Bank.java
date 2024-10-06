package main.com.JavaProgrammingMasterclassUpdatedToJava17.ListsANDAutoBoxing.BoxingAndUnboxing.BankingChallenge;

import java.util.ArrayList;
public class Bank {
    private String name;
    ArrayList<Branch> branches;

    public Bank(String name){
        this.name=name;
        branches=new ArrayList<>();
    }

    private boolean addBranch(String nameOfBranch){
        if(findBranch(nameOfBranch)!=null){
            return true;
        }else{
            return false;
        }
    }

    private boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initialTransaction){
        Branch branch = findBranch(nameOfBranch);
        if(branch!=null){
//            branch.newCustomer();
        }
        return false;
    }

    private Branch findBranch(String nameOfBranch){
        for(Branch b : this.branches){
            Branch branch = new Branch(nameOfBranch);
            this.branches.add(branch);
        }
        return null;
    }

    private boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = new Branch("newBranch");
        if(branch!=null){
//            return branch.addCustomerTransation(customerName, transaction);
        }
        return false;
    }
}
