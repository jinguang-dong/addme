package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pew extends ojl {
    public final ojl a;
    private final Executor b;

    public pew(ojl ojlVar, Executor executor) {
        super((short[]) null);
        this.b = executor;
        this.a = ojlVar;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        this.b.execute(new ovw(this, poeVar, 8));
    }

    @Override // defpackage.ojl
    public final void dH(piw piwVar) {
        this.b.execute(new pev(this, piwVar, 0));
    }

    @Override // defpackage.ojl
    public final void dT(pnx pnxVar) {
        this.b.execute(new ovw(this, pnxVar, 10));
    }

    @Override // defpackage.ojl
    public final void dV(Set set) {
        this.b.execute(new ovw(this, set, 9));
    }

    @Override // defpackage.ojl
    public final void dW() {
        this.b.execute(new mvn(this, 18));
    }

    @Override // defpackage.ojl
    public final void l(pdo pdoVar) {
        this.b.execute(new ovw(this, pdoVar, 7, null));
    }

    @Override // defpackage.ojl
    public final void m(final long j) {
        this.b.execute(new Runnable() { // from class: peu
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.m(j);
            }
        });
    }

    @Override // defpackage.ojl
    public final void n() {
        this.b.execute(new mvn(this, 19));
    }
}
