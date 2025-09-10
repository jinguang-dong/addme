package defpackage;

import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ids implements ibi {
    public static final sgv a = sgv.g("ids");
    public final tzj b;
    public final Executor c;
    public final pbn d;
    public final pas e;
    public final kgw i;
    public final hbj j;
    private final rwc k;
    private final rwc l;
    private final Optional m;
    private final Optional n;
    private final Optional o;
    private final hxv p;
    public final AtomicLong f = new AtomicLong(0);
    public final kjc h = new kjc(1);
    public final Map g = new HashMap();

    public ids(rwc rwcVar, rwc rwcVar2, Optional optional, Optional optional2, Optional optional3, kgw kgwVar, hxv hxvVar, tzj tzjVar, Executor executor, hbj hbjVar, pbn pbnVar, kqp kqpVar) {
        this.k = rwcVar;
        this.l = rwcVar2;
        this.m = optional;
        this.n = optional2;
        this.o = optional3;
        this.i = kgwVar;
        this.p = hxvVar;
        this.b = tzjVar;
        this.c = executor;
        this.j = hbjVar;
        this.d = pbnVar;
        this.e = kqpVar.b;
    }

    @Override // defpackage.klf
    public final kle a(gga ggaVar) {
        throw new IllegalStateException("Method not supported");
    }

    @Override // defpackage.klf
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ibl b(gga ggaVar) {
        throw new IllegalStateException("Method not supported");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lss] */
    @Override // defpackage.ibi
    public final ibl d(gga ggaVar, iea ieaVar) {
        idy idyVar;
        ?? r0 = ggaVar.b;
        hxu hxuVarA = this.p.a();
        String strW = r0.w();
        Map map = this.g;
        idr idrVar = (idr) map.get(strW);
        if (idrVar != null) {
            return idrVar;
        }
        if (ieaVar.a() == idz.DEBLUR) {
            rwc rwcVar = this.k;
            rnt.L(rwcVar.h());
            idyVar = (idy) rwcVar.c();
        } else if (ieaVar.a() == idz.ZOOM) {
            rwc rwcVar2 = this.l;
            rnt.L(rwcVar2.h());
            idyVar = (idy) rwcVar2.c();
        } else if (ieaVar.a() == idz.FOCUS_STACK) {
            idyVar = (idy) this.m.orElseThrow();
        } else if (ieaVar.a() == idz.MULTI_RESOLUTION) {
            idyVar = (idy) this.n.orElseThrow();
        } else {
            if (ieaVar.a() != idz.CENTAUR) {
                throw new IllegalArgumentException("Unsupported fusion mode: " + ieaVar.a().ordinal() + " for session " + String.valueOf(r0.l()));
            }
            idyVar = (idy) this.o.orElseThrow();
        }
        idr idrVar2 = new idr(this, ggaVar, hxuVarA, idyVar, ieaVar);
        map.put(strW, idrVar2);
        return idrVar2;
    }
}
