package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kan {
    public rwc a;
    private final int b;
    private final boolean c;
    private final jsf d;
    private final hyh e;
    private final AtomicReference f;
    private volatile int g;
    private volatile float h;
    private volatile boolean i;
    private final pbn j;
    private volatile int k;

    public kan(hpa hpaVar, pjo pjoVar, hbj hbjVar, jsf jsfVar, hyh hyhVar, pbn pbnVar) {
        final AtomicReference atomicReference = new AtomicReference();
        this.f = atomicReference;
        boolean z = true;
        this.k = 1;
        this.i = false;
        this.a = rvk.a;
        this.b = ((Integer) pjoVar.n(CameraCharacteristics.SENSOR_MAX_ANALOG_SENSITIVITY, 0)).intValue();
        if (!hbjVar.p(haa.F)) {
            gzi gziVar = gzo.a;
            z = false;
        }
        this.c = z;
        this.d = jsfVar;
        this.e = hyhVar;
        this.j = pbnVar;
        hpaVar.c(new hpb() { // from class: kam
            @Override // defpackage.hpb
            public final void ey(lnl lnlVar) {
                atomicReference.set(lnlVar);
            }
        }, sxo.a);
    }

    private final boolean b(lnl lnlVar, int i) {
        return TimeUnit.NANOSECONDS.toMillis(lnlVar.d) < ((long) i) || lnlVar.f < this.b;
    }

    private final boolean c(lnl lnlVar) {
        return this.a.h() && lnlVar.c < ((Long) this.a.c()).longValue();
    }

    private static final boolean d(lnl lnlVar, float f) {
        Rect rect = lnlVar.p;
        int iWidth = lnlVar.v.width();
        return ((float) iWidth) / ((float) (rect != null ? rect.width() : iWidth)) < f;
    }

    public final int a() {
        lnl lnlVar = (lnl) this.f.get();
        int i = 1;
        if (lnlVar != null) {
            this.i = false;
            pbn pbnVar = this.j;
            pbnVar.f("getStatus-longPressChk");
            boolean zB = this.d.b();
            pbnVar.g();
            if (zB) {
                i = 3;
            } else {
                pbnVar.f("getStatus-ANSEngagedChk");
                boolean zBooleanValue = ((Boolean) this.e.b.dL()).booleanValue();
                pbnVar.g();
                if (!zBooleanValue) {
                    if (this.c) {
                        this.g = 66;
                        this.h = 3.0f;
                    } else {
                        this.g = 66;
                        this.h = 1.5f;
                    }
                    if (d(lnlVar, 1.5f) && b(lnlVar, 66) && !c(lnlVar)) {
                        this.k = 3;
                    } else if (d(lnlVar, this.h) && b(lnlVar, this.g) && !c(lnlVar)) {
                        this.k = 2;
                    } else {
                        this.k = 1;
                    }
                }
            }
            this.k = i;
            return i;
        }
        if (!this.i) {
            this.i = true;
        }
        return this.k;
    }
}
