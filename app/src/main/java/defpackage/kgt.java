package defpackage;

import android.util.DisplayMetrics;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kgt {
    public static final sgv a = sgv.g("kgt");
    private final mwq A;
    public final syu b;
    public final out c;
    public final Executor d;
    public final kpb e;
    public final DisplayMetrics f;
    public final mes g;
    public final CameraActivityTiming h;
    public final rwc i;
    public final nkw j;
    public final gnt k;
    public final rwc l;
    public final fhe m;
    public kgs n;
    public final lqo o;
    public final ipt p;
    public final fgs q;
    public final kgn r;
    public final pkc s;
    public final hbj t;
    public final rnn u;
    public final qyc v;
    public final qqq w;
    private final owf x;
    private final owf y;
    private final owf z;

    public kgt(out outVar, rnn rnnVar, lqo lqoVar, Executor executor, kpb kpbVar, pkc pkcVar, DisplayMetrics displayMetrics, mes mesVar, CameraActivityTiming cameraActivityTiming, gnt gntVar, mwq mwqVar, rwc rwcVar, hbj hbjVar, fgs fgsVar, fhe fheVar, syu syuVar, kgn kgnVar, owf owfVar, owf owfVar2, owf owfVar3, ipt iptVar, qqq qqqVar, rwc rwcVar2, qyc qycVar, nkw nkwVar) {
        this.c = outVar;
        this.u = rnnVar;
        this.d = executor;
        this.e = kpbVar;
        this.o = lqoVar;
        this.s = pkcVar;
        this.f = displayMetrics;
        this.g = mesVar;
        this.h = cameraActivityTiming;
        this.p = iptVar;
        this.w = qqqVar;
        this.i = rwcVar2;
        this.v = qycVar;
        this.j = nkwVar;
        this.k = gntVar;
        this.A = mwqVar;
        this.l = rwcVar;
        this.q = fgsVar;
        this.m = fheVar;
        this.b = syuVar;
        this.r = kgnVar;
        this.x = owfVar;
        this.y = owfVar2;
        this.z = owfVar3;
        this.t = hbjVar;
    }

    public final jtm a(jtd jtdVar) {
        pkc pkcVar = this.s;
        pjr pjrVar = jtdVar.a;
        pkcVar.f(pjrVar);
        return new jtm(jtdVar, new jtj(pjrVar, jtdVar.d.b, jtdVar.c, ((Boolean) this.x.dL()).booleanValue(), ((Boolean) this.y.dL()).booleanValue(), jtdVar.e, (lkk) this.z.dL()));
    }

    public final syu b(jtd jtdVar, syu syuVar) {
        return c(a(jtdVar), syuVar);
    }

    public final syu c(final jtm jtmVar, final syu syuVar) {
        pjr pjrVar = jtmVar.a.a;
        pjrVar.getClass();
        mwq mwqVar = this.A;
        ocq ocqVarC = ((pt) mwqVar.b).c();
        String str = pjrVar.a;
        str.getClass();
        pp.b(str);
        ((uh) ocqVarC.aQ().a).h(str, ufw.a, ts.a, true, new vd(1));
        ((pci) mwqVar.a).a().d(new ngh(mwqVar, 4));
        return ske.R(new sxh() { // from class: kgq
            /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x012f  */
            /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, pbn] */
            /* JADX WARN: Type inference failed for: r1v2, types: [sgt, shi] */
            /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, pbn] */
            @Override // defpackage.sxh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.syu a() {
                /*
                    Method dump skipped, instructions count: 612
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.kgq.a():syu");
            }
        }, this.d);
    }

    public final void e(String str) {
        if (this.n == null) {
            return;
        }
        if (!str.isEmpty()) {
            ((sgt) a.c().M(3293)).v("Stopping: %s", str);
        }
        kgs kgsVar = this.n;
        rnt.x(kgsVar);
        kgsVar.a();
        this.n = null;
    }

    public final void f(String str) {
        this.d.execute(new kee(this, str, 2));
    }

    public final void d() {
        f(pAAtrB.CYRzgLfPgM);
    }
}
