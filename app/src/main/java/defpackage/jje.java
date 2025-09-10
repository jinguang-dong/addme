package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jje {
    public static final Charset a = Charset.forName("UTF-8");
    private static jje d;
    public final MessageDigest b;
    public final Object c = new Object();

    public jje(MessageDigest messageDigest) {
        this.b = messageDigest;
    }

    public static jje a() {
        if (d == null) {
            try {
                d = new jje(MessageDigest.getInstance("SHA-1"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("Cannot initialize file name hasher", e);
            }
        }
        return d;
    }
}
