package defpackage;

import android.app.AppOpsManager;
import android.database.Cursor;
import android.graphics.Shader;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cgh {
    public static final int A(Cursor cursor, String str) {
        String strAH;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            columnNames.getClass();
            strAH = rnt.aH(columnNames, null, null, null, 63);
        } catch (Exception unused) {
            strAH = "unknown";
        }
        throw new IllegalArgumentException(mn.f(strAH, str, "column '", "' does not exist. Available columns: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List B(defpackage.cxb r9, int r10, int r11) {
        /*
            if (r10 != r11) goto L5
            ufw r9 = defpackage.ufw.a
            return r9
        L5:
            r0 = 0
            r1 = 1
            if (r11 <= r10) goto Lb
            r2 = r1
            goto Lc
        Lb:
            r2 = r0
        Lc:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L11:
            if (r2 == 0) goto L16
            if (r10 >= r11) goto L18
            goto L19
        L16:
            if (r10 > r11) goto L19
        L18:
            return r3
        L19:
            r4 = 0
            if (r2 == 0) goto L35
            java.lang.Object r5 = r9.a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r5.get(r6)
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            if (r5 != 0) goto L2b
            goto L43
        L2b:
            java.util.NavigableSet r6 = r5.descendingKeySet()
            uev r7 = new uev
            r7.<init>(r5, r6)
            goto L4e
        L35:
            java.lang.Object r5 = r9.a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r5.get(r6)
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            if (r5 != 0) goto L45
        L43:
            r7 = r4
            goto L4e
        L45:
            java.util.Set r6 = r5.keySet()
            uev r7 = new uev
            r7.<init>(r5, r6)
        L4e:
            if (r7 != 0) goto L51
            return r4
        L51:
            java.lang.Object r5 = r7.a
            java.lang.Object r6 = r7.b
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L5d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8b
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r2 == 0) goto L76
            int r8 = r10 + 1
            if (r8 > r7) goto L5d
            if (r7 > r11) goto L5d
            goto L7a
        L76:
            if (r11 > r7) goto L5d
            if (r7 >= r10) goto L5d
        L7a:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r5.get(r10)
            r10.getClass()
            r3.add(r10)
            r5 = r1
            r10 = r7
            goto L8c
        L8b:
            r5 = r0
        L8c:
            if (r5 != 0) goto L11
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgh.B(cxb, int, int):java.util.List");
    }

    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(String str) {
        throw new IllegalStateException(str);
    }

    public static final cdh c(cdh cdhVar, cdh cdhVar2) {
        return cdhVar == null ? cdhVar2 : cdhVar.c(cdhVar2);
    }

    public static final void d(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            h(spannable, new BackgroundColorSpan(bko.h(j)), i, i2);
        }
    }

    public static final void e(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            h(spannable, new ForegroundColorSpan(bko.h(j)), i, i2);
        }
    }

    public static final void f(Spannable spannable, long j, chq chqVar, int i, int i2) {
        long jB = cid.b(j);
        if (a.q(jB, 4294967296L)) {
            h(spannable, new AbsoluteSizeSpan(ukj.x(chqVar.dj(j)), false), i, i2);
        } else if (a.q(jB, 8589934592L)) {
            h(spannable, new RelativeSizeSpan(Float.intBitsToFloat((int) (j & 4294967295L))), i, i2);
        }
    }

    public static final void g(Spannable spannable, cgk cgkVar, int i, int i2) {
        if (cgkVar != null) {
            ArrayList arrayList = new ArrayList(ske.bq(cgkVar, 10));
            Iterator<E> it = cgkVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((cgj) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            h(spannable, new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2);
        }
    }

    public static final void h(Spannable spannable, Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2, 33);
    }

    public static final float i(float f, chq chqVar) {
        if (a.q(0L, cid.a)) {
            return f;
        }
        long jB = cid.b(0L);
        if (a.q(jB, 4294967296L)) {
            return chqVar.dj(0L);
        }
        if (a.q(jB, 8589934592L)) {
            return Float.intBitsToFloat((int) (0 & 4294967295L)) * f;
        }
        return Float.NaN;
    }

    public static final Throwable j(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }

    public static syu k(cix cixVar) {
        civ civVar = new civ();
        ciz cizVar = new ciz(civVar);
        civVar.b = cizVar;
        civVar.a = cixVar.getClass();
        try {
            civVar.a = cixVar.a(civVar);
            return cizVar;
        } catch (Exception e) {
            cizVar.a(e);
            return cizVar;
        }
    }

    public static Shader.TileMode l(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    public static int m(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    public static final String n(Collection collection) {
        return !collection.isEmpty() ? ujp.y(ske.ca(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static final String o(den denVar) {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(denVar.a);
        sb.append("',\n            |    columns = {");
        sb.append(n(ske.bM(denVar.b.values(), new ccn(8))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(n(denVar.c));
        sb.append("\n            |    indices = {");
        Set set = denVar.d;
        sb.append(n(set != null ? ske.bM(set, new ccn(9)) : ufw.a));
        sb.append("\n            |}\n        ");
        return ujp.E(sb.toString());
    }

    public static final void p(Collection collection) throws IOException {
        ujp.y(ske.ca(collection, ",", null, null, null, 62));
        ujp.y(" }");
    }

    public static final void q(Collection collection) throws IOException {
        ujp.y(ske.ca(collection, ",", null, null, null, 62));
        ujp.y("},");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean r(java.lang.String r8, java.lang.String r9) {
        /*
            boolean r0 = defpackage.a.ao(r8, r9)
            r1 = 1
            if (r0 != 0) goto L5c
            int r0 = r8.length()
            r2 = 0
            if (r0 == 0) goto L5b
            r0 = r2
            r3 = r0
            r4 = r3
        L11:
            int r5 = r8.length()
            if (r0 >= r5) goto L3f
            char r5 = r8.charAt(r0)
            int r6 = r4 + 1
            r7 = 40
            if (r4 != 0) goto L25
            if (r5 != r7) goto L5b
            r4 = r2
            r5 = r7
        L25:
            if (r5 == r7) goto L39
            r7 = 41
            if (r5 == r7) goto L2c
            goto L3b
        L2c:
            int r3 = r3 + (-1)
            if (r3 != 0) goto L3b
            int r5 = r8.length()
            int r5 = r5 + (-1)
            if (r4 == r5) goto L3b
            goto L5b
        L39:
            int r3 = r3 + 1
        L3b:
            int r0 = r0 + 1
            r4 = r6
            goto L11
        L3f:
            if (r3 != 0) goto L5b
            int r0 = r8.length()
            int r0 = r0 + (-1)
            java.lang.String r8 = r8.substring(r1, r0)
            r8.getClass()
            java.lang.CharSequence r8 = defpackage.ujp.n(r8)
            java.lang.String r8 = r8.toString()
            boolean r8 = defpackage.a.ao(r8, r9)
            return r8
        L5b:
            return r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgh.r(java.lang.String, java.lang.String):boolean");
    }

    public static final boolean s(den denVar, Object obj) {
        Set set;
        if (denVar == obj) {
            return true;
        }
        if (!(obj instanceof den)) {
            return false;
        }
        den denVar2 = (den) obj;
        if (!a.ao(denVar.a, denVar2.a) || !a.ao(denVar.b, denVar2.b) || !a.ao(denVar.c, denVar2.c)) {
            return false;
        }
        Set set2 = denVar.d;
        if (set2 == null || (set = denVar2.d) == null) {
            return true;
        }
        return a.ao(set2, set);
    }

    public static final den t(ddo ddoVar, String str) throws Exception {
        long j;
        Map mapE;
        Set set;
        int i;
        String str2;
        Throwable th;
        dem demVar;
        ddo ddoVar2 = ddoVar;
        ddw ddwVarA = ddoVar2.a(a.bw(str, "PRAGMA table_info(`", "`)"));
        try {
            long j2 = 0;
            String str3 = "name";
            byte[] bArr = null;
            if (ddwVarA.j()) {
                int iU = u(ddwVarA, "name");
                int iU2 = u(ddwVarA, "type");
                int iU3 = u(ddwVarA, "notnull");
                int iU4 = u(ddwVarA, "pk");
                int iU5 = u(ddwVarA, "dflt_value");
                ugq ugqVar = new ugq();
                while (true) {
                    String strD = ddwVarA.d(iU);
                    j = j2;
                    ugqVar.put(strD, new dek(strD, ddwVarA.d(iU2), ddwVarA.b(iU3) != j2, (int) ddwVarA.b(iU4), ddwVarA.i(iU5) ? null : ddwVarA.d(iU5), 2));
                    if (!ddwVarA.j()) {
                        break;
                    }
                    ddoVar2 = ddoVar;
                    j2 = j;
                }
                mapE = ugqVar.e();
                ske.ay(ddwVarA, null);
            } else {
                mapE = ufx.a;
                ske.ay(ddwVarA, null);
                j = 0;
            }
            ddwVarA = ddoVar2.a(a.bw(str, "PRAGMA foreign_key_list(`", "`)"));
            try {
                int iU6 = u(ddwVarA, "id");
                int iU7 = u(ddwVarA, "seq");
                int iU8 = u(ddwVarA, "table");
                int iU9 = u(ddwVarA, "on_delete");
                int iU10 = u(ddwVarA, "on_update");
                int iU11 = u(ddwVarA, "id");
                int iU12 = u(ddwVarA, "seq");
                int iU13 = u(ddwVarA, "from");
                int iU14 = u(ddwVarA, "to");
                Map map = mapE;
                ugl uglVar = new ugl(bArr);
                while (ddwVarA.j()) {
                    uglVar.add(new dej((int) ddwVarA.b(iU11), (int) ddwVarA.b(iU12), ddwVarA.d(iU13), ddwVarA.d(iU14)));
                    iU9 = iU9;
                    str3 = str3;
                }
                int i2 = iU9;
                String str4 = str3;
                List listBL = ske.bL(ske.bi(uglVar));
                ddwVarA.h();
                ugw ugwVar = new ugw();
                while (ddwVarA.j()) {
                    if (ddwVarA.b(iU7) == j) {
                        int iB = (int) ddwVarA.b(iU6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList<dej> arrayList3 = new ArrayList();
                        for (Object obj : listBL) {
                            if (((dej) obj).a == iB) {
                                arrayList3.add(obj);
                            }
                        }
                        for (dej dejVar : arrayList3) {
                            arrayList.add(dejVar.b);
                            arrayList2.add(dejVar.c);
                        }
                        int i3 = i2;
                        ugwVar.add(new del(ddwVarA.d(iU8), ddwVarA.d(i3), ddwVarA.d(iU10), arrayList, arrayList2));
                        i2 = i3;
                    }
                }
                Set setAU = ske.aU(ugwVar);
                ske.ay(ddwVarA, null);
                ddo ddoVar3 = ddoVar;
                ddwVarA = ddoVar3.a(a.bw(str, "PRAGMA index_list(`", "`)"));
                String str5 = str4;
                try {
                    int iU15 = u(ddwVarA, str5);
                    int iU16 = u(ddwVarA, "origin");
                    int iU17 = u(ddwVarA, "unique");
                    if (iU15 == -1 || iU16 == -1 || iU17 == -1) {
                        ske.ay(ddwVarA, null);
                        set = null;
                    } else {
                        ugw ugwVar2 = new ugw();
                        while (true) {
                            if (!ddwVarA.j()) {
                                Set setAU2 = ske.aU(ugwVar2);
                                ske.ay(ddwVarA, null);
                                set = setAU2;
                                break;
                            }
                            if (a.ao("c", ddwVarA.d(iU16))) {
                                String strD2 = ddwVarA.d(iU15);
                                boolean z = ddwVarA.b(iU17) == 1;
                                ddwVarA = ddoVar3.a(a.bw(strD2, "PRAGMA index_xinfo(`", "`)"));
                                try {
                                    int iU18 = u(ddwVarA, "seqno");
                                    int iU19 = u(ddwVarA, "cid");
                                    int iU20 = u(ddwVarA, str5);
                                    int i4 = iU15;
                                    int iU21 = u(ddwVarA, "desc");
                                    int i5 = iU16;
                                    if (iU18 == -1 || iU19 == -1 || iU20 == -1 || iU21 == -1) {
                                        i = iU17;
                                        str2 = str5;
                                        th = null;
                                        ske.ay(ddwVarA, null);
                                        demVar = null;
                                    } else {
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        i = iU17;
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                        while (ddwVarA.j()) {
                                            String str6 = str5;
                                            if (((int) ddwVarA.b(iU19)) >= 0) {
                                                int iB2 = (int) ddwVarA.b(iU18);
                                                String strD3 = ddwVarA.d(iU20);
                                                String str7 = ddwVarA.b(iU21) > j ? "DESC" : "ASC";
                                                Integer numValueOf = Integer.valueOf(iB2);
                                                linkedHashMap.put(numValueOf, strD3);
                                                linkedHashMap2.put(numValueOf, str7);
                                                str5 = str6;
                                                iU21 = iU21;
                                            } else {
                                                str5 = str6;
                                            }
                                        }
                                        str2 = str5;
                                        List listBM = ske.bM(linkedHashMap.entrySet(), new ccn(6));
                                        ArrayList arrayList4 = new ArrayList(ske.bq(listBM, 10));
                                        Iterator it = listBM.iterator();
                                        while (it.hasNext()) {
                                            arrayList4.add((String) ((Map.Entry) it.next()).getValue());
                                        }
                                        List listBN = ske.bN(arrayList4);
                                        List listBM2 = ske.bM(linkedHashMap2.entrySet(), new ccn(7));
                                        ArrayList arrayList5 = new ArrayList(ske.bq(listBM2, 10));
                                        Iterator it2 = listBM2.iterator();
                                        while (it2.hasNext()) {
                                            arrayList5.add((String) ((Map.Entry) it2.next()).getValue());
                                        }
                                        demVar = new dem(strD2, z, listBN, ske.bN(arrayList5));
                                        ske.ay(ddwVarA, null);
                                        th = null;
                                    }
                                    if (demVar == null) {
                                        ske.ay(ddwVarA, th);
                                        set = null;
                                        break;
                                    }
                                    ugwVar2.add(demVar);
                                    ddoVar3 = ddoVar;
                                    iU15 = i4;
                                    iU16 = i5;
                                    iU17 = i;
                                    str5 = str2;
                                } finally {
                                }
                            } else {
                                ddoVar3 = ddoVar;
                            }
                        }
                    }
                    return new den(str, map, setAU, set);
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static final int u(dey deyVar, String str) {
        int iV = v(deyVar, str);
        if (iV >= 0) {
            return iV;
        }
        int iV2 = v(deyVar, "`" + str + '`');
        if (iV2 >= 0) {
            return iV2;
        }
        return -1;
    }

    public static final int v(dey deyVar, String str) {
        int iA = deyVar.a();
        for (int i = 0; i < iA; i++) {
            if (a.ao(str, deyVar.c(i))) {
                return i;
            }
        }
        return -1;
    }

    public static final int w(dey deyVar, String str) throws IOException {
        int iU = u(deyVar, str);
        if (iU >= 0) {
            return iU;
        }
        int iA = deyVar.a();
        ArrayList arrayList = new ArrayList(iA);
        for (int i = 0; i < iA; i++) {
            arrayList.add(deyVar.c(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + ske.ca(arrayList, null, null, null, null, 63) + ']');
    }

    public static final int x(ddo ddoVar) throws Exception {
        ddoVar.getClass();
        ddw ddwVarA = ddoVar.a("SELECT changes()");
        try {
            ddwVarA.j();
            int iB = (int) ddwVarA.b(0);
            ske.ay(ddwVarA, null);
            return iB;
        } finally {
        }
    }

    public static final boolean y(dbx dbxVar, int i, int i2) {
        if (i <= i2 || !dbxVar.i) {
            return dbxVar.h && !dbxVar.j.contains(Integer.valueOf(i));
        }
        return false;
    }

    public static final void z(ddo ddoVar) throws Exception {
        ugl uglVar = new ugl((byte[]) null);
        ddw ddwVarA = ddoVar.a("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (ddwVarA.j()) {
            try {
                uglVar.add(ddwVarA.d(0));
            } finally {
            }
        }
        ske.ay(ddwVarA, null);
        for (String str : ske.bi(uglVar)) {
            if (ujp.B(str, "room_fts_content_sync_")) {
                cog.p(ddoVar, "DROP TRIGGER IF EXISTS ".concat(String.valueOf(str)));
            }
        }
    }
}
