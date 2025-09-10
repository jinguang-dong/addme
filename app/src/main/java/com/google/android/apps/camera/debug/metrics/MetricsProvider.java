package com.google.android.apps.camera.debug.metrics;

import android.content.Context;
import android.util.PrintWriterPrinter;
import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import defpackage.hdn;
import defpackage.ink;
import defpackage.pbh;
import defpackage.pmq;
import defpackage.pmr;
import defpackage.pmv;
import defpackage.pnc;
import defpackage.pnf;
import defpackage.prh;
import defpackage.qaq;
import defpackage.qas;
import defpackage.rnt;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MetricsProvider extends pbh {
    public qaq a;

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.pbh
    public final void a(PrintWriter printWriter) {
        qaq qaqVar;
        pnf pnfVar;
        int i;
        String string;
        pnf pnfVar2;
        int i2;
        if (this.a == null) {
            Context context = getContext();
            context.getClass();
            ((hdn) ((ink) context.getApplicationContext()).d(hdn.class)).d(this);
        }
        long jNanoTime = System.nanoTime();
        PrintWriterPrinter printWriterPrinter = new PrintWriterPrinter(printWriter);
        qaq qaqVar2 = this.a;
        rnt.x(qaqVar2);
        Object obj = qaqVar2.a;
        synchronized (((pnc) obj).a) {
            Object obj2 = ((pnc) obj).b.a;
            pnfVar = null;
            qaqVar = new qaq((char[]) null, (byte[]) null);
            for (Map.Entry entry : ((qaq) obj2).a.entrySet()) {
                ?? r8 = qaqVar.a;
                String str = (String) entry.getKey();
                qas qasVar = (qas) entry.getValue();
                qas qasVar2 = new qas((pmv) qasVar.b);
                for (Map.Entry entry2 : ((TreeMap) qasVar.a).entrySet()) {
                    ((TreeMap) qasVar2.a).put((pmr) entry2.getKey(), ((pnf) entry2.getValue()).a());
                }
                r8.put(str, qasVar2);
            }
        }
        for (qas qasVar3 : qaqVar.a.values()) {
            if (qasVar3 == null) {
                string = "";
            } else {
                int i3 = 0;
                if (qasVar3.b().length == 0) {
                    String strA = qasVar3.a();
                    Object[] objArr = pmr.a.b;
                    Iterator it = ((TreeMap) qasVar3.a).entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            pnfVar2 = pnfVar;
                            break;
                        }
                        Map.Entry entry3 = (Map.Entry) it.next();
                        for (0; i2 < objArr.length; i2 + 1) {
                            i2 = (objArr[i2] == null || ((pmr) entry3.getKey()).b[i2] == objArr[i2]) ? i2 + 1 : 0;
                        }
                        pnfVar2 = (pnf) entry3.getValue();
                        break;
                    }
                    string = strA + PJGqOKsIpSdZ.VztUPQPwdX + prh.I(pnfVar2);
                } else {
                    pmq[] pmqVarArrB = qasVar3.b();
                    ?? r82 = qasVar3.a;
                    int length = pmqVarArrB.length;
                    int i4 = length + 1;
                    Set<Map.Entry> setEntrySet = r82.entrySet();
                    int[] iArr = new int[i4];
                    String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, setEntrySet.size() + 1, i4);
                    for (int i5 = 0; i5 < length; i5++) {
                        strArr[0][i5] = pmqVarArrB[i5].a;
                        iArr[i5] = pmqVarArrB[i5].a.length();
                    }
                    strArr[0][length] = "";
                    iArr[length] = 1;
                    int i6 = 1;
                    for (Map.Entry entry4 : setEntrySet) {
                        int i7 = i3;
                        while (i7 < length) {
                            String str2 = String.format(Locale.ROOT, "%s", ((pmr) entry4.getKey()).b[i7]);
                            iArr[i7] = Math.max(iArr[i7], str2.length());
                            strArr[i6][i7] = str2;
                            i7++;
                            i3 = i3;
                        }
                        String strI = prh.I((pnf) entry4.getValue());
                        iArr[length] = Math.max(iArr[length], strI.length());
                        strArr[i6][length] = strI;
                        i6++;
                        i3 = i3;
                    }
                    int i8 = i3;
                    StringBuilder sb = new StringBuilder("  ");
                    int i9 = i8;
                    while (true) {
                        i = length - 1;
                        if (i9 >= i) {
                            break;
                        }
                        sb.append("%-");
                        sb.append(iArr[i9] + 1);
                        sb.append("s");
                        i9++;
                    }
                    String strConcat = sb.toString().concat("%s");
                    sb.append("%-");
                    sb.append(iArr[i]);
                    sb.append("s:%");
                    sb.append(iArr[length] + 1);
                    sb.append("s");
                    String string2 = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(qasVar3.a());
                    sb2.append("\n");
                    sb2.append(String.format(Locale.ROOT, strConcat, strArr[i8]));
                    for (int i10 = 1; i10 < strArr.length; i10++) {
                        sb2.append("\n");
                        sb2.append(String.format(Locale.ROOT, string2, strArr[i10]));
                    }
                    string = sb2.toString();
                }
            }
            printWriterPrinter.println(string);
            pnfVar = null;
        }
        printWriterPrinter.println(String.format(Locale.ROOT, "\n\nMetrics dumped in %.6f ms", Double.valueOf((System.nanoTime() - jNanoTime) / 1000000.0d)));
    }
}
