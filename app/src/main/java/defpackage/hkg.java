package defpackage;

import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.jni.facebeautification.GpuRetoucherNative;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hkg implements npl, paq {
    private static final sgv d = sgv.g("hkg");
    public final owf a;
    private final Executor e;
    public final Object b = new Object();
    public long c = 0;
    private int f = 0;
    private List g = new ArrayList();

    public hkg(Executor executor, owf owfVar) {
        this.a = owfVar;
        this.e = executor;
        executor.execute(new hbv(this, 8));
    }

    @Override // defpackage.npl
    public final npk a(poj pojVar, poj pojVar2) {
        List list = this.g;
        if (this.f > 3 || list.isEmpty()) {
            return npk.SKIPPED;
        }
        synchronized (this.b) {
            if (this.c == 0) {
                return npk.SKIPPED;
            }
            try {
                HardwareBuffer hardwareBufferF = pojVar.f();
                try {
                    syv syvVar = new syv(new pyd(this, hardwareBufferF, pojVar, list, 1));
                    this.e.execute(syvVar);
                    npk npkVar = (npk) syvVar.get();
                    if (hardwareBufferF != null) {
                        hardwareBufferF.close();
                    }
                    return npkVar;
                } finally {
                }
            } catch (InterruptedException | ExecutionException e) {
                ((sgt) ((sgt) d.b().i(e)).M(1332)).s("Failed to apply live face retouch");
                return npk.SKIPPED;
            }
        }
    }

    @Override // defpackage.npl
    public final npk b(pdk pdkVar, peo peoVar, pdk pdkVar2) {
        poe poeVarD = pdkVar.d();
        if (poeVarD == null) {
            this.f++;
            ((sgt) d.c().M(1333)).t("Using previous faceMetadata: metadata missed for %d consecutive frames.", this.f);
        } else {
            this.f = 0;
            this.g = ezh.ag(poeVarD);
        }
        poj pojVarE = pdkVar.e(peoVar);
        try {
            poj pojVarE2 = pdkVar2.e(peoVar);
            try {
                pojVarE.getClass();
                pojVarE2.getClass();
                npk npkVarA = a(pojVarE, pojVarE2);
                pojVarE2.close();
                pojVarE.close();
                return npkVarA;
            } finally {
            }
        } catch (Throwable th) {
            if (pojVarE != null) {
                try {
                    pojVarE.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.npl
    public final npm c() {
        return npm.FACE_BEAUTIFICATION;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b) {
            long j = this.c;
            if (j == 0) {
                return;
            }
            GpuRetoucherNative.releaseRetoucher(j);
            this.c = 0L;
        }
    }

    @Override // defpackage.npl
    public final /* synthetic */ qin d() {
        return null;
    }

    @Override // defpackage.npl
    public final /* synthetic */ String e() {
        return jsv.A(this);
    }

    @Override // defpackage.npl
    public final boolean q() {
        return this.a.dL() != ltr.OFF;
    }

    @Override // defpackage.npl
    public final /* synthetic */ npk s(qjn qjnVar, qim qimVar) {
        return jsv.B();
    }
}
