package defpackage;

import com.google.ar.core.ArCoreApk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum rtd extends ArCoreApk.Availability {
    public rtd() {
        super("SUPPORTED_NOT_INSTALLED", 4, 201);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isSupported() {
        return true;
    }
}
