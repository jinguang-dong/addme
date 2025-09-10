package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class cgz {
    public static String a(int i) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int iR = chp.r(i);
        String str = "Invalid";
        sb.append((Object) (a.p(iR, 1) ? "Strategy.Simple" : a.p(iR, 2) ? "Strategy.HighQuality" : a.p(iR, 3) ? "Strategy.Balanced" : a.p(iR, 0) ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int iS = chp.s(i);
        sb.append((Object) (a.p(iS, 1) ? "Strictness.None" : a.p(iS, 2) ? "Strictness.Loose" : a.p(iS, 3) ? "Strictness.Normal" : a.p(iS, 4) ? "Strictness.Strict" : a.p(iS, 0) ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int iT = chp.t(i);
        if (a.p(iT, 1)) {
            str = "WordBreak.None";
        } else if (a.p(iT, 2)) {
            str = "WordBreak.Phrase";
        } else if (a.p(iT, 0)) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
