package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dwl extends cpn {
    private final Throwable a;

    public dwl(Throwable th) {
        super(null);
        this.a = th;
    }

    public final String toString() {
        return "FAILURE (" + this.a.getMessage() + ")";
    }
}
