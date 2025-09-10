package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abz implements bbo {
    public ace a;
    public long b;
    public long c;
    public boolean d;
    public final byz e;
    private final azr f;

    public abz(byz byzVar, Object obj, ace aceVar, long j, long j2, boolean z) {
        this.e = byzVar;
        this.f = new azz(obj, bap.c);
        this.a = aceVar != null ? byi.bc(aceVar) : byi.bl(byzVar, obj);
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    @Override // defpackage.bbo
    public final Object a() {
        return this.f.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uiq] */
    public final Object b() {
        return this.e.b.a(this.a);
    }

    public final void c(Object obj) {
        this.f.b(obj);
    }

    public final String toString() {
        return "AnimationState(value=" + a() + ", velocity=" + b() + ", isRunning=" + this.d + ", lastFrameTimeNanos=" + this.b + ", finishedTimeNanos=" + this.c + ')';
    }

    public /* synthetic */ abz(byz byzVar, Object obj, ace aceVar, int i) {
        this(byzVar, obj, (i & 4) != 0 ? null : aceVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
