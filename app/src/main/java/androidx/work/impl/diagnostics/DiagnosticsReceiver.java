package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.cpn;
import defpackage.dwj;
import defpackage.dwk;
import defpackage.dws;
import defpackage.dxv;
import defpackage.dyj;
import defpackage.ske;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a = dwj.a("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        dwj.b();
        try {
            dws dwsVarU = cpn.u(context);
            List listBj = ske.bj(new dwk(DiagnosticsWorker.class).d());
            if (listBj.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new dxv((dyj) dwsVarU, null, listBj, null).z();
        } catch (IllegalStateException e) {
            dwj.b();
            Log.e(a, "WorkManager is not initialized", e);
        }
    }
}
