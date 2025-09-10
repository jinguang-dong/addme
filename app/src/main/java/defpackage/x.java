package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class x implements Serializable {
    public static final x a;
    static final Pattern b;
    static final Pattern c;
    static final Pattern d;
    static final Pattern e;
    static final Pattern f;
    static final Pattern g;
    private static final o i;
    private static final v j;
    private static final long serialVersionUID = 1;
    public final w h;

    static {
        l lVar = new l();
        i = lVar;
        v vVar = new v("other", lVar, null, null);
        j = vVar;
        w wVar = new w();
        wVar.a(vVar);
        a = new x(wVar);
        b = Pattern.compile("\\s*\\Q\\E@\\s*");
        c = Pattern.compile("\\s*or\\s*");
        d = Pattern.compile("\\s*and\\s*");
        e = Pattern.compile("\\s*,\\s*");
        Pattern.compile("\\s*\\Q..\\E\\s*");
        f = Pattern.compile("\\s*~\\s*");
        g = Pattern.compile("\\s*;\\s*");
    }

    public x(w wVar) {
        this.h = wVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = wVar.b.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((v) it.next()).a);
        }
        DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    public static void b(StringBuilder sb, double d2, double d3, boolean z) {
        if (z) {
            sb.append(",");
        }
        if (d2 == d3) {
            sb.append(c(d2));
            return;
        }
        sb.append(c(d2) + ".." + c(d3));
    }

    private static String c(double d2) {
        long j2 = (long) d2;
        return d2 == ((double) j2) ? String.valueOf(j2) : String.valueOf(d2);
    }

    private static String d(String[] strArr, int i2, String str) throws ParseException {
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        throw new ParseException(a.bw(str, "missing token at end of '", "'"), -1);
    }

    private static ParseException e(String str, String str2) {
        return new ParseException(a.by(str2, str, "unexpected token '", "' in '", "'"), -1);
    }

    public final boolean equals(Object obj) {
        x xVar;
        return (obj instanceof x) && (xVar = (x) obj) != null && toString().equals(xVar.toString());
    }

    @Deprecated
    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0405 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.v a(java.lang.String r39) throws java.lang.NumberFormatException, java.text.ParseException {
        /*
            Method dump skipped, instructions count: 1224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x.a(java.lang.String):v");
    }
}
