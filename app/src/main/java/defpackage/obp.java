package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obp {
    final /* synthetic */ obq a;
    private final String b;

    public obp(obq obqVar, long j) {
        this.a = obqVar;
        ojl.aw("monitoring");
        a.I(j > 0);
        this.b = "monitoring";
    }

    public final String a() {
        return this.b.concat(":count");
    }

    public final String b() {
        return this.b.concat(":start");
    }

    protected final String c() {
        return this.b.concat(":value");
    }
}
