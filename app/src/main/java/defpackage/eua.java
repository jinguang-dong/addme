package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eua implements fbc {
    public final MessageDigest a;
    private final fbf b = new fbf();

    public eua(MessageDigest messageDigest) {
        this.a = messageDigest;
    }

    @Override // defpackage.fbc
    public final fbf dF() {
        return this.b;
    }
}
