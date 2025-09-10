package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ngr implements jhh, jhf {
    public final ovx a = new ovx(Boolean.FALSE);
    public final ovx b = new ovx(Float.valueOf(0.0f));
    public long c = 0;
    public long d = 225;

    public final void a() {
        rnt.L(this.c <= this.d);
        float f = this.d >= 225 + this.c ? 1.0f : (r3 - r5) / 225.0f;
        this.b.a(Float.valueOf(f));
        this.a.a(Boolean.valueOf(f < 1.0f));
    }

    @Override // defpackage.jhf
    public final void ej() {
        this.c = 0L;
        this.d = 0L;
        a();
    }
}
