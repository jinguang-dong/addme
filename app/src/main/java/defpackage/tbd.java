package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.geo.lightfield.processing.ProgressCallback;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbd extends Handler {
    public final WeakReference a;
    public float b;
    public float c;

    public tbd(ProgressCallback progressCallback, Looper looper) {
        super(looper);
        this.b = 0.0f;
        this.c = 0.0f;
        this.a = new WeakReference(progressCallback);
    }

    public final void a() {
        sendMessageDelayed(obtainMessage(1, 0, 0), 250L);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r6) {
        /*
            r5 = this;
            int r6 = r6.what
            r0 = 2
            if (r6 != r0) goto L14
            r6 = 1
            r5.removeMessages(r6)
            r5 = 0
            defpackage.tbe.a = r5
            android.os.Looper r5 = android.os.Looper.myLooper()
            r5.quitSafely()
            return
        L14:
            java.lang.ref.WeakReference r6 = r5.a
            java.lang.Object r6 = r6.get()
            com.google.geo.lightfield.processing.ProgressCallback r6 = (com.google.geo.lightfield.processing.ProgressCallback) r6
            if (r6 != 0) goto L1f
            return
        L1f:
            float r0 = r5.c
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 0
            if (r0 != 0) goto L2e
            float r0 = r5.c
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L34
        L2e:
            float r0 = r5.b
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L58
        L34:
            float r0 = r5.b
            r1 = 1065185444(0x3f7d70a4, float:0.99)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L3e
            goto L58
        L3e:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = r1 - r0
            r3 = 1061158912(0x3f400000, float:0.75)
            float r2 = r2 * r3
            r3 = 1028443341(0x3d4ccccd, float:0.05)
            float r3 = r3 * r0
            float r4 = r5.c
            float r2 = r2 + r3
            float r3 = r2 * r4
            float r1 = r1 - r2
            float r0 = r0 * r1
            float r3 = r3 + r0
            float r0 = java.lang.Math.max(r4, r3)
            r5.c = r0
            goto L5c
        L58:
            float r0 = r5.b
            r5.c = r0
        L5c:
            r6.setProgress(r0)
            r5.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tbd.handleMessage(android.os.Message):void");
    }
}
