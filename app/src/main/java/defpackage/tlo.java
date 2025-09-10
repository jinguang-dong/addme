package defpackage;

import java.util.Locale;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tlo extends tiv {
    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) {
        if (tmlVar.t() == 9) {
            tmlVar.p();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(tmlVar.j(), "_");
        String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
    }
}
