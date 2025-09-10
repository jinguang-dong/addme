package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class rqp extends fbi implements rqq {
    public rqp() {
        super("com.google.android.play.core.install.protocol.IInstallServiceCallback");
    }

    @Override // defpackage.fbi
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Bundle bundle = (Bundle) fbj.a(parcel, Bundle.CREATOR);
            fbj.b(parcel);
            c(bundle);
        } else if (i == 2) {
            Bundle bundle2 = (Bundle) fbj.a(parcel, Bundle.CREATOR);
            fbj.b(parcel);
            b(bundle2);
        } else {
            if (i != 3) {
                return false;
            }
            fbj.b(parcel);
        }
        return true;
    }
}
