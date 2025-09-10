package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xl implements xm {
    public static final xl a = new xl();

    private xl() {
    }

    @Override // defpackage.xm
    public final /* bridge */ /* synthetic */ void a(Object obj) throws Exception {
        AutoCloseable autoCloseable = (AutoCloseable) obj;
        if (autoCloseable != null) {
            autoCloseable.close();
        }
    }
}
