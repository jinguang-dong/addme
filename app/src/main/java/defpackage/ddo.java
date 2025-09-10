package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddo implements AutoCloseable {
    public final dfa a;

    public ddo(dfa dfaVar) {
        this.a = dfaVar;
    }

    public final ddw a(String str) {
        String string = ujp.n(str).toString();
        int length = string.length();
        dfa dfaVar = this.a;
        if (length >= 3) {
            String strSubstring = string.substring(0, 3);
            strSubstring.getClass();
            String upperCase = strSubstring.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int iHashCode = upperCase.hashCode();
            if (iHashCode == 79487 ? upperCase.equals("PRA") : !(iHashCode == 81978 ? !upperCase.equals("SEL") : !(iHashCode == 85954 && upperCase.equals("WIT")))) {
                return new ddu(dfaVar, str);
            }
        }
        return new ddv(dfaVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
