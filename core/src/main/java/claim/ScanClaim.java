package claim;

/**
 * interface for load scan
 *
 * @author Dmitriy
 * @since 18.03.2020
 */
public interface ScanClaim {

    /**
     * get local scan id
     *
     * @return local scan id
     */
    Long getLocalScanId();

    /**
     * set asoa scan id
     *
     * @param asoaScanId - asoa scan id
     */
    void setAsoaScanId(Long asoaScanId);

}
