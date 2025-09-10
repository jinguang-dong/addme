package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfl implements khf {
    private final CaptureResult.Key a;

    public lfl(CaptureResult.Key key) {
        this.a = key;
    }

    @Override // defpackage.khf
    public final boolean a(poe poeVar) {
        CaptureResult.Key key = this.a;
        if (poeVar.a(key) != null) {
            return true;
        }
        ((sgt) lfm.a.c().M(4094)).v("Missing expected metadata value for key %s.", key);
        return false;
    }
}
