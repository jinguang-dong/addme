package defpackage;

import android.os.CountDownTimer;
import com.google.android.apps.camera.ui.views.CountdownSnapSlider;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mtj extends CountDownTimer {
    long a;
    final /* synthetic */ long b;
    final /* synthetic */ double c;
    final /* synthetic */ boolean d;
    final /* synthetic */ mtm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtj(mtm mtmVar, long j, long j2, double d, boolean z) {
        super(j, 25L);
        this.b = j2;
        this.c = d;
        this.d = z;
        this.e = mtmVar;
        this.a = (long) Math.ceil(j2 / 1000.0d);
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        mtm mtmVar = this.e;
        mtmVar.l(Duration.ZERO);
        if (!this.d) {
            mtmVar.m = false;
            mtmVar.g();
        } else {
            double dC = mtmVar.k.c();
            double d = this.c;
            mtmVar.u(dC, d, 250L, new cvn(), new mtk(mtmVar, d, 1), 200L, 1);
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        double d = j;
        long jCeil = (long) Math.ceil(d / 1000.0d);
        if (jCeil != this.a) {
            mtm mtmVar = this.e;
            mtmVar.j.k(mtmVar.e(jCeil), mtmVar.d(jCeil));
            mtmVar.o.h(Long.toString(jCeil));
            this.a = jCeil;
        }
        mtm mtmVar2 = this.e;
        long j2 = this.b;
        double d2 = this.c;
        double dMin = Math.min((d / j2) * d2, d2 * (1.0d - mtmVar2.c.getInterpolation((float) (1.0d - r0))));
        double dMin2 = Math.min((j2 - j) / 200.0d, 1.0d);
        CountdownSnapSlider countdownSnapSlider = mtmVar2.k;
        countdownSnapSlider.g = dMin2;
        countdownSnapSlider.e(dMin);
    }
}
