package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.wear.ambient.AmbientModeSupport;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tdy {
    public static tdy d;
    public final Object a;
    public final Object b;
    public final Object c;

    public tdy(Context context, LocationManager locationManager) {
        this.c = new ev();
        this.a = context;
        this.b = locationManager;
    }

    public final IllegalArgumentException a() {
        Object obj = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        return new IllegalArgumentException("Multiple entries with same key: " + obj3.toString() + "=" + obj2.toString() + " and " + obj3.toString() + "=" + obj.toString());
    }

    public final void b() {
        ((rlp) this.c).c((View) this.b);
    }

    public final boolean c(Class cls, Class cls2) {
        return ((Class) this.b).isAssignableFrom(cls) && cls2.isAssignableFrom((Class) this.a);
    }

    public final boolean d(Class cls) {
        return ((Class) this.a).isAssignableFrom(cls);
    }

    public final String e() {
        String string = ((UUID) this.b).toString();
        string.getClass();
        return string;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final uev f() {
        ?? r0 = this.c;
        int iA = ((bgz) r0).a();
        dqj dqjVar = null;
        for (int i = 0; i < iA; i++) {
            dqj dqjVar2 = (dqj) r0.get(i);
            if (dqjVar2.b.a() != null) {
                dqjVar = dqjVar2;
            }
        }
        Object obj = this.b;
        if (obj == null) {
            obj = dot.a;
        }
        return new uev(dqjVar, obj);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [azr, java.lang.Object] */
    public final void g(ayc aycVar, int i) {
        int i2;
        dkf dkfVar;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-1155284549);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != aycVarC.B(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (aycVarC.H((i2 & 3) != 2, i2 & 1)) {
            dqj dqjVar = (dqj) f().a;
            azr azrVar = dqjVar != null ? dqjVar.b : null;
            int i5 = i2 & 14;
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (i5 == 4 || objR == ayb.a) {
                objR = new vl(this, (uhb) null, 11);
                aygVar.ac(objR);
            }
            azb.f(azrVar, (uiu) objR, aycVarC);
            if (azrVar == null || (dkfVar = (dkf) azrVar.a()) == null || !dkfVar.d()) {
                aycVarC.u(-1508691570);
                ufg ufgVar = ufg.a;
                Object objR2 = aygVar.R();
                if (i5 == 4 || objR2 == ayb.a) {
                    objR2 = new crd(this, (uhb) null, 12);
                    aygVar.ac(objR2);
                }
                azb.f(ufgVar, (uiu) objR2, aycVarC);
                aygVar.Y();
            } else {
                aycVarC.u(-1508768698);
                aygVar.Y();
                this.a.b(new dqq(i4));
            }
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ape(this, i, 6);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection] */
    public final void h(Object obj) {
        Collection.EL.removeIf(this.c, new fme(new dlz(obj, 11), 1));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, uif] */
    public final Object i(Object obj) {
        if (obj == null) {
            return null;
        }
        dmp dmpVar = (dmp) ((zu) this.a).a(obj);
        if (dmpVar != null) {
            return dmpVar.b;
        }
        dlm dlmVar = (dlm) this.b.a();
        int iA = dlmVar.a(obj);
        if (iA == -1) {
            return null;
        }
        return dlmVar.c(iA);
    }

    public final uiu j(int i, Object obj, Object obj2) {
        zu zuVar = (zu) this.a;
        dmp dmpVar = (dmp) zuVar.a(obj);
        if (dmpVar != null && dmpVar.c == i && a.ao(dmpVar.b, obj2)) {
            return dmpVar.a();
        }
        dmp dmpVar2 = new dmp(this, i, obj, obj2);
        zuVar.j(obj, dmpVar2);
        return dmpVar2.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v0, types: [tdy] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6, types: [uxa] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.uiq r6, defpackage.uhb r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.csj
            if (r0 == 0) goto L13
            r0 = r7
            csj r0 = (defpackage.csj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csj r0 = new csj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.a
            uxa r5 = (defpackage.uxa) r5
            defpackage.rnt.aN(r7)     // Catch: java.lang.Throwable -> L2e
            goto L64
        L2e:
            r6 = move-exception
            goto L6a
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            uxa r5 = r0.d
            java.lang.Object r6 = r0.a
            uiq r6 = (defpackage.uiq) r6
            defpackage.rnt.aN(r7)
            goto L56
        L42:
            defpackage.rnt.aN(r7)
            java.lang.Object r5 = r5.b
            r0.a = r6
            r7 = r5
            uxa r7 = (defpackage.uxa) r7
            r0.d = r7
            r0.c = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 == r1) goto L70
        L56:
            r0.a = r5     // Catch: java.lang.Throwable -> L2e
            r7 = 0
            r0.d = r7     // Catch: java.lang.Throwable -> L2e
            r0.c = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r6.a(r0)     // Catch: java.lang.Throwable -> L2e
            if (r7 != r1) goto L64
            goto L70
        L64:
            uxa r5 = (defpackage.uxa) r5
            r5.d()
            return r7
        L6a:
            uxa r5 = (defpackage.uxa) r5
            r5.d()
            throw r6
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tdy.k(uiq, uhb):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.uiu r7, defpackage.uhb r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.csk
            if (r0 == 0) goto L13
            r0 = r8
            csk r0 = (defpackage.csk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csk r0 = new csk
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r6 = r0.a
            uxa r7 = r0.d
            defpackage.rnt.aN(r8)     // Catch: java.lang.Throwable -> L2b
            goto L58
        L2b:
            r8 = move-exception
            goto L66
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.rnt.aN(r8)
            java.lang.Object r6 = r6.b
            r8 = r6
            uxa r8 = (defpackage.uxa) r8
            boolean r8 = r8.c()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L61
            r4 = r6
            uxa r4 = (defpackage.uxa) r4     // Catch: java.lang.Throwable -> L61
            r0.d = r4     // Catch: java.lang.Throwable -> L61
            r0.a = r8     // Catch: java.lang.Throwable -> L61
            r0.c = r3     // Catch: java.lang.Throwable -> L61
            java.lang.Object r7 = r7.a(r2, r0)     // Catch: java.lang.Throwable -> L61
            if (r7 == r1) goto L60
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L58:
            if (r6 == 0) goto L5f
            uxa r7 = (defpackage.uxa) r7
            r7.d()
        L5f:
            return r8
        L60:
            return r1
        L61:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L66:
            if (r6 == 0) goto L6d
            uxa r7 = (defpackage.uxa) r7
            r7.d()
        L6d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tdy.l(uiu, uhb):java.lang.Object");
    }

    public final Object m() {
        return new Integer(((pfl) this.a).s());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bbo, java.lang.Object] */
    public final boolean n() {
        if (this.a.a() != this.b) {
            return true;
        }
        Object obj = this.c;
        return obj != null && ((tdy) obj).n();
    }

    public final Location o(String str) {
        try {
            Object obj = this.b;
            if (((LocationManager) obj).isProviderEnabled(str)) {
                return ((LocationManager) obj).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final synchronized void p(AmbientModeSupport.AmbientController ambientController) {
        ((rqs) this.c).b(ambientController);
    }

    public final synchronized void q(AmbientModeSupport.AmbientController ambientController) {
        ((rqs) this.c).c(ambientController);
    }

    public tdy(eqa eqaVar, Object obj, eqm eqmVar) {
        this.b = eqaVar;
        this.a = obj;
        this.c = eqmVar;
    }

    public tdy(Class cls, Class cls2, evh evhVar) {
        this.a = cls;
        this.b = cls2;
        this.c = evhVar;
    }

    public tdy(Class cls, Class cls2, eyn eynVar) {
        this.b = cls;
        this.a = cls2;
        this.c = eynVar;
    }

    public tdy(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public tdy(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public tdy(qbq qbqVar, puu puuVar, qbv qbvVar) {
        this.c = qbqVar;
        this.b = puuVar;
        this.a = qbvVar;
    }

    public tdy(rlo rloVar, View view) {
        this.c = new rlr();
        this.a = rloVar;
        this.b = view;
    }

    public tdy(Context context, rwc rwcVar, Executor executor) {
        this.a = executor;
        this.b = tql.g(executor);
        this.c = new tql(executor, new qcz(rwcVar, context, 0));
    }

    public tdy(eqi eqiVar, eqv eqvVar) {
        List list = Collections.EMPTY_LIST;
        eoz.k(eqiVar);
        this.c = eqiVar;
        eoz.k(list);
        this.a = list;
        eoz.k(eqvVar);
        this.b = eqvVar;
    }

    public tdy(Object obj, xm xmVar) {
        this.a = obj;
        umc umcVar = umc.a;
        this.b = new ulz(1, umcVar);
        this.c = new umb(xmVar, umcVar);
    }

    public tdy(rqh rqhVar, rqs rqsVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.a = rqhVar;
        this.c = rqsVar;
        this.b = context;
    }

    public tdy(uem uemVar, uem uemVar2, uem uemVar3) {
        uemVar.getClass();
        this.a = uemVar;
        uemVar2.getClass();
        this.b = uemVar2;
        uemVar3.getClass();
        this.c = uemVar3;
    }

    public tdy(uem uemVar, uem uemVar2, uem uemVar3, byte[] bArr, byte[] bArr2) {
        uemVar.getClass();
        this.b = uemVar;
        uemVar2.getClass();
        this.c = uemVar2;
        uemVar3.getClass();
        this.a = uemVar3;
    }

    public tdy(bbo bboVar, tdy tdyVar) {
        this.a = bboVar;
        this.c = tdyVar;
        this.b = bboVar.a();
    }

    public tdy() {
        this.b = new uxa();
        this.a = new pfl((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        this.c = new urd(new byo((uhb) null, 2, (char[]) null));
    }

    public tdy(uem uemVar, uem uemVar2, uem uemVar3, byte[] bArr) {
        uemVar.getClass();
        this.a = uemVar;
        uemVar2.getClass();
        this.c = uemVar2;
        this.b = uemVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tdy(defpackage.cvj r21, defpackage.cvj r22) {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tdy.<init>(cvj, cvj):void");
    }

    public tdy(bfs bfsVar, uif uifVar) {
        this.c = bfsVar;
        this.b = uifVar;
        long[] jArr = zv.a;
        this.a = new zu((byte[]) null);
    }

    public tdy(uiu uiuVar) {
        this.b = uiuVar;
        this.a = new azz(new dqq(0), bap.c);
        this.c = new bgz();
    }

    public tdy(dwk dwkVar) {
        this(dwkVar.a, dwkVar.b, dwkVar.c);
    }

    public tdy(UUID uuid, ebx ebxVar, Set set) {
        uuid.getClass();
        ebxVar.getClass();
        this.b = uuid;
        this.a = ebxVar;
        this.c = set;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    public tdy(List list) {
        this.c = list;
        this.b = new ArrayList(list.size());
        this.a = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.b.add(((eil) ((fei) list.get(i)).c).a());
            this.a.add(((eih) ((fei) list.get(i)).d).a());
        }
    }
}
