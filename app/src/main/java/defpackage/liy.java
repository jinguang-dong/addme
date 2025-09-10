package defpackage;

import android.graphics.PointF;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class liy extends nqg {
    public static final /* synthetic */ int b = 0;
    private static final Duration c = Duration.ofMillis(1500);
    public final owf a;
    private final owf d;
    private final owq e;
    private final ljd f;
    private final owf g;
    private final owf h;
    private final owf i;
    private final syx j;
    private final pfl k;

    public liy(owf owfVar, owq owqVar, owf owfVar2, pfl pflVar, ljd ljdVar, owf owfVar3, owf owfVar4, owf owfVar5, ScheduledExecutorService scheduledExecutorService) {
        this.d = owfVar;
        this.e = owqVar;
        this.a = owfVar2;
        this.k = pflVar;
        this.f = ljdVar;
        this.g = owfVar3;
        this.h = owfVar4;
        this.i = owfVar5;
        this.j = ske.B(scheduledExecutorService);
    }

    @Override // defpackage.nqh
    public final boolean a(PointF pointF) {
        if (((Boolean) this.g.dL()).booleanValue()) {
            ljd ljdVar = this.f;
            pas pasVar = (pas) this.h.dL();
            int iOrdinal = ((mxm) this.i.dL()).ordinal();
            ljdVar.b(iOrdinal != 0 ? iOrdinal != 2 ? iOrdinal != 3 ? new PointF(pointF.x / pasVar.a, pointF.y / pasVar.b) : new PointF(1.0f - (pointF.y / pasVar.a), pointF.x / pasVar.b) : new PointF(1.0f - (pointF.x / pasVar.a), 1.0f - (pointF.y / pasVar.b)) : new PointF(pointF.y / pasVar.a, 1.0f - (pointF.x / pasVar.b)));
        }
        owq owqVar = this.e;
        Optional optional = ((jjp) owqVar.dL()).a().a;
        if (!((Boolean) this.d.dL()).booleanValue() || optional.isEmpty()) {
            return false;
        }
        float fFloatValue = ((Float) optional.get()).floatValue();
        our ourVar = new our();
        sza szaVarD = this.j.d(new lgc(ourVar, 16), c.toMillis(), TimeUnit.MILLISECONDS);
        syu syuVarL = owl.l(owl.h(this.a, new idb(18)), ourVar);
        this.k.j(true);
        jjp jjpVar = (jjp) owqVar.dL();
        jjpVar.a = Optional.empty();
        owqVar.a(jjpVar);
        liw liwVar = new liw(this, fFloatValue);
        sxo sxoVar = sxo.a;
        ske.W(syuVarL, liwVar, sxoVar);
        ske.W(szaVarD, new lix(this, fFloatValue), sxoVar);
        return true;
    }

    public final void c(float f) {
        pfl pflVar = this.k;
        pflVar.j(false);
        pflVar.k(f);
        owq owqVar = this.e;
        jjp jjpVar = (jjp) owqVar.dL();
        jjpVar.a = Optional.of(Float.valueOf(f));
        owqVar.a(jjpVar);
    }
}
