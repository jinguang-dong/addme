package defpackage;

import com.google.googlex.gcam.Gcam;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ivu {
    public static final sgv a = sgv.g("ivu");
    public final ivt b;
    public final ivx c;
    public final ovx d;
    public final pbn e;
    public final iwg f;
    public final float g;
    public final int h;
    private final Map l;
    private final owf m;
    private final Gcam n;
    private final Executor o;
    private final our p;
    private final owf q;
    private final jod s;
    public final Map i = new HashMap();
    private final AtomicBoolean r = new AtomicBoolean(false);
    public final AtomicReference j = new AtomicReference("");
    public final AtomicInteger k = new AtomicInteger(-1);

    public ivu(ivt ivtVar, ivx ivxVar, Executor executor, ovx ovxVar, Map map, owf owfVar, jod jodVar, Gcam gcam, pbn pbnVar, hbj hbjVar, iwg iwgVar, luj lujVar, our ourVar) {
        this.b = ivtVar;
        this.c = ivxVar;
        this.o = executor;
        this.d = ovxVar;
        this.l = map;
        this.m = owfVar;
        this.s = jodVar;
        this.n = gcam;
        this.e = pbnVar;
        this.f = iwgVar;
        this.p = ourVar;
        this.q = owl.h(lujVar.a(luf.aL), new fym(hbjVar, 16));
        this.g = ((Integer) hbjVar.a(hab.b).orElse(7)).intValue();
        this.h = ((Integer) hbjVar.a(hab.c).orElse(16)).intValue();
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [hzs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, pjp] */
    public final void a() {
        if (this.r.getAndSet(true)) {
            return;
        }
        for (Map.Entry entry : this.l.entrySet()) {
            if (lcz.A.contains((lcz) entry.getKey())) {
                pjr pjrVar = (pjr) entry.getValue();
                try {
                    jod jodVar = this.s;
                    this.i.put(pjrVar.a, this.n.b(jodVar.b.b(tgq.s(jodVar.a.a(pjrVar)))));
                } catch (IllegalStateException unused) {
                    ((sgt) a.c().M(2405)).v("Invalid camera ID: %s.", pjrVar);
                }
            }
        }
        this.p.d(owb.a(owl.a(this.q, this.m)).dK(new ijl(this, 15), this.o));
    }
}
