package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxb implements let {
    private final kzl a;
    private final let b;

    public kxb(qqq qqqVar, uh uhVar, our ourVar, owf owfVar, Map map, long j, int i, rww rwwVar) {
        kzl kzlVarB = qqqVar.B(owfVar, map, i);
        ourVar.d(kzlVarB);
        this.a = kzlVarB;
        this.b = uhVar.m(j, kzlVarB, rwwVar, 2);
    }

    @Override // defpackage.let
    public final les a() {
        kzl kzlVar = this.a;
        ReentrantReadWriteLock reentrantReadWriteLock = kzlVar.b;
        reentrantReadWriteLock.getReadLockCount();
        reentrantReadWriteLock.isWriteLocked();
        final paq paqVarR = kzlVar.r(reentrantReadWriteLock.readLock());
        return new les() { // from class: kxa
            @Override // defpackage.les
            public final void a() {
                paqVarR.close();
            }
        };
    }

    @Override // defpackage.let
    public final pdk b(long j) {
        return this.b.b(j);
    }

    @Override // defpackage.let
    public final pdk c() {
        return this.b.c();
    }

    @Override // defpackage.let
    public final pdk d() {
        return this.b.d();
    }

    @Override // defpackage.let
    public final pdk e() {
        return this.b.e();
    }

    @Override // defpackage.let
    public final pdn f() {
        return ((kxg) this.b).c;
    }

    @Override // defpackage.let
    public final pdv g() {
        return this.b.g();
    }

    @Override // defpackage.let
    public final sbp h(List list) {
        return this.b.h(list);
    }

    @Override // defpackage.let
    public final sbp i(List list) {
        return this.b.i(list);
    }

    @Override // defpackage.let
    public final List j() {
        return this.b.j();
    }

    @Override // defpackage.let
    public final List k() {
        return ((kxg) this.b).o();
    }

    @Override // defpackage.let
    public final List l() {
        return this.b.l();
    }

    @Override // defpackage.let
    public final void m(String str) {
        this.b.m(str);
    }

    @Override // defpackage.let
    public final void n(int i) {
        this.b.n(i);
    }
}
