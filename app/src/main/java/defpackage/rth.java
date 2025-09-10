package defpackage;

import com.google.ar.core.ArCoreApk;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rth implements ArCoreApk.ICheckAvailabilityCallback {
    final /* synthetic */ rtj a;

    public rth(rtj rtjVar) {
        this.a = rtjVar;
    }

    @Override // com.google.ar.core.ArCoreApk.ICheckAvailabilityCallback
    public final void onResult(ArCoreApk.Availability availability) {
        rtj rtjVar = this.a;
        synchronized (rtjVar) {
            rtjVar.f = availability;
            rtjVar.g = false;
        }
    }
}
