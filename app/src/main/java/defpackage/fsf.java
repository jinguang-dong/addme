package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fsf implements paq {
    public final Object a;
    public final paq b;
    public int c;
    public boolean d;

    public fsf(paq paqVar) {
        rnt.M(true, "initialReferenceCount is not greater than 0.");
        this.a = new Object();
        this.b = paqVar;
        this.c = 1;
        this.d = false;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            if (this.d) {
                return;
            }
            int i = this.c - 1;
            this.c = i;
            if (i > 0) {
                return;
            }
            this.d = true;
            this.b.close();
        }
    }
}
