package claim.impl;

import claim.ScanClaim;

/**
 * close account clim
 *
 * @author Dmitriy
 * @since 18.03.2020
 */
public class CloseAccountClaim implements ScanClaim {

    private Long localScanId;
    private Long asoaScanId;
    private String closeAccountNumber;

    /**
     * default constructor
     */
    public CloseAccountClaim() {
    }

    /**
     * constructor
     *
     * @param localScanId        - localScanId
     * @param asoaScanId         - asoaScanId
     * @param closeAccountNumber - closeAccountNumber
     */
    public CloseAccountClaim(Long localScanId, Long asoaScanId, String closeAccountNumber) {
        this.localScanId = localScanId;
        this.asoaScanId = asoaScanId;
        this.closeAccountNumber = closeAccountNumber;
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
     * get closeAccountNumber
     *
     * @return closeAccountNumber
     */
    public String getCloseAccountNumber() {
        return closeAccountNumber;
    }

    /**
     * set closeAccountNumber
     *
     * @param closeAccountNumber - closeAccountNumber
     */
    public void setCloseAccountNumber(String closeAccountNumber) {
        this.closeAccountNumber = closeAccountNumber;
    }

}
