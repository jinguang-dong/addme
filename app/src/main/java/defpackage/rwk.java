package defpackage;

import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwk {
    public static final SecureRandom a;
    public static final ThreadLocal b;

    static {
        new rwi();
        a = a();
        new rwj();
        b = new rwh();
    }

    public static SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
