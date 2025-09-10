package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmc extends ojl {
    private final pau a;

    public kmc(pau pauVar) {
        super((short[]) null);
        this.a = pauVar;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        this.a.a(new kmd((Float) poeVar.a(CaptureResult.LENS_FOCUS_DISTANCE), (Pair) poeVar.a(CaptureResult.LENS_FOCUS_RANGE)));
    }
}
