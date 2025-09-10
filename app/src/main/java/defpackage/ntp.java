package defpackage;

import android.content.res.Resources;
import android.widget.SeekBar;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ntp implements SeekBar.OnSeekBarChangeListener {
    boolean a = false;
    final /* synthetic */ ntr b;

    public ntp(ntr ntrVar) {
        this.b = ntrVar;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, owq] */
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) throws Resources.NotFoundException {
        ntr ntrVar = this.b;
        rwc rwcVar = ntrVar.c;
        if (rwcVar.h()) {
            float f = i;
            boolean z2 = true;
            if (z) {
                owq owqVar = ntrVar.r;
                jjp jjpVar = (jjp) owqVar.dL();
                float f2 = f / 200.0f;
                jjpVar.h = Optional.of(Float.valueOf((f2 + f2) - 1.0f));
                owqVar.a(jjpVar);
                ntrVar.n.j();
                ntrVar.e(true);
            }
            if (!this.a) {
                ntrVar.n.h();
                ntrVar.g(true, true);
            }
            ntrVar.m.e(i, 200);
            float f3 = f - 100.0f;
            float fAbs = f3 >= 0.0f ? Math.abs(100.0f) : 100.0f;
            qqq qqqVar = (qqq) rwcVar.c();
            float f4 = f3 / fAbs;
            qqqVar.d.a(Float.valueOf(f4));
            if (((Boolean) ((ovx) qqqVar.e).d).booleanValue() || f4 != 0.0f) {
                qqqVar.y(1);
                z2 = false;
            } else {
                qqqVar.y(0);
            }
            ?? r6 = qqqVar.a;
            if (((Boolean) ((ovx) r6).d).booleanValue() != z2) {
                r6.a(Boolean.valueOf(z2));
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.a = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        ntr ntrVar = this.b;
        ntrVar.n.h();
        ntrVar.g(true, true);
        this.a = false;
    }
}
