package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qe extends qj {
    public final int a;
    public final boolean b;

    public qe(int i, boolean z) {
        super("GRAPH_ERROR");
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.qj
    public final String toString() {
        return this.c + "(cameraError=" + ((Object) pk.a(this.a)) + ", willAttemptRetry=" + this.b + ')';
    }
}
