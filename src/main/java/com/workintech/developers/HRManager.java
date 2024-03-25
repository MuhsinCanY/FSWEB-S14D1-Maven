package com.workintech.developers;

import java.util.Arrays;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniors = new JuniorDeveloper[5];
    private MidDeveloper[] mids = new MidDeveloper[5];
    private SeniorDeveloper[] seniors = new SeniorDeveloper[5];

    public HRManager(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HRManager");
        setSalary(getSalary() + 50);
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniors=" + Arrays.toString(juniors) +
                ", mids=" + Arrays.toString(mids) +
                ", seniors=" + Arrays.toString(seniors) +
                '}';
    }

    public void addEmployee(JuniorDeveloper junior , int index){
        //TODO: improve this code
        // and write for others
        if(juniors[index] != null){
            System.out.println("This index is not empty.");
        }else {
            juniors[index] = junior;
        }
    }

    public JuniorDeveloper[] getJuniors() {
        return juniors;
    }

    public MidDeveloper[] getMids() {
        return mids;
    }

    public SeniorDeveloper[] getSeniors() {
        return seniors;
    }
}
