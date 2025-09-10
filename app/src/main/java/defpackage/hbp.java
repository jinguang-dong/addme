package defpackage;

import android.content.ContentProvider;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.graphics.PointF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import androidx.wear.ambient.AmbientMode;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbp {
    public final Object a;
    public final Object b;
    public final Object c;

    public hbp(izm izmVar, izc izcVar, izh izhVar) {
        this.a = izmVar;
        this.b = izcVar;
        this.c = izhVar;
    }

    public static void b(Context context) {
        File file = new File(context.getNoBackupFilesDir(), "/ff.pb");
        if (file.exists()) {
            file.delete();
        }
        File file2 = new File(context.getNoBackupFilesDir(), "/ff.pb_tmp");
        if (file2.exists()) {
            file2.delete();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable, java.lang.Object] */
    private final foy u() {
        Object next;
        foy foyVar;
        synchronized (this) {
            Iterator it = this.b.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    Instant instant = ((fmf) next).a;
                    do {
                        Object next2 = it.next();
                        Instant instant2 = ((fmf) next2).a;
                        int iCompareTo = instant.compareTo(instant2);
                        if (iCompareTo < 0) {
                            instant = instant2;
                        }
                        if (iCompareTo < 0) {
                            next = next2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            fmf fmfVar = (fmf) next;
            foyVar = fmfVar != null ? fmfVar.b : null;
        }
        return foyVar;
    }

    public final int a() {
        return ((hbj) this.c).p(gym.t) ? 3 : 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, swb] */
    public final synchronized paq c(foy foyVar) {
        fme fmeVar = new fme(new dlz(foyVar, 17), 2);
        ?? r0 = this.b;
        Collection.EL.removeIf(r0, fmeVar);
        Instant instantA = this.c.a();
        instantA.getClass();
        r0.add(new fmf(foyVar, instantA));
        ((ovx) this.a).a(Optional.ofNullable(u()));
        return new fid(this, foyVar, 4, null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    public final synchronized void d(foy foyVar) {
        Collection.EL.removeIf(this.b, new fme(new dlz(foyVar, 16), 0));
        ((ovx) this.a).a(Optional.ofNullable(u()));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.animation.Interpolator, java.lang.Object] */
    public final float e(float f) {
        PointF pointF = (PointF) this.c;
        float f2 = pointF.x;
        PointF pointF2 = (PointF) this.b;
        return (this.a.getInterpolation((ske.aj(f, f2, pointF2.x) - pointF.x) / (pointF2.x - pointF.x)) * (pointF2.y - pointF.y)) + pointF.y;
    }

    public final boolean f(Class cls, Class cls2) {
        return ((Class) this.b).isAssignableFrom(cls) && cls2.isAssignableFrom((Class) this.a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final klc g(long j) {
        synchronized (this.b) {
            ?? r1 = this.a;
            Long lValueOf = Long.valueOf(j);
            if (!r1.containsKey(lValueOf)) {
                return new klc();
            }
            klc klcVar = (klc) r1.get(lValueOf);
            klcVar.getClass();
            return klcVar;
        }
    }

    public final boolean h() {
        return l(Integer.class, CaptureResult.EDGE_MODE, 0, scn.I(1, 2, 3), new sfm(2));
    }

    public final boolean i() {
        return !((ejt) this.a).t().p(CaptureResult.FLASH_STATE, 3, 4);
    }

    public final boolean j() {
        return ((kko) this.b).b.size() == 1;
    }

    public final boolean k() {
        return l(Integer.class, CaptureResult.NOISE_REDUCTION_MODE, 0, scn.I(2, 1, 4), new sfm(2));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final boolean l(Class cls, CaptureResult.Key key, Object obj, Set set, Set set2) {
        ejt ejtVar = (ejt) this.a;
        boolean z = ejtVar.u().a.size() == 0;
        return (z && ejtVar.t().p(key, ujp.aV(set, cls))) || (!z && ejtVar.t().o(key, obj) && ejtVar.u().p(key, ujp.aV(set2, cls))) || (!z && ejtVar.t().p(key, ujp.aV(set, cls)) && ejtVar.u().o(key, obj));
    }

    public final boolean m(kkq... kkqVarArr) {
        return Arrays.asList(kkqVarArr).contains(((kko) this.b).a);
    }

    public final boolean n(Integer... numArr) {
        return Arrays.asList(numArr).contains(((pkb) this.c).m(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final syu o() {
        return ske.E((Iterable) Collection.EL.stream(this.c).map(new idh(this, 9)).collect(ryv.b)).a(new ire(3), this.a);
    }

    public final void p(syu syuVar, jle jleVar) {
        r(syuVar, jleVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, pvu] */
    public final syu q() {
        rvk rvkVar = rvk.a;
        return this.b.c(new puv(rvkVar, rvkVar));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void r(syu syuVar, jle jleVar) {
        if (jleVar == null) {
            jleVar = new jle();
        }
        ske.W(syuVar, jleVar, this.a);
    }

    public final AssetFileDescriptor s(String str) {
        return ((Context) this.a).getAssets().openFd(str);
    }

    public final synchronized AmbientMode.AmbientController t() {
        if (((AtomicInteger) this.a).getAndIncrement() == 0) {
            Object obj = this.c;
            ((hwt) this.b).f(new pas(((pas) obj).a, ((pas) obj).b), "mv-gyro-session");
        }
        return new AmbientMode.AmbientController(this, null);
    }

    public hbp(izm izmVar, izc izcVar, izh izhVar, byte[] bArr) {
        this.b = izmVar;
        this.a = izcVar;
        this.c = izhVar;
    }

    public hbp(Class cls, Class cls2, eqo eqoVar) {
        this.b = cls;
        this.a = cls2;
        this.c = eqoVar;
    }

    public hbp(Object obj, Object obj2, Object obj3) {
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public hbp(kgw kgwVar, ejt ejtVar, kko kkoVar) {
        this.c = kgwVar;
        this.a = ejtVar;
        this.b = kkoVar;
    }

    public hbp(mdy mdyVar, owf owfVar, fyw fywVar) {
        this.c = mdyVar;
        this.b = owfVar;
        this.a = fywVar;
    }

    public hbp(qfc qfcVar, qfc qfcVar2, qfc qfcVar3) {
        this.a = qfcVar;
        this.b = qfcVar2;
        this.c = qfcVar3;
    }

    public hbp(ejt ejtVar) {
        this.c = ejtVar;
        this.b = new Object();
        this.a = new HashMap();
    }

    public hbp(hwt hwtVar, pas pasVar) {
        this.a = new AtomicInteger(0);
        this.b = hwtVar;
        this.c = pasVar;
    }

    public hbp(rwc rwcVar, hbj hbjVar, fyw fywVar) {
        hbjVar.getClass();
        fywVar.getClass();
        this.b = rwcVar;
        this.c = hbjVar;
        this.a = fywVar;
    }

    public hbp(swb swbVar) {
        swbVar.getClass();
        this.c = swbVar;
        this.a = new ovx(Optional.empty());
        this.b = new LinkedHashSet();
    }

    public hbp(syw sywVar, sbp sbpVar, pvu pvuVar) {
        this.a = sywVar;
        this.c = sbpVar;
        this.b = pvuVar;
        ske.W(pvuVar.f(), new jle(), sywVar);
    }

    public hbp(ContentProvider contentProvider, ProviderInfo providerInfo) {
        this.a = contentProvider;
        this.b = providerInfo;
        Context context = contentProvider.getContext();
        context.getClass();
        this.c = context;
    }

    public hbp(Context context, owq owqVar, mdy mdyVar) {
        this.c = context;
        this.a = owqVar;
        this.b = mdyVar;
        if (((Boolean) owqVar.dL()).booleanValue()) {
            return;
        }
        gzi gziVar = gzb.a;
        b(context);
    }

    public hbp(hbj hbjVar, Context context) {
        this.a = context;
        String strF = hbjVar.f(hab.i);
        strF.getClass();
        this.c = strF;
        String strF2 = hbjVar.f(hab.j);
        strF2.getClass();
        this.b = strF2;
    }
}
