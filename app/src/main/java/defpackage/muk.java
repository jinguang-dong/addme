package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.ArraySet;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class muk implements jhh, jhf, jhg, jft {
    public final Activity a;
    private final out f;
    private final dun g;
    private cnh h;
    private final pnk i;
    private final mdy j;
    private final Set e = new ArraySet();
    public boolean d = false;
    public final owq b = new ovx(qpt.bn());
    public final owq c = new ovx(qpt.bn());

    public muk(Activity activity, jgt jgtVar, out outVar, mdy mdyVar, pnk pnkVar) {
        dvn dvnVar;
        duk dukVarZ;
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        this.a = activity;
        this.f = outVar;
        int i = dut.a;
        activity.getClass();
        dvd dvdVar = (dvd) duu.a.a();
        if (dvdVar == null) {
            if (dvq.a == null) {
                ReentrantLock reentrantLock = dvq.b;
                reentrantLock.lock();
                try {
                    if (dvq.a == null) {
                        try {
                            dukVarZ = cij.z();
                        } catch (Throwable unused) {
                        }
                        if (dukVarZ != null && dukVarZ.compareTo(duk.a) >= 0) {
                            dvnVar = new dvn(activity);
                            SidecarInterface sidecarInterface = dvnVar.a;
                            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
                            Class<?> returnType = method != null ? method.getReturnType() : null;
                            if (!a.ao(returnType, Void.TYPE)) {
                                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
                            }
                            SidecarInterface sidecarInterface2 = dvnVar.a;
                            if (sidecarInterface2 != null) {
                                sidecarInterface2.getDeviceState();
                            }
                            SidecarInterface sidecarInterface3 = dvnVar.a;
                            if (sidecarInterface3 != null) {
                                sidecarInterface3.onDeviceStateListenersChanged(true);
                            }
                            SidecarInterface sidecarInterface4 = dvnVar.a;
                            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
                            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
                            if (!a.ao(returnType2, SidecarWindowLayoutInfo.class)) {
                                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
                            }
                            SidecarInterface sidecarInterface5 = dvnVar.a;
                            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
                            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
                            if (!a.ao(returnType3, Void.TYPE)) {
                                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
                            }
                            SidecarInterface sidecarInterface6 = dvnVar.a;
                            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
                            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
                            if (!a.ao(returnType4, Void.TYPE)) {
                                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
                            }
                            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                            try {
                                sidecarDeviceState.posture = 3;
                            } catch (NoSuchFieldError unused2) {
                                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                                objInvoke.getClass();
                                if (((Integer) objInvoke).intValue() != 3) {
                                    throw new Exception("Invalid device posture getter/setter");
                                }
                            }
                            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
                            Rect rect = sidecarDisplayFeature.getRect();
                            rect.getClass();
                            sidecarDisplayFeature.setRect(rect);
                            sidecarDisplayFeature.getType();
                            sidecarDisplayFeature.setType(1);
                            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
                            try {
                                List list = sidecarWindowLayoutInfo.displayFeatures;
                            } catch (NoSuchFieldError unused3) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(sidecarDisplayFeature);
                                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                                objInvoke2.getClass();
                                if (!a.ao(arrayList, (List) objInvoke2)) {
                                    throw new Exception("Invalid display feature getter/setter");
                                }
                            }
                        } else {
                            dvnVar = null;
                        }
                        dvq.a = new dvq(dvnVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            dvdVar = dvq.a;
            dvdVar.getClass();
        }
        new dvc(null);
        int i2 = dug.a;
        dug.a();
        this.g = new dun(new dux(dvdVar));
        this.j = mdyVar;
        this.i = pnkVar;
        ins.g(outVar, jgtVar, this);
    }

    public final void a(muj mujVar) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((muh) it.next()).a();
        }
        this.b.a(mujVar);
        this.c.a(mujVar);
    }

    public final void b(muj mujVar) {
        pnk pnkVar = this.i;
        int i = pnkVar.a() != null ? pnkVar.a().e : 0;
        mdy mdyVar = this.j;
        spo spoVarBq = qpt.bq(this.a.isInMultiWindowMode(), i, mujVar.b);
        tpc tpcVarM = sqf.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sqf sqfVar = (sqf) tpcVarM.b;
        spoVarBq.getClass();
        sqfVar.c = spoVarBq;
        sqfVar.b |= 1;
        tpc tpcVarM2 = sod.a.m();
        soc socVar = soc.FOLD_STATE_EVENT;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sod sodVar = (sod) tpcVarM2.b;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        sqf sqfVar2 = (sqf) tpcVarM.l();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sod sodVar2 = (sod) tpcVarM2.b;
        sqfVar2.getClass();
        sodVar2.aw = sqfVar2;
        sodVar2.d |= 4194304;
        mdyVar.I(tpcVarM2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [urk] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.jhf
    public final void ej() {
        bn bnVar = new bn(this, 9);
        this.h = bnVar;
        Activity activity = this.a;
        activity.getClass();
        out outVar = this.f;
        outVar.getClass();
        dun dunVar = this.g;
        urf urfVar = new urf(new duw((dux) dunVar.a, activity, (uhb) null, 0));
        una unaVar = unr.a;
        uoz uozVar = uvw.a;
        if (uozVar.get(uol.c) != null) {
            Objects.toString(uozVar);
            throw new IllegalArgumentException("Flow context cannot contain job in it. Had ".concat(String.valueOf(uozVar)));
        }
        urf urfVarX = urfVar;
        if (!a.ao(uozVar, uhg.a)) {
            urfVarX = ung.x(urfVar, uozVar, 0, 6);
        }
        byz byzVar = dunVar.b;
        ?? r3 = byzVar.b;
        r3.lock();
        try {
            ?? r8 = byzVar.a;
            if (r8.get(bnVar) == null) {
                r8.put(bnVar, ukc.C(ung.j(ujp.aa(outVar)), null, 0, new ve(urfVarX, bnVar, (uhb) null, 6), 3));
            }
        } finally {
            r3.unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.jhg
    public final void eu() {
        cnh cnhVar = this.h;
        if (cnhVar != null) {
            byz byzVar = this.g.b;
            ?? r1 = byzVar.b;
            r1.lock();
            try {
                ?? r3 = byzVar.a;
                uol uolVar = (uol) r3.get(cnhVar);
                if (uolVar != null) {
                    uolVar.s(null);
                }
            } finally {
                r1.unlock();
            }
        }
    }

    @Override // defpackage.jft
    public final void j(Configuration configuration) {
        int i = configuration.screenLayout & 15;
        if (this.a.isInMultiWindowMode() || !this.d) {
            return;
        }
        muj mujVarBl = i == 2 ? qpt.bl() : qpt.bm();
        a(mujVarBl);
        b(mujVarBl);
        this.d = false;
    }
}
