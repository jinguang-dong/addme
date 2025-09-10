package defpackage;

import java.math.RoundingMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slz extends smb {
    private final smb a;
    private final String b = ":";

    public slz(smb smbVar) {
        this.a = smbVar;
        rnt.D(true, "Cannot add a separator after every %s chars", 2);
    }

    @Override // defpackage.smb
    public final int a(byte[] bArr, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (this.b.indexOf(cCharAt) < 0) {
                sb.append(cCharAt);
            }
        }
        return this.a.a(bArr, sb);
    }

    @Override // defpackage.smb
    public final void b(Appendable appendable, byte[] bArr, int i) {
        a.I(true);
        this.a.b(new slu(appendable), bArr, i);
    }

    @Override // defpackage.smb
    public final int c(int i) {
        return this.a.c(i);
    }

    @Override // defpackage.smb
    public final int d(int i) {
        int iD = this.a.d(i);
        return iD + (this.b.length() * ske.aq(Math.max(0, iD - 1), 2, RoundingMode.FLOOR));
    }

    @Override // defpackage.smb
    public final CharSequence e(CharSequence charSequence) {
        return this.a.e(charSequence);
    }

    public final String toString() {
        return this.a.toString() + ".withSeparator(\"" + this.b + "\", 2)";
    }
}
