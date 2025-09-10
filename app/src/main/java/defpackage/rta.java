package defpackage;

import com.google.ar.core.ArCoreApk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum rta extends ArCoreApk.Availability {
    public rta() {
        super("UNKNOWN_CHECKING", 1, 1);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isTransient() {
        return true;
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isUnknown() {
        return true;
    }
}
