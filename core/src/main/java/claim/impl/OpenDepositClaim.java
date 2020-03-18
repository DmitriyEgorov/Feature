package claim.impl;

import claim.ScanClaim;

/**
 * open deposit claim
 *
 * @author Dmitriy
 * @since 18.03.2020
 */
public class OpenDepositClaim implements ScanClaim {

    private Long localScanId;
    private Long asoaScanId;
    private String openProductId;

    /**
     * default constructor
     */
    public OpenDepositClaim() {
    }

    /**
     * constructor
     *
     * @param localScanId   - localScanId
     * @param asoaScanId    - asoaScanId
     * @param openProductId - openProductId
     */
    public OpenDepositClaim(Long localScanId, Long asoaScanId, String openProductId) {
        this.localScanId = localScanId;
        this.asoaScanId = asoaScanId;
        this.openProductId = openProductId;
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
     * get openProductId
     *
     * @return openProductId
     */
    public String getOpenProductId() {
        return openProductId;
    }

    /**
     * set openProductId
     *
     * @param openProductId - openProductId
     */
    public void setOpenProductId(String openProductId) {
        this.openProductId = openProductId;
    }

}
