package defpackage;

import com.pairip.VMRunner;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kbb implements kbr {
    public static final sgv a = sgv.g("kbb");
    public final rwc b;
    public final boolean c;
    public final pbn d;
    public final Executor e;
    private final rwc f;
    private final sbv g;
    private final lat h;
    private final pfu i;
    private final kgw j;
    private final pgx k;

    public kbb(rwc rwcVar, rwc rwcVar2, pfu pfuVar, kgw kgwVar, lat latVar, sbv sbvVar, pgx pgxVar, hbj hbjVar, pbn pbnVar, Executor executor) {
        this.b = rwcVar;
        this.f = rwcVar2.h() ? (rwc) rwcVar2.c() : rvk.a;
        this.i = pfuVar;
        this.j = kgwVar;
        this.h = latVar;
        this.g = sbvVar;
        this.k = pgxVar;
        this.c = hbjVar.p(haa.z);
        gzi gziVar = gzq.a;
        this.d = pbnVar;
        this.e = executor;
    }

    @Override // defpackage.kbr
    public final int a() {
        return 1;
    }

    @Override // defpackage.kbr
    public void b(pdk pdkVar, kfl kflVar, int i, kbz kbzVar, kbq kbqVar) {
        VMRunner.invoke("Ep81OyPsQFNUSIDY", new Object[]{this, pdkVar, kflVar, Integer.valueOf(i), kbzVar, kbqVar});
    }

    @Override // defpackage.kbr
    public boolean c(pdk pdkVar, lat latVar) {
        return ((Boolean) VMRunner.invoke("yQGf4lWgjqKKCEEc", new Object[]{this, pdkVar, latVar})).booleanValue();
    }
}
