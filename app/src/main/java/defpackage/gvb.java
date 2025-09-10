package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvb {
    private final gva a;
    private final gva b;
    private final long c;
    private rwc d = rvk.a;
    private boolean e = false;

    public gvb(gva gvaVar, gva gvaVar2, long j) {
        this.a = gvaVar;
        this.b = gvaVar2;
        this.c = j;
    }

    public final synchronized void a() {
        this.e = false;
        this.d = rvk.a;
    }

    public final synchronized void b(long j) {
        boolean z = false;
        if (this.b.a()) {
            this.d = rvk.a;
            this.e = false;
            return;
        }
        gva gvaVar = this.a;
        if (!gvaVar.a() && this.d.h() && !this.e) {
            this.d = rvk.a;
            return;
        }
        if (gvaVar.a() && !this.d.h()) {
            this.d = rwc.j(Long.valueOf(j));
            return;
        }
        if (this.d.h() && j - ((Long) this.d.c()).longValue() > this.c) {
            z = true;
        }
        this.e = z;
    }

    public final synchronized boolean c() {
        return this.e;
    }
}
