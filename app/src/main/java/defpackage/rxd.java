package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rxd extends RuntimeException {
    public rxd() {
    }

    public rxd(String str) {
        super(str);
    }

    public rxd(Throwable th, byte[] bArr) {
        super("Initialize library failed.", th);
    }

    public rxd(Throwable th) {
        super(th);
    }
}
