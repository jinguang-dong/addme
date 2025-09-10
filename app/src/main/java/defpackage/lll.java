package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.processing.ProcessingService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lll extends BroadcastReceiver {
    final /* synthetic */ ProcessingService a;

    public lll(ProcessingService processingService) {
        this.a = processingService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.apps.camera.legacy.app.processing.PAUSE".equals(intent.getAction())) {
            ProcessingService processingService = this.a;
            synchronized (processingService.f) {
                processingService.g = false;
            }
            synchronized (processingService.b) {
                processingService.e = true;
                llo lloVar = processingService.d;
                if (lloVar != null) {
                    lloVar.g();
                }
            }
            return;
        }
        if ("com.google.android.apps.camera.legacy.app.processing.RESUME".equals(intent.getAction())) {
            ProcessingService processingService2 = this.a;
            synchronized (processingService2.f) {
                processingService2.g = true;
            }
            synchronized (processingService2.b) {
                processingService2.e = false;
                llo lloVar2 = processingService2.d;
                if (lloVar2 != null) {
                    lloVar2.f();
                }
            }
        }
    }
}
