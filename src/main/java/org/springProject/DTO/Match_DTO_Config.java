package org.springProject.DTO;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Match_DTO_Config {
    @NotBlank(message = "Not Be Blank")
    @Size(min = 3,max = 15,message = "Your Size Should Be 3 to 15")
    private String userName;
    @NotBlank(message = "Not Be Blank")
    @Size(min = 3,max = 15,message = "Your Size Should Be 3 to 15")
   private String crushName;
    @AssertTrue(message = "You Have To Accept Term And Condition")
    Boolean termAndCondition;
    String appResult;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCrushName() {
        return crushName;
    }

    public void setCrushName(String crushName) {
        this.crushName = crushName;
    }

    public Boolean getTermAndCondition() {
        return termAndCondition;
    }

    public void setTermAndCondition(Boolean termAndCondition) {
        this.termAndCondition = termAndCondition;
    }

    public String getAppResult() {
        return appResult;
    }

    public void setAppResult(String appResult) {
        this.appResult = appResult;
    }
}
