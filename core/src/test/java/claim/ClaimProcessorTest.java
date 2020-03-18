package claim;

import claim.impl.CloseAccountClaim;
import claim.impl.CloseDepositClaim;
import claim.impl.OpenAccountClaim;
import claim.impl.OpenDepositClaim;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Dmitriy
 * @since 18.03.2020
 */
public class ClaimProcessorTest {
    private static final Long CLOSE_ACCOUNT_CLAIM_ID = 1L;
    private static final Long CLOSE_DEPOSIT_CLAIM_ID = 2L;
    private static final Long OPEN_ACCOUNT_CLAIM_ID = 3L;
    private static final Long OPEN_DEPOSIT_CLAIM_ID = 4L;

    private ClaimProcessor claimProcessor = new ClaimProcessor();

    @Test
    public void loadScanAsoa_closeAccountClaim() {
        CloseAccountClaim claim = new CloseAccountClaim();
        claim.setLocalScanId(Long.MAX_VALUE);
        claimProcessor.loadScanAsoa(claim);
        assertEquals(CLOSE_ACCOUNT_CLAIM_ID, claim.getAsoaScanId());
    }

    @Test
    public void loadScanAsoa_closeAccountClaim_null() {
        CloseAccountClaim claim = new CloseAccountClaim();
        claimProcessor.loadScanAsoa(claim);
        assertNull(claim.getAsoaScanId());
    }

    @Test
    public void loadScanAsoa_closeDepositClaim() {
        CloseDepositClaim claim = new CloseDepositClaim();
        claim.setLocalScanId(Long.MAX_VALUE);
        claimProcessor.loadScanAsoa(claim);
        assertEquals(CLOSE_DEPOSIT_CLAIM_ID, claim.getAsoaScanId());
    }

    @Test
    public void loadScanAsoa_closeDepositClaim_null() {
        CloseDepositClaim claim = new CloseDepositClaim();
        claimProcessor.loadScanAsoa(claim);
        assertNull(claim.getAsoaScanId());
    }

    @Test
    public void loadScanAsoa_openAccountClaim() {
        OpenAccountClaim claim = new OpenAccountClaim();
        claim.setLocalScanId(Long.MAX_VALUE);
        claimProcessor.loadScanAsoa(claim);
        assertEquals(OPEN_ACCOUNT_CLAIM_ID, claim.getAsoaScanId());
    }

    @Test
    public void loadScanAsoa_openAccountClaim_null() {
        OpenAccountClaim claim = new OpenAccountClaim();
        claimProcessor.loadScanAsoa(claim);
        assertNull(claim.getAsoaScanId());
    }

    @Test
    public void loadScanAsoa_openDepositClaim() {
        OpenDepositClaim claim = new OpenDepositClaim();
        claim.setLocalScanId(Long.MAX_VALUE);
        claimProcessor.loadScanAsoa(claim);
        assertEquals(OPEN_DEPOSIT_CLAIM_ID, claim.getAsoaScanId());
    }

    @Test
    public void loadScanAsoa_openDepositClaim_null() {
        OpenDepositClaim claim = new OpenDepositClaim();
        claimProcessor.loadScanAsoa(claim);
        assertNull(claim.getAsoaScanId());
    }

}