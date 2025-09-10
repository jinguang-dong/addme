package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class sle implements slk {
    public void a(char c) {
        throw null;
    }

    @Override // defpackage.slk
    public void d(byte[] bArr, int i) {
        throw null;
    }

    @Override // defpackage.slk
    public final void e(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            a(charSequence.charAt(i));
        }
    }

    @Override // defpackage.slk
    public final void f(byte[] bArr) {
        d(bArr, bArr.length);
    }
}
