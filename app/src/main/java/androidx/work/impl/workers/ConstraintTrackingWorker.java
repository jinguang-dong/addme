package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.crd;
import defpackage.uhb;
import defpackage.ujp;
import defpackage.ung;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    private final WorkerParameters e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object b(uhb uhbVar) {
        return ung.s(ujp.aa(d()), new crd(this, (uhb) null, 17), uhbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.uhb r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.g(uhb):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.dwi r5, defpackage.ejs r6, defpackage.ebx r7, defpackage.uhb r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.edm
            if (r0 == 0) goto L13
            r0 = r8
            edm r0 = (defpackage.edm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            edm r0 = new edm
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.a
            uhi r8 = defpackage.uhi.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            defpackage.rnt.aN(r4)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.rnt.aN(r4)
            edn r4 = new edn
            r1 = 0
            r4.<init>(r5, r6, r7, r1)
            r0.c = r2
            java.lang.Object r4 = defpackage.ung.i(r4, r0)
            if (r4 != r8) goto L41
            return r8
        L41:
            r4.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.h(dwi, ejs, ebx, uhb):java.lang.Object");
    }
}
