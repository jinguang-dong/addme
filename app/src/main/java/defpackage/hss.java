package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hss extends Throwable {
    private final String a;

    public hss(String str) {
        super(str, null);
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
