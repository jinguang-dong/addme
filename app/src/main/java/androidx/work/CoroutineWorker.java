package androidx.work;

import android.content.Context;
import defpackage.a;
import defpackage.cij;
import defpackage.crd;
import defpackage.dvw;
import defpackage.dwi;
import defpackage.syu;
import defpackage.uhb;
import defpackage.uhf;
import defpackage.una;
import defpackage.uon;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class CoroutineWorker extends dwi {
    private final WorkerParameters e;
    private final una f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = dvw.a;
    }

    @Override // defpackage.dwi
    public final syu a() {
        uhf uhfVar = this.f;
        if (a.ao(uhfVar, dvw.a)) {
            uhfVar = this.e.d;
        }
        uhfVar.getClass();
        return cij.q(uhfVar.plus(new uon(null)), new crd(this, (uhb) null, 14));
    }

    public abstract Object b(uhb uhbVar);
}
