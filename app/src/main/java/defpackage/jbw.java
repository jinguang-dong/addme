package defpackage;

import android.os.CountDownTimer;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jbw extends CountDownTimer {
    final /* synthetic */ float a;
    final /* synthetic */ jbx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbw(jbx jbxVar, long j, long j2, float f) {
        super(j, j2);
        this.a = f;
        this.b = jbxVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        jby jbyVar = this.b.a;
        jbyVar.n.x();
        jbyVar.E.b();
        cancel();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        long seconds = Duration.ofMillis(j).toSeconds();
        jby jbyVar = this.b.a;
        jbyVar.C.B(seconds);
        jbyVar.E.c(this.a, Duration.ofMillis(j));
    }
}
