package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfj implements khf {
    private final CaptureResult.Key a;
    private final long b;

    public lfj(CaptureResult.Key key, long j) {
        this.a = key;
        this.b = j;
    }

    @Override // defpackage.khf
    public final boolean a(poe poeVar) {
        CaptureResult.Key key = this.a;
        Long l = (Long) poeVar.a(key);
        if (l == null) {
            ((sgt) lfm.a.c().M(4090)).v("Missing value for key %s.", key);
            return false;
        }
        long j = this.b;
        if (l.longValue() > j) {
            return true;
        }
        ((sgt) lfm.a.c().M(4089)).G("Unexpected value for key %s. Expected: greater than %s, got: %s.", key, Long.valueOf(j), l);
        return false;
    }
}
