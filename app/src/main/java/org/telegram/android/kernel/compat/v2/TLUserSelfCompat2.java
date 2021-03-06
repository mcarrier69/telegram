package org.telegram.android.kernel.compat.v2;

import org.telegram.android.kernel.compat.v1.TLBoolCompat;
import org.telegram.android.kernel.compat.v1.TLUserStatusCompat;

/**
 * Created with IntelliJ IDEA.
 * User: ex3ndr
 * Date: 18.09.13
 * Time: 1:58
 */
public class TLUserSelfCompat2 extends TLUserCompat2 {
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String phone;
    protected TLUserProfilePhotoAbsCompat2 photo;
    protected TLUserStatusCompat status;
    protected TLBoolCompat inactive;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public TLUserProfilePhotoAbsCompat2 getPhoto() {
        return photo;
    }

    public TLUserStatusCompat getStatus() {
        return status;
    }

    public TLBoolCompat getInactive() {
        return inactive;
    }
}
