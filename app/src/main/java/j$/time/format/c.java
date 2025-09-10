package j$.time.format;

/* loaded from: classes3.dex */
public final class c implements e {
    public final char a;

    public c(char c) {
        this.a = c;
    }

    @Override // j$.time.format.e
    public final boolean h(u uVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    public final String toString() {
        char c = this.a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
