package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sln extends slc {
    private final MessageDigest b;
    private final int c;
    private boolean d;

    public sln(MessageDigest messageDigest, int i) {
        this.b = messageDigest;
        this.c = i;
    }

    private final void g() {
        rnt.M(!this.d, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // defpackage.slc
    protected final void c(byte[] bArr, int i) {
        g();
        this.b.update(bArr, 0, i);
    }

    @Override // defpackage.slk
    public final sli m() {
        g();
        this.d = true;
        int i = this.c;
        MessageDigest messageDigest = this.b;
        if (i == messageDigest.getDigestLength()) {
            byte[] bArrDigest = messageDigest.digest();
            int i2 = sli.b;
            return new slg(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(messageDigest.digest(), i);
        int i3 = sli.b;
        return new slg(bArrCopyOf);
    }
}
