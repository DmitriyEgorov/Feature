package claim.impl;

import claim.ScanClaim;

/**
 * open account claim
 *
 * @author Dmitriy
 * @since 18.03.2020
 */
public class OpenAccountClaim implements ScanClaim {

    private Long localScanId;
    private Long asoaScanId;
    private String accountType;

    /**
     * default constructor
     */
    public OpenAccountClaim() {
    }

    /**
     * constructor
     *
     * @param localScanId - localScanId
     * @param asoaScanId  - asoaScanId
     * @param accountType - accountType
     */
    public OpenAccountClaim(Long localScanId, Long asoaScanId, String accountType) {
        this.localScanId = localScanId;
        this.asoaScanId = asoaScanId;
        this.accountType = accountType;
    }

    @Override
    public Long getLocalScanId() {
        return localScanId;
    }

    /**
     * set localScanId
     *
     * @param localScanId - localScanId
     */
    public void setLocalScanId(Long localScanId) {
        this.localScanId = localScanId;
    }

    /**
     * get asoaScanId
     *
     * @return asoaScanId
     */
    public Long getAsoaScanId() {
        return asoaScanId;
    }

    @Override
    public void setAsoaScanId(Long asoaScanId) {
        this.asoaScanId = asoaScanId;
    }

    /**
     * get accountType
     *
     * @return accountType
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * set accountType
     *
     * @param accountType - accountType
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

}
