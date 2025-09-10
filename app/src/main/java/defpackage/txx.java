package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class txx extends fbi implements txy {
    public txx() {
        super("com.google.vr.vrcore.common.api.ITransitionCallbacks");
    }

    @Override // defpackage.fbi
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        b();
        return true;
    }
}
