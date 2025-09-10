package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kzr extends ojl implements paq {
    private static final sgv c = sgv.g("kzr");
    public final kzo a;
    boolean b;
    private final Executor d;
    private final juu e;
    private final boolean f;
    private final AtomicReference g;

    public kzr(kzo kzoVar, juu juuVar, boolean z, Executor executor) {
        super((short[]) null);
        this.g = new AtomicReference("");
        this.b = false;
        this.a = kzoVar;
        this.f = z;
        this.e = juuVar;
        this.d = executor;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [sgt, shi] */
    @Override // defpackage.ojl
    public final synchronized void a(poe poeVar) {
        String str;
        if (this.b) {
            ((sgt) c.c().M(3872)).s("Camera update after close, ignoring.");
            return;
        }
        String strB = (String) poeVar.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        if (this.f) {
            juu juuVar = this.e;
            str = (String) juuVar.a.map(new kzq(poeVar, strB, 0)).orElse(strB);
        } else {
            str = null;
        }
        if (str != null) {
            strB = str;
        } else if (strB == null) {
            strB = poeVar.b();
        }
        if (strB == null || strB.equals(this.g.getAndSet(strB))) {
            return;
        }
        try {
            this.d.execute(new img(this, strB, 19));
        } catch (RejectedExecutionException e) {
            ((sgt) ((sgt) c.c().i(e)).M((char) 3871)).s("Update operation couldn't be completed.");
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.b = true;
    }
}
