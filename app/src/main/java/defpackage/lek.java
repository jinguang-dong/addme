package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lek {
    private boolean a;
    private float b;
    private byte c;

    public lek() {
    }

    public final lel a() {
        if (this.c == 3) {
            return new lel(this.a, this.b);
        }
        throw new IllegalStateException();
    }

    public final void b(float f) {
        this.b = f;
        this.c = (byte) (this.c | 2);
    }

    public final void c(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 1);
    }

    public lek(lel lelVar) {
        this.a = lelVar.a;
        this.b = lelVar.b;
        this.c = (byte) 3;
    }
}
