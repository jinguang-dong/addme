package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iaq extends ojl {
    public volatile poe a;
    private final khf b;
    private final rwc c;

    public iaq(khf khfVar, rwc rwcVar) {
        super((short[]) null);
        this.b = khfVar;
        this.c = rwcVar;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        if (poeVar.a(CaptureResult.COLOR_CORRECTION_GAINS) == null || poeVar.a(CaptureResult.COLOR_CORRECTION_TRANSFORM) == null || poeVar.a(CaptureResult.CONTROL_AE_REGIONS) == null || !this.b.a(poeVar)) {
            return;
        }
        rwc rwcVar = this.c;
        if (rwcVar.h()) {
            ((kpt) rwcVar.c()).a(poeVar);
        }
        this.a = poeVar;
    }
}
