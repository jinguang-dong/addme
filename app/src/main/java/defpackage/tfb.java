package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfb {
    public byte a;
    private tfc b;
    private float c;

    public final tfd a() {
        tfc tfcVar;
        if (this.a != 3 || (tfcVar = this.b) == null) {
            throw new IllegalStateException();
        }
        return new tfd(tfcVar, this.c);
    }

    public final void b(tfc tfcVar) {
        tfcVar.getClass();
        this.b = tfcVar;
    }

    public final void c(float f) {
        this.c = f;
        this.a = (byte) (this.a | 1);
    }
}
