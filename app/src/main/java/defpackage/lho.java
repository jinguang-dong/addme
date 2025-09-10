package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.Trace;
import com.google.android.apps.camera.prewarm.ProcessingBoostService;
import com.google.android.build.data.JKx.wzgaYJqO;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lho extends Handler {
    public final /* synthetic */ ProcessingBoostService a;

    public lho(ProcessingBoostService processingBoostService) {
        this.a = processingBoostService;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            ProcessingBoostService processingBoostService = this.a;
            if (processingBoostService.b == null) {
                Trace.beginSection(wzgaYJqO.JEHwO);
                ((lhp) ((ink) processingBoostService.getApplication()).d(lhp.class)).q(processingBoostService);
                Trace.endSection();
            }
            processingBoostService.b.execute(new lgc(this, 15));
        }
        super.handleMessage(message);
    }
}
