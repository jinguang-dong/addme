package defpackage;

import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class htv {
    public static final sgv a = sgv.g(mPfBwqXsnpXI.JFqWEFzdgT);
    public final rwc b;
    public final rwc c;
    public final owq d;
    public hzs e;
    public hui f;
    public final Map g;
    public final Set h;
    public final Set i;
    public final Map j;
    public final List k;
    public ltd l;
    public huc m;
    public htw n;
    public AmbientModeSupport.AmbientController o;
    private final Executor p;
    private int q;
    private final nhz r;

    public htv(nhz nhzVar, rwc rwcVar, rwc rwcVar2, hbj hbjVar, Executor executor, owq owqVar) {
        rwcVar2.getClass();
        hbjVar.getClass();
        executor.getClass();
        owqVar.getClass();
        this.r = nhzVar;
        this.b = rwcVar;
        this.c = rwcVar2;
        this.p = executor;
        this.d = owqVar;
        this.g = new LinkedHashMap();
        this.h = new LinkedHashSet();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashMap();
        this.k = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, lss] */
    public static final void c(iby ibyVar, htv htvVar) {
        ibyVar.a();
        htvVar.l = null;
        try {
            ibyVar.x.b.I();
        } catch (UnsupportedOperationException unused) {
        }
        gga ggaVar = ibyVar.x;
        ggaVar.b.b(new hhe());
        hzs hzsVar = htvVar.e;
        if (hzsVar != null) {
            hzsVar.l(ibyVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, uem] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.huw r29, defpackage.pas r30, boolean r31, defpackage.tcd r32, defpackage.iog r33, float r34, defpackage.uhb r35) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.htv.a(huw, pas, boolean, tcd, iog, float, uhb):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, lss] */
    public final void b(ltd ltdVar) {
        byte[] bArr;
        Object next;
        Iterator it = this.k.iterator();
        while (true) {
            bArr = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((iby) next).x.b.l().equals(ltdVar)) {
                    break;
                }
            }
        }
        iby ibyVar = (iby) next;
        if (ibyVar == null) {
            ((sgt) a.c().M(1538)).v("cancelCapturingShot called on unknown %s", ltdVar);
        } else {
            this.p.execute(new hdk(ibyVar, this, 15, bArr));
        }
    }

    public final void d() {
        this.i.clear();
        Map map = this.j;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((htx) it.next()).close();
        }
        map.clear();
        this.k.clear();
        this.l = null;
    }

    public final void e(int i) {
        htx htxVar;
        Set set = this.i;
        Integer numValueOf = Integer.valueOf(i);
        if (!set.contains(numValueOf) || (htxVar = (htx) this.j.remove(numValueOf)) == null) {
            return;
        }
        htxVar.run();
    }

    public final boolean f() {
        return this.f != null;
    }
}
