package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iag extends RuntimeException {
    public iag(String str) {
        super(str);
    }

    public iag(Throwable th) {
        super("Error processing secondary payload.", th);
    }
}
