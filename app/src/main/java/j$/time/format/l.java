package j$.time.format;

/* loaded from: classes3.dex */
public final class l implements e {
    public final e a;
    public final int b;
    public final char c;

    public l(e eVar, int i, char c) {
        this.a = eVar;
        this.b = i;
        this.c = c;
    }

    @Override // j$.time.format.e
    public final boolean h(u uVar, StringBuilder sb) {
        int length = sb.length();
        if (!this.a.h(uVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.c);
            }
            return true;
        }
        throw new j$.time.b("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    public final String toString() {
        String str;
        String strValueOf = String.valueOf(this.a);
        char c = this.c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + strValueOf + "," + this.b + str;
    }
}
