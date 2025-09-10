package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class dcv {
    private final dco a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final ues c = new uez(new ats(this, 14));

    public dcv(dco dcoVar) {
        this.a = dcoVar;
    }

    private final dfq a() {
        return (dfq) this.c.a();
    }

    protected abstract String c();

    public final dfq d() {
        this.a.j();
        return this.b.compareAndSet(false, true) ? a() : e();
    }

    public final dfq e() {
        dco dcoVar = this.a;
        dcoVar.j();
        dcoVar.k();
        return dcoVar.e().b().k(c());
    }

    public final void f(dfq dfqVar) {
        dfqVar.getClass();
        if (dfqVar == a()) {
            this.b.set(false);
        }
    }
}
