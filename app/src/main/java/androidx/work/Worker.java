package androidx.work;

import android.content.Context;
import defpackage.bsl;
import defpackage.cgh;
import defpackage.cpn;
import defpackage.dwi;
import defpackage.dww;
import defpackage.syu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class Worker extends dwi {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // defpackage.dwi
    public final syu a() {
        return cgh.k(new dww(d(), new bsl(this, 6), 0));
    }

    public abstract cpn b();
}
