package defpackage;

import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uwx implements umj, upr {
    public final uhf a;
    public Object c;
    public final umb b = new umb(uwy.a, umc.a);
    private List e = new ArrayList(2);
    private int f = -1;
    public Object d = uwy.d;

    public uwx(uhf uhfVar) {
        this.a = uhfVar;
    }

    @Override // defpackage.upr
    public final void C(uvb uvbVar, int i) {
        this.c = uvbVar;
        this.f = i;
    }

    @Override // defpackage.umj
    public final void a(Throwable th) {
        umb umbVar;
        Object obj;
        do {
            umbVar = this.b;
            obj = umbVar.a;
            if (obj == uwy.b) {
                return;
            }
        } while (!umbVar.d(obj, uwy.c));
        List list = this.e;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((uwu) it.next()).c();
            }
            this.d = uwy.d;
            this.e = null;
        }
    }

    public final int b(Object obj, Object obj2) {
        while (true) {
            umb umbVar = this.b;
            Object obj3 = umbVar.a;
            if (obj3 instanceof umk) {
                uwu uwuVarI = i(obj);
                if (uwuVarI != null) {
                    uiv uivVarD = uwuVarI.d(this, obj2);
                    if (umbVar.d(obj3, uwuVarI)) {
                        umk umkVar = (umk) obj3;
                        this.d = obj2;
                        Object objH = umkVar.h(ufg.a, uivVarD);
                        if (objH == null) {
                            this.d = uwy.d;
                            return 2;
                        }
                        umkVar.c(objH);
                        return 0;
                    }
                } else {
                    continue;
                }
            } else {
                if (a.ao(obj3, uwy.b) || (obj3 instanceof uwu)) {
                    return 3;
                }
                if (a.ao(obj3, uwy.c)) {
                    return 2;
                }
                if (a.ao(obj3, uwy.a)) {
                    if (umbVar.d(obj3, ske.bj(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        Objects.toString(obj3);
                        throw new IllegalStateException("Unexpected state: ".concat(String.valueOf(obj3)));
                    }
                    if (umbVar.d(obj3, ske.bK((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    public final Object c(uhb uhbVar) {
        boolean z = unf.a;
        umb umbVar = this.b;
        Object obj = umbVar.a;
        obj.getClass();
        uwu uwuVar = (uwu) obj;
        Object obj2 = this.d;
        List<uwu> list = this.e;
        if (list != null) {
            for (uwu uwuVar2 : list) {
                if (uwuVar2 != uwuVar) {
                    uwuVar2.c();
                }
            }
            umbVar.c(uwy.b);
            this.d = uwy.d;
            this.e = null;
        }
        return !unf.b ? uwuVar.a(uwuVar.b(obj2), uhbVar) : e(uwuVar, obj2, uhbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.uhb r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.uwv
            if (r0 == 0) goto L13
            r0 = r9
            uwv r0 = (defpackage.uwv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            uwv r0 = new uwv
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.rnt.aN(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            defpackage.rnt.aN(r9)
            goto La2
        L36:
            defpackage.rnt.aN(r9)
            r0.c = r4
            uml r9 = new uml
            uhb r2 = defpackage.ske.aE(r0)
            r9.<init>(r2, r4)
            r9.x()
            umb r2 = r8.b
        L49:
            java.lang.Object r5 = r2.a
            uwc r6 = defpackage.uwy.a
            if (r5 != r6) goto L59
            boolean r5 = r2.d(r5, r9)
            if (r5 == 0) goto L49
            r9.y(r8)
            goto L98
        L59:
            boolean r7 = r5 instanceof java.util.List
            if (r7 == 0) goto L87
            boolean r6 = r2.d(r5, r6)
            if (r6 == 0) goto L49
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L6c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L49
            java.lang.Object r6 = r5.next()
            uwu r6 = r8.i(r6)
            r6.getClass()
            r7 = 0
            r6.d = r7
            r7 = -1
            r6.e = r7
            r8.f(r6, r4)
            goto L6c
        L87:
            boolean r2 = r5 instanceof defpackage.uwu
            if (r2 == 0) goto Lad
            ufg r2 = defpackage.ufg.a
            uwu r5 = (defpackage.uwu) r5
            java.lang.Object r4 = r8.d
            uiv r4 = r5.d(r8, r4)
            r9.e(r2, r4)
        L98:
            java.lang.Object r9 = r9.i()
            if (r9 == r1) goto La0
            ufg r9 = defpackage.ufg.a
        La0:
            if (r9 == r1) goto Lac
        La2:
            r0.c = r3
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto Lab
            goto Lac
        Lab:
            return r8
        Lac:
            return r1
        Lad:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.util.Objects.toString(r5)
            java.lang.String r9 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "unexpected state: "
            java.lang.String r9 = r0.concat(r9)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwx.d(uhb):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.uwu r5, java.lang.Object r6, defpackage.uhb r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.uww
            if (r0 == 0) goto L13
            r0 = r7
            uww r0 = (defpackage.uww) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            uww r0 = new uww
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.a
            uhi r7 = defpackage.uhi.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            defpackage.rnt.aN(r4)     // Catch: java.lang.Throwable -> L27
            return r4
        L27:
            r4 = move-exception
            goto L42
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.rnt.aN(r4)
            java.lang.Object r4 = r5.b(r6)     // Catch: java.lang.Throwable -> L27
            r0.c = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r5.a(r4, r0)     // Catch: java.lang.Throwable -> L27
            if (r4 != r7) goto L41
            return r7
        L41:
            return r4
        L42:
            boolean r5 = defpackage.unf.b
            if (r5 != 0) goto L47
            throw r4
        L47:
            java.lang.Throwable r4 = defpackage.uwb.a(r4, r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwx.e(uwu, java.lang.Object, uhb):java.lang.Object");
    }

    public final void f(uwu uwuVar, boolean z) {
        boolean z2 = unf.a;
        umb umbVar = this.b;
        if (umbVar.a instanceof uwu) {
            return;
        }
        if (!z) {
            Object obj = uwuVar.a;
            List list = this.e;
            list.getClass();
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((uwu) it.next()).a == obj) {
                        Objects.toString(obj);
                        throw new IllegalStateException("Cannot use select clauses on the same object: ".concat(obj.toString()));
                    }
                }
            }
        }
        uwuVar.b.a(uwuVar.a, this, null);
        if (this.d != uwy.d) {
            umbVar.c(uwuVar);
            return;
        }
        if (!z) {
            List list2 = this.e;
            list2.getClass();
            list2.add(uwuVar);
        }
        uwuVar.d = this.c;
        uwuVar.e = this.f;
        this.c = null;
        this.f = -1;
    }

    public final boolean g(Object obj, Object obj2) {
        return b(obj, obj2) == 0;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, uiv] */
    public final void h(uwt uwtVar, uiu uiuVar) {
        f(new uwu(this, uwtVar.a, uwtVar.b, uwtVar.c, uiuVar, uwtVar.d), false);
    }

    private final uwu i(Object obj) {
        List list = this.e;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((uwu) next).a == obj) {
                obj2 = next;
                break;
            }
        }
        uwu uwuVar = (uwu) obj2;
        if (uwuVar != null) {
            return uwuVar;
        }
        throw new IllegalStateException(a.bz(obj, INRGuObcrHjSQz.pxFqaozlHlMdp, " is not found"));
    }
}
