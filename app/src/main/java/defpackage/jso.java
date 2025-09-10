package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jso implements jsq {
    private final jrg a;
    private volatile float b = Float.MAX_VALUE;
    private volatile float c = 0.78f;
    private final pas d;

    public jso(jrg jrgVar, pas pasVar) {
        this.a = jrgVar;
        this.d = pasVar;
    }

    @Override // defpackage.jsq
    public final jsl a() {
        return jsl.ADAPTIVE_DISTANCE;
    }

    @Override // defpackage.jsq
    public final boolean b(lnl lnlVar, lnl lnlVar2) {
        float fA = this.a.a(lnlVar, lnlVar2) / this.d.b;
        long jAbs = Math.abs(lnlVar2.c - lnlVar.c);
        if (jAbs <= 200000000) {
            this.b = Math.min(this.b, (float) ((fA * 1.0E9d) / jAbs));
            float f = this.b;
            this.c = f > 1.3f ? 0.0f : f < 0.2f ? 0.052f : f > 0.26f ? 0.78f : (((f - 0.2f) * 0.728f) / 0.059999987f) + 0.052f;
        }
        return fA > this.c;
    }
}
