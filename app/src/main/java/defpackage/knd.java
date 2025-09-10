package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knd {
    public final khb a;
    public final syu b;
    public final pbc c;
    public final owm d;
    public final ovx e = new ovx(false);
    public final AtomicInteger f = new AtomicInteger(0);
    public final fcr g;
    public final pbn h;
    public final pjo i;
    public final luj j;
    public final cxb k;

    public knd(final khb khbVar, syu syuVar, pbb pbbVar, fcr fcrVar, luj lujVar, tzj tzjVar, final boolean z, pbn pbnVar, pjo pjoVar) {
        this.a = khbVar;
        this.c = pbbVar.a("PictureTakerImpl");
        this.g = fcrVar;
        this.b = syuVar;
        this.j = lujVar;
        this.h = pbnVar;
        this.k = new cxb(tzjVar);
        this.i = pjoVar;
        this.d = new owm(new rww() { // from class: kna
            @Override // defpackage.rww
            public final Object fr() {
                knd kndVar = this.a;
                kmz kmzVar = (kmz) ojl.ci(kndVar.b);
                return (khbVar.a() || kndVar.f.get() > 0) ? new owi(false) : kmzVar == null ? new owi(Boolean.valueOf(z)) : kmzVar.a();
            }
        });
        syuVar.c(new iyz(this, 16), sxo.a);
    }
}
