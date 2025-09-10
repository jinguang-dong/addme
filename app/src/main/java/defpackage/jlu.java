package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlu extends pod {
    public String a;
    private final poe b;
    private final Map c;

    public jlu(poe poeVar) {
        super(poeVar);
        this.c = new HashMap();
        this.b = poeVar;
        this.a = poeVar.b();
    }

    @Override // defpackage.pod, defpackage.pnx
    public final Object a(CaptureResult.Key key) {
        Object obj = this.c.get(key);
        return obj != null ? obj : this.b.a(key);
    }

    @Override // defpackage.pod, defpackage.pnx
    public final String b() {
        return this.a;
    }

    public final void c(CaptureResult.Key key, Object obj) {
        this.c.put(key, obj);
    }
}
