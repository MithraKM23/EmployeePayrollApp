/*
 * @author Developer
 * @version 4
 */

package com.employeePayroll.payslip;

public class DownloadToken {

	private final long createdTime;
    private final long expiresMillis;

    public DownloadToken() {
        this.createdTime = System.currentTimeMillis();
        this.expiresMillis = 60*1000;
    }

    //Checks whether the token is still valid
    public boolean isExpired() {
        return System.currentTimeMillis() > (createdTime + expiresMillis);
    }

}
