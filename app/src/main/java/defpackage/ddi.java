package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddi {
    public static final /* synthetic */ int h = 0;
    private static final String[] i = {"INSERT", "UPDATE", "DELETE"};
    public final dco a;
    public final Map b;
    public final boolean c;
    public final cxb f;
    public final owd g;
    private final Map j;
    private final uiq k;
    private final String[] l;
    private final AtomicBoolean m = new AtomicBoolean(false);
    public uif e = new bfw(8);
    public final Map d = new LinkedHashMap();

    public ddi(dco dcoVar, Map map, Map map2, String[] strArr, boolean z, uiq uiqVar) {
        String lowerCase;
        this.a = dcoVar;
        this.j = map;
        this.b = map2;
        this.c = z;
        this.k = uiqVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String lowerCase2 = strArr[i2].toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            this.d.put(lowerCase2, Integer.valueOf(i2));
            String str = (String) this.j.get(strArr[i2]);
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i2] = lowerCase2;
        }
        this.l = strArr2;
        for (Map.Entry entry : this.j.entrySet()) {
            String lowerCase3 = ((String) entry.getValue()).toLowerCase(Locale.ROOT);
            lowerCase3.getClass();
            if (this.d.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
                lowerCase4.getClass();
                Map map3 = this.d;
                map3.put(lowerCase4, ske.bb(map3, lowerCase3));
            }
        }
        this.g = new owd(this.l.length);
        this.f = new cxb(this.l.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.dcj r5, defpackage.uhb r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dcz
            if (r0 == 0) goto L13
            r0 = r6
            dcz r0 = (defpackage.dcz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dcz r0 = new dcz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.b
            uhi r6 = defpackage.uhi.a
            int r1 = r0.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r5 = r0.a
            java.util.Set r5 = (java.util.Set) r5
            defpackage.rnt.aN(r4)
            return r5
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            java.lang.Object r5 = r0.a
            dcj r5 = (defpackage.dcj) r5
            defpackage.rnt.aN(r4)
            goto L54
        L3e:
            defpackage.rnt.aN(r4)
            aks r4 = new aks
            r1 = 12
            r4.<init>(r1)
            r0.a = r5
            r0.d = r3
            java.lang.String r1 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.a(r1, r4, r0)
            if (r4 == r6) goto L69
        L54:
            java.util.Set r4 = (java.util.Set) r4
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L68
            r0.a = r4
            r0.d = r2
            java.lang.String r1 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = defpackage.cpo.i(r5, r1, r0)
            if (r5 == r6) goto L69
        L68:
            return r4
        L69:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddi.a(dcj, uhb):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.uhb r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.ddd
            if (r0 == 0) goto L13
            r0 = r11
            ddd r0 = (defpackage.ddd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ddd r0 = new ddd
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            got r0 = r0.d
            defpackage.rnt.aN(r11)     // Catch: java.lang.Throwable -> L2a
            goto L76
        L2a:
            r10 = move-exception
            goto Lc6
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            defpackage.rnt.aN(r11)
            dco r11 = r10.a
            got r2 = r11.j
            boolean r5 = r2.o()
            if (r5 == 0) goto Lca
            java.util.concurrent.atomic.AtomicBoolean r5 = r10.m     // Catch: java.lang.Throwable -> Lc4
            boolean r5 = r5.compareAndSet(r4, r3)     // Catch: java.lang.Throwable -> Lc4
            if (r5 != 0) goto L50
            ufy r10 = defpackage.ufy.a     // Catch: java.lang.Throwable -> Lc4
            r2.n()
            return r10
        L50:
            uif r5 = r10.e     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r5 = r5.a()     // Catch: java.lang.Throwable -> Lc4
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Lc4
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> Lc4
            if (r5 != 0) goto L64
            ufy r10 = defpackage.ufy.a     // Catch: java.lang.Throwable -> Lc4
            r2.n()
            return r10
        L64:
            su r5 = new su     // Catch: java.lang.Throwable -> Lc4
            r6 = 5
            r7 = 0
            r5.<init>(r10, r7, r6, r7)     // Catch: java.lang.Throwable -> Lc4
            r0.d = r2     // Catch: java.lang.Throwable -> Lc4
            r0.c = r4     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r11 = r11.v(r5, r0)     // Catch: java.lang.Throwable -> Lc4
            if (r11 == r1) goto Lc3
            r0 = r2
        L76:
            java.util.Set r11 = (java.util.Set) r11     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r11.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto Lbf
            cxb r1 = r10.f     // Catch: java.lang.Throwable -> L2a
            r11.getClass()     // Catch: java.lang.Throwable -> L2a
            boolean r2 = r11.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L8a
            goto Lba
        L8a:
            java.lang.Object r1 = r1.a     // Catch: java.lang.Throwable -> L2a
        L8c:
            r2 = r1
            utl r2 = (defpackage.utl) r2     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r2.c()     // Catch: java.lang.Throwable -> L2a
            r5 = r2
            int[] r5 = (int[]) r5     // Catch: java.lang.Throwable -> L2a
            int r6 = r5.length     // Catch: java.lang.Throwable -> L2a
            int[] r7 = new int[r6]     // Catch: java.lang.Throwable -> L2a
            r8 = r3
        L9a:
            if (r8 >= r6) goto Lb1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L2a
            boolean r9 = r11.contains(r9)     // Catch: java.lang.Throwable -> L2a
            if (r9 == 0) goto Laa
            r9 = r5[r8]     // Catch: java.lang.Throwable -> L2a
            int r9 = r9 + r4
            goto Lac
        Laa:
            r9 = r5[r8]     // Catch: java.lang.Throwable -> L2a
        Lac:
            r7[r8] = r9     // Catch: java.lang.Throwable -> L2a
            int r8 = r8 + 1
            goto L9a
        Lb1:
            r5 = r1
            utl r5 = (defpackage.utl) r5     // Catch: java.lang.Throwable -> L2a
            boolean r2 = r5.f(r2, r7)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L8c
        Lba:
            uiq r10 = r10.k     // Catch: java.lang.Throwable -> L2a
            r10.a(r11)     // Catch: java.lang.Throwable -> L2a
        Lbf:
            r0.n()
            return r11
        Lc3:
            return r1
        Lc4:
            r10 = move-exception
            r0 = r2
        Lc6:
            r0.n()
            throw r10
        Lca:
            ufy r10 = defpackage.ufy.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddi.b(uhb):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007a -> B:19:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.dcj r9, int r10, defpackage.uhb r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.ddf
            if (r0 == 0) goto L13
            r0 = r11
            ddf r0 = (defpackage.ddf) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ddf r0 = new ddf
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.c
            uhi r1 = defpackage.uhi.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r8 = r0.b
            int r9 = r0.a
            java.lang.String[] r10 = r0.g
            java.lang.String r2 = r0.f
            dds r4 = r0.h
            defpackage.rnt.aN(r11)
            r11 = r10
            r10 = r4
            goto L7d
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            defpackage.rnt.aN(r11)
            java.lang.String[] r8 = r8.l
            r8 = r8[r10]
            java.lang.String[] r10 = defpackage.ddi.i
            r11 = 3
            r2 = 0
            r7 = r2
            r2 = r8
            r8 = r11
            r11 = r10
            r10 = r9
            r9 = r7
        L4c:
            if (r9 >= r8) goto L7f
            r4 = r11[r9]
            java.lang.String r4 = defpackage.cvz.e(r2, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "DROP TRIGGER IF EXISTS `"
            r5.<init>(r6)
            r5.append(r4)
            r4 = 96
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r5 = r10
            dds r5 = (defpackage.dds) r5
            r0.h = r5
            r0.f = r2
            r0.g = r11
            r0.a = r9
            r0.b = r8
            r0.e = r3
            java.lang.Object r4 = defpackage.cpo.i(r10, r4, r0)
            if (r4 != r1) goto L7d
            return r1
        L7d:
            int r9 = r9 + r3
            goto L4c
        L7f:
            ufg r8 = defpackage.ufg.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddi.d(dcj, int, uhb):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.uhb r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ddg
            if (r0 == 0) goto L13
            r0 = r8
            ddg r0 = (defpackage.ddg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ddg r0 = new ddg
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            got r7 = r0.d
            defpackage.rnt.aN(r8)     // Catch: java.lang.Throwable -> L29
            goto L52
        L29:
            r8 = move-exception
            goto L5a
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.rnt.aN(r8)
            dco r8 = r7.a
            got r2 = r8.j
            boolean r4 = r2.o()
            if (r4 == 0) goto L5e
            su r4 = new su     // Catch: java.lang.Throwable -> L57
            r5 = 6
            r6 = 0
            r4.<init>(r7, r6, r5, r6)     // Catch: java.lang.Throwable -> L57
            r0.d = r2     // Catch: java.lang.Throwable -> L57
            r0.c = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r7 = r8.v(r4, r0)     // Catch: java.lang.Throwable -> L57
            if (r7 == r1) goto L56
            r7 = r2
        L52:
            r7.n()
            goto L5e
        L56:
            return r1
        L57:
            r7 = move-exception
            r8 = r7
            r7 = r2
        L5a:
            r7.n()
            throw r8
        L5e:
            ufg r7 = defpackage.ufg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddi.e(uhb):java.lang.Object");
    }

    public final void f(uif uifVar, uif uifVar2) {
        uifVar.getClass();
        uifVar2.getClass();
        if (this.m.compareAndSet(false, true)) {
            ukc.C(this.a.i(), new unc("Room Invalidation Tracker Refresh"), 0, new ve(this, uifVar2, (uhb) null, 5), 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (defpackage.cpo.i(r13, r15, r0) != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c9, code lost:
    
        if (defpackage.cpo.i(r7, r15, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d1, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c9 -> B:27:0x00cc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.dcj r13, int r14, defpackage.uhb r15) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddi.c(dcj, int, uhb):java.lang.Object");
    }
}
