package defpackage;

import android.net.Uri;
import java.util.concurrent.locks.ReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
class pqg extends pqd implements ppw {
    public pqg(prh prhVar, ppw ppwVar) {
        super(prhVar, ppwVar);
    }

    @Override // defpackage.ppv
    public final long a() {
        return l().a();
    }

    @Override // defpackage.ppv
    public final boolean e() {
        return l().e();
    }

    @Override // defpackage.ppv
    public final boolean f() {
        return l().f();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ppv, ppw] */
    @Override // defpackage.ppw
    public final Uri h() {
        return l().h();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ppv, ppw] */
    @Override // defpackage.ppw
    public final pqe i() {
        return l().i();
    }

    @Override // defpackage.ppw
    public final void j() throws InterruptedException {
        ReadWriteLock readWriteLock = this.c;
        readWriteLock.writeLock().lockInterruptibly();
        readWriteLock.writeLock().unlock();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ppv, ppw] */
    @Override // defpackage.ppw
    public final boolean k() {
        return l().k();
    }

    @Override // defpackage.pqd
    public final String toString() {
        return l().toString();
    }
}
