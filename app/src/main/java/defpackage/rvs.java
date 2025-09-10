package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rvs implements rwe {
    protected rvs() {
    }

    public static String c(char c) {
        char[] cArr = new char[6];
        int i = 0;
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i2 = c;
        while (i < 4) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(i2 & 15);
            i++;
            i2 >>= 4;
        }
        return String.copyValueOf(cArr);
    }

    public static void d(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            if (length == 1) {
                charSequence.charAt(0);
            } else if (length != 2) {
                new rvm(charSequence);
            } else {
                charSequence.charAt(0);
                charSequence.charAt(1);
            }
        }
    }

    @Override // defpackage.rwe
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c);
}
