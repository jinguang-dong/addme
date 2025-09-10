package defpackage;

import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbz implements paq {
    private static final long a = TimeUnit.MILLISECONDS.toNanos(500);
    private final Rect b;
    private final sbp c;
    private final hwt d;
    private final pbc e;
    private final String f;
    private final float g;
    private long h;
    private float i;

    public fbz(kgw kgwVar, hwt hwtVar, pbc pbcVar, String str) {
        this(kgwVar, hwtVar, pbcVar, str, 300.0f);
    }

    public final void a(poe poeVar) {
        hwt hwtVar = this.d;
        if (hwtVar.e()) {
            lnl lnlVar = new lnl(poeVar, 0, this.b);
            long j = lnlVar.c;
            if (j - this.h >= a) {
                this.h = j;
                List listB = hwtVar.b(j, lnlVar);
                float fMax = 0.0f;
                if (listB.isEmpty()) {
                    this.e.d("Motion estimator returned empty homography list. Assuming zero motion.");
                    this.i = 0.0f;
                    return;
                }
                qib qibVar = (qib) listB.get(0);
                sbp sbpVar = this.c;
                for (int i = 0; i < ((sex) sbpVar).c; i++) {
                    float[] fArrG = qibVar.g((float[]) sbpVar.get(i));
                    fMax = Math.max(fMax, (float) Math.hypot(fArrG[0] - r4[0], fArrG[1] - r4[1]));
                }
                this.i = fMax;
                this.e.g("Current motion magnitude = " + fMax);
            }
        }
    }

    public final void b() {
        this.e.b("Starting MotionSampler");
        Rect rect = this.b;
        this.d.f(new pas(rect.width(), rect.height()), this.f);
    }

    public final boolean c() {
        return this.d.e() && this.i > this.g;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.e.b("Closing MotionSampler");
        hwt hwtVar = this.d;
        if (hwtVar.e()) {
            hwtVar.c();
        }
    }

    public fbz(kgw kgwVar, hwt hwtVar, pbc pbcVar, String str, float f) {
        this.h = 0L;
        this.i = 0.0f;
        this.b = kgwVar.i();
        this.c = sbp.o(new float[]{0.0f, 0.0f}, new float[]{0.0f, r9.height()}, new float[]{r9.width(), 0.0f}, new float[]{r9.width(), r9.height()});
        this.d = hwtVar;
        this.e = pbcVar;
        this.f = str;
        this.g = f;
    }
}
