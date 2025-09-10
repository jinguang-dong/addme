package defpackage;

import com.google.ar.core.ArCoreApk;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rtn implements ArCoreApk.ICheckAvailabilityCallback {
    final /* synthetic */ AtomicReference a;

    public rtn(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // com.google.ar.core.ArCoreApk.ICheckAvailabilityCallback
    public final void onResult(ArCoreApk.Availability availability) {
        this.a.set(availability);
    }
}
