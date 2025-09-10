package defpackage;

import com.google.ar.core.ArCoreApk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum rtf extends ArCoreApk.Availability {
    public rtf() {
        super("SUPPORTED_INSTALLED", 6, 203);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isSupported() {
        return true;
    }
}
