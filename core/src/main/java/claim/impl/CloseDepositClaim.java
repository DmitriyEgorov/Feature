package claim.impl;

import claim.ScanClaim;

/**
 * close deposit claim
 *
 * @author Dmitriy
 * @since 18.03.2020
 */
public class CloseDepositClaim implements ScanClaim {

    private Long localScanId;
    private Long asoaScanId;
    private String closeDepositId;

    /**
     * default constructor
     */
    public CloseDepositClaim() {
    }

    /**
     * constructor
     *
     * @param localScanId    - local scan id
     * @param asoaScanId     - asoa scan id
     * @param closeDepositId - closeDepositId
     */
    public CloseDepositClaim(Long localScanId, Long asoaScanId, String closeDepositId) {
        this.localScanId = localScanId;
        this.asoaScanId = asoaScanId;
        this.closeDepositId = closeDepositId;
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
     * get closeDepositId
     *
     * @return closeDepositId
     */
    public String getCloseDepositId() {
        return closeDepositId;
    }

    /**
     * set closeDepositId
     *
     * @param closeDepositId - closeDepositId
     */
    public void setCloseDepositId(String closeDepositId) {
        this.closeDepositId = closeDepositId;
    }

}
