package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class slw extends sma {
    final char[] a;

    public slw(slv slvVar) {
        super(slvVar, null);
        this.a = new char[512];
        a.I(slvVar.b.length == 16);
        for (int i = 0; i < 256; i++) {
            this.a[i] = slvVar.a(i >>> 4);
            this.a[i | 256] = slvVar.a(i & 15);
        }
    }

    @Override // defpackage.sma, defpackage.smb
    public final int a(byte[] bArr, CharSequence charSequence) throws sly {
        if (charSequence.length() % 2 == 1) {
            throw new sly("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            slv slvVar = this.b;
            bArr[i2] = (byte) (slvVar.b(charSequence.charAt(i + 1)) | (slvVar.b(charSequence.charAt(i)) << 4));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.sma, defpackage.smb
    public final void b(Appendable appendable, byte[] bArr, int i) throws IOException {
        rnt.K(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.a;
            appendable.append(cArr[i3]);
            appendable.append(cArr[i3 | 256]);
        }
    }
}
