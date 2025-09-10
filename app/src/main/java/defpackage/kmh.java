package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmh implements kml {
    public final kfl a;
    public final out b;
    public final lss d;
    private kmk f;
    private final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(true);

    public kmh(kfl kflVar, out outVar, lss lssVar) {
        this.a = kflVar;
        this.b = outVar;
        this.d = lssVar;
    }

    @Override // defpackage.kml
    public final kmk a() {
        rnt.L(!this.e.getAndSet(true));
        kmf kmfVar = new kmf(this, 1);
        this.f = kmfVar;
        return kmfVar;
    }

    @Override // defpackage.kml
    public final kmk b() {
        rnt.L(!this.e.getAndSet(true));
        kmf kmfVar = new kmf(this, 0);
        this.f = kmfVar;
        return kmfVar;
    }

    @Override // defpackage.kml
    public final kmk c() {
        rnt.L(!this.e.getAndSet(true));
        kmg kmgVar = new kmg(this);
        this.f = kmgVar;
        return kmgVar;
    }

    @Override // defpackage.kml
    public final kmk d() {
        return this.f;
    }

    @Override // defpackage.kml
    public final kmk e() {
        kmk kmkVar = this.f;
        return kmkVar != null ? kmkVar : c();
    }

    @Override // defpackage.kml
    public final void f() {
        this.b.execute(new kdx(this, 9));
    }

    public final void g() {
        this.d.C();
        this.a.a.d();
    }

    @Override // defpackage.kml
    public final void h() {
        this.e.set(false);
    }
}
