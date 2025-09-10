package defpackage;

import j$.util.Objects;
import java.math.RoundingMode;

/* compiled from: PG */
/* loaded from: classes.dex */
public class sma extends smb {
    public final slv b;
    public final Character c;
    public volatile smb d;
    public volatile smb e;

    public sma(slv slvVar, Character ch) {
        this.b = slvVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            if (slvVar.g('=')) {
                z = false;
            }
        }
        rnt.F(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    @Override // defpackage.smb
    public int a(byte[] bArr, CharSequence charSequence) throws sly {
        int i;
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        slv slvVar = this.b;
        if (!slvVar.f(length)) {
            throw new sly("Invalid input length " + charSequenceE.length());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequenceE.length()) {
            long jB = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = slvVar.e;
                if (i4 >= i) {
                    break;
                }
                jB <<= slvVar.d;
                if (i2 + i4 < charSequenceE.length()) {
                    jB |= slvVar.b(charSequenceE.charAt(i5 + i2));
                    i5++;
                }
                i4++;
            }
            int i6 = slvVar.f;
            int i7 = i5 * slvVar.d;
            int i8 = (i6 - 1) * 8;
            while (i8 >= (i6 * 8) - i7) {
                bArr[i3] = (byte) ((jB >>> i8) & 255);
                i8 -= 8;
                i3++;
            }
            i2 += i;
        }
        return i3;
    }

    @Override // defpackage.smb
    public void b(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        rnt.K(0, i, bArr.length);
        while (i2 < i) {
            int i3 = this.b.f;
            f(appendable, bArr, i2, Math.min(i3, i - i2));
            i2 += i3;
        }
    }

    @Override // defpackage.smb
    public final int c(int i) {
        return (int) (((this.b.d * i) + 7) / 8);
    }

    @Override // defpackage.smb
    public final int d(int i) {
        slv slvVar = this.b;
        return slvVar.e * ske.aq(i, slvVar.f, RoundingMode.CEILING);
    }

    @Override // defpackage.smb
    public final CharSequence e(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.c;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sma) {
            sma smaVar = (sma) obj;
            if (this.b.equals(smaVar.b) && Objects.equals(this.c, smaVar.c)) {
                return true;
            }
        }
        return false;
    }

    final void f(Appendable appendable, byte[] bArr, int i, int i2) {
        rnt.K(i, i + i2, bArr.length);
        slv slvVar = this.b;
        int i3 = slvVar.f;
        int i4 = 0;
        a.I(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | (bArr[i + i5] & 255)) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = slvVar.d;
        while (i4 < i2 * 8) {
            appendable.append(slvVar.a(slvVar.c & ((int) (j >>> ((i6 - i7) - i4)))));
            i4 += i7;
        }
        Character ch = this.c;
        if (ch != null) {
            while (i4 < i3 * 8) {
                ch.charValue();
                appendable.append('=');
                i4 += i7;
            }
        }
    }

    public final int hashCode() {
        return this.b.hashCode() ^ Objects.hashCode(this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        slv slvVar = this.b;
        sb.append(slvVar);
        if (8 % slvVar.d != 0) {
            Character ch = this.c;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public sma(String str, String str2, Character ch) {
        this(new slv(str, str2.toCharArray()), ch);
    }
}
