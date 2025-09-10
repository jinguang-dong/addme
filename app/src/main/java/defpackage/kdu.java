package defpackage;

import android.view.View;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdu implements kek {
    private final uem a;

    public kdu(uem uemVar) {
        this.a = uemVar;
    }

    @Override // defpackage.kek
    public final void c(float f, Duration duration) {
        jtl jtlVar = (jtl) this.a.a();
        long seconds = duration.toSeconds();
        nhm nhmVar = jtlVar.b;
        nhmVar.h = seconds;
        nhmVar.m = String.format("%01d:%02d", Long.valueOf(seconds / 60), Long.valueOf(seconds % 60));
        nhmVar.invalidate();
        jtlVar.a.c = ((int) (f * 100.0f)) >= 100;
    }

    @Override // defpackage.kek
    public final void b() {
    }

    @Override // defpackage.kek
    public final void d() {
    }

    @Override // defpackage.kek
    public final void a(View view) {
    }
}
