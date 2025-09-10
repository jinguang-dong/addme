package defpackage;

import com.google.ar.core.ArCoreApk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum rtc extends ArCoreApk.Availability {
    public rtc() {
        super("UNSUPPORTED_DEVICE_NOT_CAPABLE", 3, 100);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isUnsupported() {
        return true;
    }
}
