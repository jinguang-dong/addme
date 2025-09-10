package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfk implements khf {
    private final CaptureResult.Key a;
    private final Object b;

    public lfk(CaptureResult.Key key, Object obj) {
        this.a = key;
        this.b = obj;
    }

    @Override // defpackage.khf
    public final boolean a(poe poeVar) {
        CaptureResult.Key key = this.a;
        Object objA = poeVar.a(key);
        Object obj = this.b;
        if (a.K(objA, obj)) {
            return true;
        }
        ((sgt) lfm.a.c().M(4092)).G("Metadata mismatch for key %s. Expected: %s, got: %s.", key, obj, poeVar.a(key));
        return false;
    }
}
