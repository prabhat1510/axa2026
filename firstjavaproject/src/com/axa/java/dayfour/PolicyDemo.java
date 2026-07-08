package com.axa.java.dayfour;

/**
 * Always as a best practice we write one class in one source file or java file
 */
public class PolicyDemo {

    public static void main(String[] args) {
            Policy policy = new Policy();
            policy.setPolicyId(1111);
            policy.setPolicyName("PolicyDemo");
            policy.setDescription("Property Policy");
            System.out.println(policy.getDescription());
    }
}

class Policy{
    int policyId;
    String policyName;
    String description;

    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

