package defpackage;

import android.content.Context;
import android.hardware.HardwareBuffer;
import android.net.Uri;
import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify2;
import com.google.android.apps.camera.jni.facebeautification.GpuRetoucherNative;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class pyd implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ pyd(hkg hkgVar, HardwareBuffer hardwareBuffer, poj pojVar, List list, int i) {
        this.e = i;
        this.c = hkgVar;
        this.a = hardwareBuffer;
        this.d = pojVar;
        this.b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, qbq] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, qbq] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, qbq] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, poj] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, qbq] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, qbq] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.e;
        int i2 = 0;
        if (i == 0) {
            AtomicInteger atomicInteger = (AtomicInteger) this.b;
            int i3 = atomicInteger.get();
            Object obj = this.a;
            if (i3 > 0) {
                ((qav) obj).k.n(4, atomicInteger.get());
            }
            ?? r0 = this.c;
            qav qavVar = (qav) obj;
            Uri uriAi = qsp.ai((Context) qavVar.i, qavVar.a);
            Iterator it = r0.iterator();
            while (it.hasNext()) {
                try {
                    ((lat) ((qav) obj).f).p((Uri) it.next());
                    i2++;
                    ((qav) obj).k.l(1086);
                } catch (IOException e) {
                    qavVar.k.l(1076);
                    qbu.g(e, "%s: Failed to release unaccounted file!", "ExpirationHandler");
                }
            }
            ?? r14 = this.d;
            int i4 = qbu.a;
            int iA = qavVar.a(uriAi, r14);
            if (iA > 0) {
                qavVar.k.n(5, iA);
            }
            if (i2 <= 0) {
                return null;
            }
            qavVar.k.n(8, i2);
            return null;
        }
        if (i == 1) {
            hkg hkgVar = (hkg) this.c;
            long j = hkgVar.c;
            Object obj2 = this.a;
            obj2.getClass();
            ?? r2 = this.d;
            HardwareBuffer hardwareBuffer = (HardwareBuffer) obj2;
            return GpuRetoucherNative.process(j, hardwareBuffer, true, hardwareBuffer, true, r2.c(), r2.b(), (FaceToBeautify2[]) this.b.toArray(new FaceToBeautify2[0]), ((ltr) hkgVar.a.dL()).f) ? npk.APPLIED : npk.SKIPPED;
        }
        tpc tpcVarM = qwh.a.m();
        boolean zC = tpcVarM.b.C();
        ?? r5 = this.c;
        ?? r6 = this.d;
        ?? r7 = this.b;
        if (!zC) {
            tpcVarM.o();
        }
        Object obj3 = this.a;
        qwh qwhVar = (qwh) tpcVarM.b;
        qwhVar.b = 1 | qwhVar.b;
        qwi qwiVar = (qwi) obj3;
        qwhVar.c = qwiVar.c;
        tpcVarM.G(qwiVar.a);
        tpcVarM.G(qwiVar.b);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        boolean z = qwiVar.d;
        tph tphVar = tpcVarM.b;
        qwh qwhVar2 = (qwh) tphVar;
        qwhVar2.b |= 2;
        qwhVar2.d = z;
        boolean z2 = qwiVar.e;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        qwh qwhVar3 = (qwh) tpcVarM.b;
        qwhVar3.b |= 16;
        qwhVar3.h = z2;
        try {
            rwc rwcVar = (rwc) ske.U(r5);
            if (rwcVar.h()) {
                String str = (String) rwcVar.c();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                qwh qwhVar4 = (qwh) tpcVarM.b;
                qwhVar4.b = 8 | qwhVar4.b;
                qwhVar4.f = str;
            }
        } catch (Exception unused) {
        }
        try {
            List list = (List) ske.U(r6);
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            qwh qwhVar5 = (qwh) tpcVarM.b;
            tpn tpnVar = qwhVar5.g;
            if (!tpnVar.c()) {
                qwhVar5.g = tph.t(tpnVar);
            }
            tnq.e(list, qwhVar5.g);
        } catch (Exception unused2) {
        }
        try {
            rwc rwcVar2 = (rwc) ske.U(r7);
            if (rwcVar2.h()) {
                String str2 = (String) rwcVar2.c();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                qwh qwhVar6 = (qwh) tpcVarM.b;
                qwhVar6.b = 4 | qwhVar6.b;
                qwhVar6.e = str2;
            }
        } catch (Exception unused3) {
        }
        tpe tpeVar = (tpe) qwa.a.m();
        tpeVar.aI(qwh.j, (qwh) tpcVarM.l());
        return (qwa) tpeVar.l();
    }

    public /* synthetic */ pyd(qav qavVar, AtomicInteger atomicInteger, List list, List list2, int i) {
        this.e = i;
        this.a = qavVar;
        this.b = atomicInteger;
        this.c = list;
        this.d = list2;
    }

    public /* synthetic */ pyd(qwi qwiVar, syu syuVar, syu syuVar2, syu syuVar3, int i) {
        this.e = i;
        this.a = qwiVar;
        this.c = syuVar;
        this.d = syuVar2;
        this.b = syuVar3;
    }
}
