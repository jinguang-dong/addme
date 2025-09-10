package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class slp extends sld implements Serializable {
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d;

    public slp(String str, int i) {
        this.d = "Hashing.sha256()";
        MessageDigest messageDigestF = f(str);
        this.a = messageDigestF;
        int digestLength = messageDigestF.getDigestLength();
        boolean z = false;
        if (i >= 4 && i <= digestLength) {
            z = true;
        }
        rnt.G(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.b = i;
        this.c = g(messageDigestF);
    }

    private static MessageDigest f(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static boolean g(MessageDigest messageDigest) throws CloneNotSupportedException {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.slj
    public final slk e() {
        if (this.c) {
            try {
                return new sln((MessageDigest) this.a.clone(), this.b);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new sln(f(this.a.getAlgorithm()), this.b);
    }

    public final String toString() {
        return this.d;
    }

    Object writeReplace() {
        return new slo(this.a.getAlgorithm(), this.b);
    }

    public slp() {
        MessageDigest messageDigestF = f("SHA-256");
        this.a = messageDigestF;
        this.b = messageDigestF.getDigestLength();
        this.d = "Hashing.sha256()";
        this.c = g(messageDigestF);
    }
}
