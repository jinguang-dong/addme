package defpackage;

import com.google.android.apps.camera.backup.cNHl.ibINv;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class slx extends sma {
    public slx(String str, String str2, Character ch) {
        slv slvVar = new slv(str, str2.toCharArray());
        super(slvVar, ch);
        a.I(slvVar.b.length == 64);
    }

    @Override // defpackage.sma, defpackage.smb
    public final void b(Appendable appendable, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        rnt.K(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = bArr[i2] & 255;
            int i5 = bArr[i2 + 1] & 255;
            int i6 = bArr[i2 + 2] & 255;
            slv slvVar = this.b;
            int i7 = (i5 << 8) | (i4 << 16) | i6;
            appendable.append(slvVar.a(i7 >>> 18));
            appendable.append(slvVar.a((i7 >>> 12) & 63));
            appendable.append(slvVar.a((i7 >>> 6) & 63));
            appendable.append(slvVar.a(i7 & 63));
            i2 += 3;
        }
        if (i2 < i) {
            f(appendable, bArr, i2, i - i2);
        }
    }

    @Override // defpackage.sma, defpackage.smb
    public final int a(byte[] bArr, CharSequence charSequence) throws sly {
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        slv slvVar = this.b;
        if (slvVar.f(length)) {
            int i = 0;
            int i2 = 0;
            while (i < charSequenceE.length()) {
                int i3 = i2 + 1;
                int iB = (slvVar.b(charSequenceE.charAt(i + 1)) << 12) | (slvVar.b(charSequenceE.charAt(i)) << 18);
                bArr[i2] = (byte) (iB >>> 16);
                int i4 = i + 2;
                if (i4 < charSequenceE.length()) {
                    int i5 = i + 3;
                    int iB2 = iB | (slvVar.b(charSequenceE.charAt(i4)) << 6);
                    int i6 = i2 + 2;
                    bArr[i3] = (byte) ((iB2 >>> 8) & 255);
                    if (i5 < charSequenceE.length()) {
                        i += 4;
                        i2 += 3;
                        bArr[i6] = (byte) ((iB2 | slvVar.b(charSequenceE.charAt(i5))) & 255);
                    } else {
                        i2 = i6;
                        i = i5;
                    }
                } else {
                    i = i4;
                    i2 = i3;
                }
            }
            return i2;
        }
        throw new sly(ibINv.XhHw + charSequenceE.length());
    }
}
