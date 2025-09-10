package defpackage;

import com.google.lens.sdk.LensApi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tne implements psb {
    private final LensApi.LensAvailabilityCallback a;
    private final int b;

    public tne(LensApi.LensAvailabilityCallback lensAvailabilityCallback, int i) {
        this.a = lensAvailabilityCallback;
        this.b = i;
    }

    @Override // defpackage.psb
    public final void a(psk pskVar) {
        int iB;
        int i = 1;
        if (this.b == 0 ? (iB = prh.b(pskVar.e)) != 0 : (iB = prh.b(pskVar.f)) != 0) {
            i = iB;
        }
        this.a.onAvailabilityStatusFetched(i - 2);
    }
}
