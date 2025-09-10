package defpackage;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eeq {
    static final Set a = new HashSet(Arrays.asList("xml:lang", "rdf:resource", "rdf:ID", "rdf:bagID", "rdf:nodeID"));
    public static final /* synthetic */ int b = 0;

    public static final void c(eek eekVar, eeb eebVar, OutputStreamWriter outputStreamWriter, eey eeyVar, int i, int i2) {
        outputStreamWriter.write(34);
        String str = eekVar.a.a;
        if (str != null) {
            k(str, true, outputStreamWriter);
        }
        outputStreamWriter.write(34);
    }

    public static final boolean d(een eenVar, int i, eek eekVar, eeb eebVar, OutputStreamWriter outputStreamWriter, eey eeyVar, int i2, int i3) throws IOException {
        Iterator itH = eenVar.h();
        boolean z = true;
        while (itH.hasNext()) {
            een eenVar2 = (een) itH.next();
            if (i(eenVar2)) {
                h(outputStreamWriter, eeyVar);
                g(i, outputStreamWriter, eeyVar);
                outputStreamWriter.write(eenVar2.a);
                outputStreamWriter.write("=\"");
                k(eenVar2.b, true, outputStreamWriter);
                outputStreamWriter.write(34);
            } else {
                z = false;
            }
        }
        return z;
    }

    public static final void e(een eenVar, Set set, eek eekVar, eeb eebVar, OutputStreamWriter outputStreamWriter, eey eeyVar, int i, int i2) {
        if (eenVar.g().n()) {
            j(eenVar.b.substring(0, r0.length() - 1), eenVar.a, set, eekVar, eebVar, outputStreamWriter, eeyVar, i, i2);
        } else if (eenVar.g().o()) {
            Iterator itH = eenVar.h();
            while (itH.hasNext()) {
                j(((een) itH.next()).a, null, set, eekVar, eebVar, outputStreamWriter, eeyVar, i, i2);
            }
        }
        Iterator itH2 = eenVar.h();
        while (itH2.hasNext()) {
            e((een) itH2.next(), set, eekVar, eebVar, outputStreamWriter, eeyVar, i, i2);
        }
        Iterator itI = eenVar.i();
        while (itI.hasNext()) {
            een eenVar2 = (een) itI.next();
            j(eenVar2.a, null, set, eekVar, eebVar, outputStreamWriter, eeyVar, i, i2);
            e(eenVar2, set, eekVar, eebVar, outputStreamWriter, eeyVar, i, i2);
        }
    }

    public static final void f(int i, OutputStreamWriter outputStreamWriter) {
        while (i > 0) {
            outputStreamWriter.write(32);
            i--;
        }
    }

    public static final void g(int i, OutputStreamWriter outputStreamWriter, eey eeyVar) {
        while (i > 0) {
            outputStreamWriter.write(eeyVar.d);
            i--;
        }
    }

    public static final void h(OutputStreamWriter outputStreamWriter, eey eeyVar) {
        outputStreamWriter.write(eeyVar.c);
    }

    private static final boolean i(een eenVar) {
        return (eenVar.u() || eenVar.g().p() || eenVar.g().l() || "[]".equals(eenVar.a)) ? false : true;
    }

    private static final void j(String str, String str2, Set set, eek eekVar, eeb eebVar, OutputStreamWriter outputStreamWriter, eey eeyVar, int i, int i2) throws IOException {
        String strSubstring;
        if (str2 == null) {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf >= 0) {
                strSubstring = str.substring(0, iIndexOf);
                str.substring(iIndexOf + 1);
            } else {
                strSubstring = "";
            }
            if (strSubstring == null || strSubstring.length() <= 0) {
                return;
            }
            String strB = edy.a.b(strSubstring.concat(":"));
            j(strSubstring, strB, set, eekVar, eebVar, outputStreamWriter, eeyVar, i, i2);
            str = strSubstring;
            str2 = strB;
        }
        if (set.contains(str)) {
            return;
        }
        h(outputStreamWriter, eeyVar);
        g(4, outputStreamWriter, eeyVar);
        outputStreamWriter.write("xmlns:");
        outputStreamWriter.write(str);
        outputStreamWriter.write("=\"");
        outputStreamWriter.write(str2);
        outputStreamWriter.write(34);
        set.add(str);
    }

    private static final void k(String str, boolean z, OutputStreamWriter outputStreamWriter) {
        int i = eed.a;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '<' && cCharAt != '>' && cCharAt != '&' && cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r') {
                if (z && cCharAt == '\"') {
                    z = true;
                }
            }
            StringBuffer stringBuffer = new StringBuffer((str.length() * 4) / 3);
            for (int i3 = 0; i3 < str.length(); i3++) {
                char cCharAt2 = str.charAt(i3);
                if (cCharAt2 == '\t' || cCharAt2 == '\n' || cCharAt2 == '\r') {
                    stringBuffer.append("&#x");
                    stringBuffer.append(Integer.toHexString(cCharAt2).toUpperCase());
                    stringBuffer.append(';');
                } else if (cCharAt2 == '\"') {
                    stringBuffer.append(true != z ? "\"" : "&quot;");
                } else if (cCharAt2 == '&') {
                    stringBuffer.append("&amp;");
                } else if (cCharAt2 == '<') {
                    stringBuffer.append("&lt;");
                } else if (cCharAt2 != '>') {
                    stringBuffer.append(cCharAt2);
                } else {
                    stringBuffer.append("&gt;");
                }
            }
            str = stringBuffer.toString();
            outputStreamWriter.write(str);
        }
        outputStreamWriter.write(str);
    }

    private static final void l(een eenVar, boolean z, int i, OutputStreamWriter outputStreamWriter, eey eeyVar) {
        if (z || eenVar.t()) {
            g(i, outputStreamWriter, eeyVar);
            outputStreamWriter.write(true != z ? "</rdf:" : "<rdf:");
            if (eenVar.g().j()) {
                outputStreamWriter.write("Alt");
            } else if (eenVar.g().k()) {
                outputStreamWriter.write("Seq");
            } else {
                outputStreamWriter.write("Bag");
            }
            if (!z || eenVar.t()) {
                outputStreamWriter.write(">");
            } else {
                outputStreamWriter.write("/>");
            }
            h(outputStreamWriter, eeyVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x000a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.een r17, int r18, defpackage.eek r19, defpackage.eeb r20, java.io.OutputStreamWriter r21, defpackage.eey r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eeq.a(een, int, eek, eeb, java.io.OutputStreamWriter, eey, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.een r18, boolean r19, int r20, defpackage.eek r21, defpackage.eeb r22, java.io.OutputStreamWriter r23, defpackage.eey r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eeq.b(een, boolean, int, eek, eeb, java.io.OutputStreamWriter, eey, int, int):void");
    }
}
