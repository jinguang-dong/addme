package defpackage;

import android.content.Context;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vb {
    private final Context a;
    private volatile boolean b;

    public vb(Context context) {
        this.a = context;
    }

    public final boolean a() {
        if (!this.b) {
            Trace.beginSection("CXCP#checkCameraPermission");
            if (this.a.checkSelfPermission("android.permission.CAMERA") == 0) {
                this.b = true;
            }
            Trace.endSection();
        }
        return this.b;
    }
}
