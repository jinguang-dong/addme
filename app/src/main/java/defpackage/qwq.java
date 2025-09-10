package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwq {
    private static final rwr d = rwr.b('/').a();
    public static final qwp a = new qwo(1);
    public static final qwp b = new qwo(0);
    public static final qwp c = new qwo(2);

    public static List a(String str) {
        return ujp.aG(d.f(str), new qpl(8));
    }

    public static void b(qwp qwpVar, tqq tqqVar) {
        String strA = qwpVar.a(tqqVar);
        String strB = qwpVar.b(tqqVar);
        if (!strA.isEmpty() || strB.isEmpty()) {
            qwpVar.c(tqqVar, null);
        } else {
            qwpVar.c(tqqVar, taa.a(strB));
        }
        qwpVar.d(tqqVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01d3, code lost:
    
        if (java.util.regex.Pattern.matches(".*unmatched serializable field(s) declared", r0) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
    
        if (r0.equals("Attempt to do a synchronize operation on a null object") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0103, code lost:
    
        if (java.util.regex.Pattern.matches("Conflicting default method implementations .+", r0) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0135, code lost:
    
        if (java.util.regex.Pattern.matches("Method '.+' implementing interface method '.+' is not public", r0) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0159, code lost:
    
        if (r1 == false) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.suq c(defpackage.suq r6) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwq.c(suq):suq");
    }
}
