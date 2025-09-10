package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rct extends RuntimeException {
    public rct() {
    }

    public rct(byte[] bArr) {
        super("The caller is trying to acquire a lease on too much data.");
    }

    public rct(Throwable th) {
        super(th);
    }
}
