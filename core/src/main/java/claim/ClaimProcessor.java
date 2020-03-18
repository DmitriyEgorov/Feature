package claim;

import claim.impl.CloseAccountClaim;
import claim.impl.CloseDepositClaim;
import claim.impl.OpenAccountClaim;
import claim.impl.OpenDepositClaim;

/**
 * claim processor
 *
 * @author Dmitriy
 * @since 18.03.2020
 */
public class ClaimProcessor {

    private static final Long CLOSE_ACCOUNT_CLAIM_ID = 1L;
    private static final Long CLOSE_DEPOSIT_CLAIM_ID = 2L;
    private static final Long OPEN_ACCOUNT_CLAIM_ID = 3L;
    private static final Long OPEN_DEPOSIT_CLAIM_ID = 4L;

    /**
     * load scan to asoa
     *
     * @param claim - claim
     */
    public void loadScanAsoa(ScanClaim claim) {
        if (claim.getLocalScanId() != null) {
            if (claim instanceof CloseAccountClaim) {
                claim.setAsoaScanId(CLOSE_ACCOUNT_CLAIM_ID);
            }
            if (claim instanceof CloseDepositClaim) {
                claim.setAsoaScanId(CLOSE_DEPOSIT_CLAIM_ID);
            }
            if (claim instanceof OpenAccountClaim) {
                claim.setAsoaScanId(OPEN_ACCOUNT_CLAIM_ID);
            }
            if (claim instanceof OpenDepositClaim) {
                claim.setAsoaScanId(OPEN_DEPOSIT_CLAIM_ID);
            }
        }
    }

}
