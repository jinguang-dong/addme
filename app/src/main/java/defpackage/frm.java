package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class frm {
    public final szh a;
    private long b;

    public frm(int i) {
        a.I(true);
        this.a = new szh();
        this.b = i;
    }

    public final synchronized void a() {
        long j = this.b - 1;
        this.b = j;
        if (j <= 0) {
            this.a.e(null);
        }
    }
}
