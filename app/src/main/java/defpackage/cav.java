package defpackage;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cav implements ScrollCaptureCallback {
    public final cbr a;
    public final caz b;
    public final ocq c;
    private final chz d;
    private final View e;
    private final und f;

    public cav(cbr cbrVar, chz chzVar, und undVar, ocq ocqVar, View view) {
        this.a = cbrVar;
        this.d = chzVar;
        this.c = ocqVar;
        this.e = view;
        this.f = new uvc(((uvc) undVar).a.plus(cax.b));
        this.b = new caz(chzVar.a(), new cau(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.view.ScrollCaptureSession r11, defpackage.chz r12, defpackage.uhb r13) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cav.a(android.view.ScrollCaptureSession, chz, uhb):java.lang.Object");
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureEnd(Runnable runnable) {
        ukc.C(this.f, upb.a, 0, new aej(this, runnable, (uhb) null, 20), 2);
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final uol uolVarC = ukc.C(this.f, null, 0, new dnl(this, scrollCaptureSession, rect, consumer, (uhb) null, 1), 3);
        uolVarC.o(new aaw(cancellationSignal, 17));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: caw
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                uolVarC.s(null);
            }
        });
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(blb.d(this.d));
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.b.b = 0.0f;
        this.c.au(true);
        runnable.run();
    }
}
