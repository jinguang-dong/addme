package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvu implements fda {
    final /* synthetic */ szh a;
    final /* synthetic */ szh b;
    final /* synthetic */ szh c;
    public final /* synthetic */ kvv d;
    private final AtomicBoolean e = new AtomicBoolean(false);

    public kvu(kvv kvvVar, szh szhVar, szh szhVar2, szh szhVar3) {
        this.a = szhVar;
        this.b = szhVar2;
        this.c = szhVar3;
        this.d = kvvVar;
    }

    @Override // defpackage.fda
    public final syu a() {
        return this.c;
    }

    @Override // defpackage.fda
    public final syu b() {
        return this.a;
    }

    @Override // defpackage.fda
    public final syu c() {
        return this.b;
    }

    @Override // defpackage.fda
    public final void d() {
        AtomicBoolean atomicBoolean = this.e;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        kvv kvvVar = this.d;
        ((Executor) kvvVar.c.c()).execute(new krc(this, 15));
        paq paqVar = kvvVar.j;
        paq paqVar2 = kvvVar.k;
        if (paqVar != null) {
            paqVar.close();
        }
        if (paqVar2 != null) {
            paqVar2.close();
        }
        synchronized (kvvVar.f) {
            if (kvvVar.e != null) {
                kvvVar.e.cancel(false);
            }
        }
        this.d.c();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, owq] */
    @Override // defpackage.fda
    public final void e() {
        if (this.e.get()) {
            return;
        }
        kvv kvvVar = this.d;
        kvvVar.s.d.a(true);
        ((Executor) kvvVar.c.c()).execute(new krc(this, 16));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, owq] */
    @Override // defpackage.fda
    public final void f() {
        if (this.e.get()) {
            return;
        }
        kvv kvvVar = this.d;
        kvvVar.s.d.a(true);
        kvvVar.t.a.a(true);
        ((Executor) kvvVar.c.c()).execute(new krc(this, 18));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, owq] */
    @Override // defpackage.fda
    public final void g() {
        if (this.e.get()) {
            return;
        }
        kvv kvvVar = this.d;
        kvvVar.t.a.a(true);
        ((Executor) kvvVar.c.c()).execute(new krc(this, 20));
    }

    @Override // defpackage.fda
    public final void h() {
        if (this.e.get()) {
            return;
        }
        kvv kvvVar = this.d;
        kvvVar.l.f();
        kvvVar.s.f();
        kvvVar.i(true, false, true);
    }

    @Override // defpackage.fda
    public final void i() {
        if (this.e.get()) {
            return;
        }
        kvv kvvVar = this.d;
        ((Executor) kvvVar.c.c()).execute(new krc(this, 17));
        kvvVar.l.f();
        kvvVar.c();
        kvvVar.s.f();
        kvvVar.i(true, true, true);
    }

    @Override // defpackage.fda
    public final void j() {
        if (this.e.get()) {
            return;
        }
        kvv kvvVar = this.d;
        ((Executor) kvvVar.c.c()).execute(new krc(this, 19));
        kvvVar.c();
        kvvVar.i(true, true, false);
    }
}
