package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uvp extends una implements unk {
    public final una a;
    public final ulz b;
    public final Object c;
    private final /* synthetic */ unk d;
    private final int e;
    private final ocq f;

    /* JADX WARN: Multi-variable type inference failed */
    public uvp(una unaVar, int i) {
        unk unkVar = unaVar instanceof unk ? (unk) unaVar : null;
        this.d = unkVar == null ? uni.a : unkVar;
        this.a = unaVar;
        this.e = i;
        this.b = new ulz(0, umc.a);
        this.f = new ocq((byte[]) null, (byte[]) null);
        this.c = new Object();
    }

    private final boolean i() {
        synchronized (this.c) {
            ulz ulzVar = this.b;
            if (ulzVar.b >= this.e) {
                return false;
            }
            ulzVar.b();
            return true;
        }
    }

    @Override // defpackage.una
    public final void a(uhf uhfVar, Runnable runnable) {
        Runnable runnableE;
        this.f.w(runnable);
        if (this.b.b >= this.e || !i() || (runnableE = e()) == null) {
            return;
        }
        try {
            uvh.b(this.a, this, new uvo(this, runnableE));
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
    }

    @Override // defpackage.unk
    public final void c(long j, umk umkVar) {
        this.d.c(j, umkVar);
    }

    public final Runnable e() {
        while (true) {
            ocq ocqVar = this.f;
            Runnable runnable = (Runnable) ocqVar.u();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.c) {
                ulz ulzVar = this.b;
                ulzVar.a();
                if (ocqVar.t() == 0) {
                    return null;
                }
                ulzVar.b();
            }
        }
    }

    @Override // defpackage.una
    public final void f(uhf uhfVar, Runnable runnable) {
        Runnable runnableE;
        this.f.w(runnable);
        if (this.b.b >= this.e || !i() || (runnableE = e()) == null) {
            return;
        }
        try {
            this.a.f(this, new uvo(this, runnableE));
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
    }

    @Override // defpackage.unk
    public final unt h(long j, Runnable runnable, uhf uhfVar) {
        return this.d.h(j, runnable, uhfVar);
    }

    @Override // defpackage.una
    public final String toString() {
        return this.a + ".limitedParallelism(" + this.e + ")";
    }
}
