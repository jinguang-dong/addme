package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class edy {
    public static final gga a = new gga();
    private static edx b = null;

    public static synchronized void a() {
        if (b == null) {
            try {
                b = new edx();
            } catch (Throwable th) {
                System.out.println(th);
            }
        }
    }
}
