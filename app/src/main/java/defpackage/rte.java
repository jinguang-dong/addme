package defpackage;

import com.google.ar.core.ArCoreApk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum rte extends ArCoreApk.Availability {
    public rte() {
        super("SUPPORTED_APK_TOO_OLD", 5, 202);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isSupported() {
        return true;
    }
}
