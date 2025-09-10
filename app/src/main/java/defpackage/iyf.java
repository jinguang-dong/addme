package defpackage;

import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import j$.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyf implements fre {
    public final syu a;
    private final uem b;
    private final uem c;
    private final uem d;
    private final uem e;
    private final uem f;
    private final tzj g;
    private final out h;
    private final Executor i;
    private final AtomicBoolean j = new AtomicBoolean(false);
    private final pbn k;
    private final pbc l;
    private final moc m;
    private final uem n;
    private final szh o;
    private syu p;
    private final pfl q;
    private final pfl r;

    @Override // defpackage.fre
    public final /* synthetic */ int a() {
        return 0;
    }

    @Override // defpackage.fre
    public final syu b() {
        if (this.j.getAndSet(true)) {
            return this.p;
        }
        out outVar = this.h;
        tzj tzjVar = this.g;
        tzjVar.getClass();
        outVar.execute(new hjp(tzjVar, 16));
        this.o.e((ngk) this.n.a());
        this.m.c();
        iyd iydVar = new iyd(this, 0);
        frd frdVar = new frd(this.i);
        frdVar.d = this.q;
        pbn pbnVar = this.k;
        frdVar.b = pbnVar;
        frdVar.c = this.l;
        int i = 3;
        frdVar.b(new iyd(this.b, i), "ActivityStartup");
        frdVar.c(new iyd(this.d, 2), "WiringStartup");
        frdVar.b(new iyd(this.c, i), "CameraActivityController");
        frdVar.b(iydVar, "Interactivity");
        final pfl pflVar = this.r;
        final uem uemVar = this.e;
        frdVar.c(new uem() { // from class: iyh
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tzj] */
            @Override // defpackage.uem, defpackage.uel
            public final Object a() {
                return (Set) Collection.EL.stream(((tzz) uemVar).a()).map(new idh((fto) pflVar.a.a(), 7)).collect(ryv.b);
            }
        }, "ShotStartup");
        final uem uemVar2 = this.f;
        frdVar.c(new uem() { // from class: iyh
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tzj] */
            @Override // defpackage.uem, defpackage.uel
            public final Object a() {
                return (Set) Collection.EL.stream(((tzz) uemVar2).a()).map(new idh((fto) pflVar.a.a(), 7)).collect(ryv.b);
            }
        }, "SmartsStartup");
        this.p = frdVar.a();
        pbnVar.i();
        return this.p;
    }

    @Override // defpackage.fre
    public final /* synthetic */ String c() {
        return gsn.Z(this);
    }

    public iyf(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, tzj tzjVar, out outVar, Executor executor, syu syuVar, pbb pbbVar, pfl pflVar, pfl pflVar2, pbn pbnVar, moc mocVar, uem uemVar6, szh szhVar) {
        this.b = uemVar;
        this.c = uemVar2;
        this.g = tzjVar;
        this.h = outVar;
        this.i = executor;
        this.a = syuVar;
        this.q = pflVar;
        this.r = pflVar2;
        this.k = pbnVar;
        this.m = mocVar;
        this.d = uemVar3;
        this.e = uemVar4;
        this.f = uemVar5;
        this.n = uemVar6;
        this.o = szhVar;
        this.l = pbbVar.a(SHXc.Gzofuf);
    }
}
