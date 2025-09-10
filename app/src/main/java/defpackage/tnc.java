package defpackage;

import com.google.lens.sdk.LensApi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class tnc implements psf {
    public final /* synthetic */ LensApi.LensAvailabilityCallback a;
    private final /* synthetic */ int b;

    public /* synthetic */ tnc(LensApi.LensAvailabilityCallback lensAvailabilityCallback, int i) {
        this.b = i;
        this.a = lensAvailabilityCallback;
    }

    @Override // defpackage.psf
    public final void a(int i) {
        if (this.b != 0) {
            int i2 = LensApi.c;
            if (i == 0) {
                throw null;
            }
            this.a.onAvailabilityStatusFetched(i - 2);
            return;
        }
        int i3 = LensApi.c;
        if (i == 0) {
            throw null;
        }
        this.a.onAvailabilityStatusFetched(i - 2);
    }
}
