package defpackage;

import com.google.ar.core.ArCoreApk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum rtb extends ArCoreApk.Availability {
    public rtb() {
        super("UNKNOWN_TIMED_OUT", 2, 2);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isUnknown() {
        return true;
    }
}
