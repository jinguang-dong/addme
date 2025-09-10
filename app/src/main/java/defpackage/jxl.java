package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jxl implements pau {
    final /* synthetic */ ggw a;
    final /* synthetic */ jxp b;
    private final owq c = new ovx(oxh.FPS_AUTO);
    private final AtomicBoolean d = new AtomicBoolean(true);

    public jxl(jxp jxpVar, ggw ggwVar) {
        this.a = ggwVar;
        this.b = jxpVar;
    }

    @Override // defpackage.pau
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        oxh oxhVar;
        ltt lttVar = (ltt) obj;
        jxp jxpVar = this.b;
        synchronized (jxpVar.h) {
            int iOrdinal = lttVar.ordinal();
            if (iOrdinal == 0) {
                oxhVar = oxh.FPS_AUTO;
            } else if (iOrdinal == 1) {
                oxhVar = jxpVar.d.f == gho.CINEMATIC ? oxh.FPS_60C_24E : oxh.FPS_24;
            } else if (iOrdinal == 2) {
                oxhVar = jxpVar.d.f == gho.CINEMATIC ? oxh.FPS_60C_30E : oxh.FPS_30;
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalArgumentException(eld.b(lttVar, "Unsupported FPS option "));
                }
                oxhVar = oxh.FPS_60;
            }
            if (this.d.compareAndSet(true, false)) {
                this.c.a(oxhVar);
                return;
            }
            owq owqVar = this.c;
            if (oxhVar == ((ovx) owqVar).d) {
                ((sgt) jxp.a.b().M(3127)).v("changeCaptureRate() do nothing since captureRate [%s] does not change", oxhVar);
            } else {
                Object obj2 = ((ovx) owqVar).d;
                owqVar.a(oxhVar);
                ggw ggwVarA = jxpVar.b.a(nkw.VIDEO);
                ggw ggwVar = this.a;
                ggwVar.a(oxhVar);
                if (ggwVarA == ggwVar) {
                    oxj oxjVarD = jxpVar.v.D(jxpVar.g.a());
                    hbj hbjVar = jxpVar.s;
                    if (hbjVar.p(gym.V) && hbjVar.p(gym.C)) {
                        if ((ggwVar instanceof ggr) && oxjVarD == oxj.RES_1080P) {
                            jxpVar.f.a(oxhVar == oxh.FPS_AUTO ? oxh.FPS_30 : oxhVar);
                        }
                        if ((ggwVar instanceof ggt) && oxjVarD == oxj.RES_2160P) {
                            jxpVar.e.a(oxhVar);
                        }
                    }
                    if (!jxpVar.o) {
                        jxpVar.G(gnm.FPS_SWITCH);
                    }
                }
            }
        }
    }
}
