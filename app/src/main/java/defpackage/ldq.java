package defpackage;

import com.google.googlex.gcam.BurstSpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldq extends ldi {
    final szh a;
    final szh b;
    final /* synthetic */ ldr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldq(ldr ldrVar, gga ggaVar, hxu hxuVar, BurstSpec burstSpec, poe poeVar) {
        super(ggaVar, hxuVar, burstSpec, poeVar);
        this.c = ldrVar;
        this.a = new szh();
        this.b = new szh();
    }

    public final void a(hzr hzrVar) {
        this.b.e(hzrVar);
    }

    @Override // defpackage.ldi
    public final void c(lau lauVar) {
        if (this.c.c.a(lauVar)) {
            super.c(lauVar);
        } else {
            ((sgt) ldr.a.c().M(4020)).v("Frame %s rejected.", lauVar.b());
            lauVar.close();
        }
    }
}
