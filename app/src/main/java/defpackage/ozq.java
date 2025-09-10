package defpackage;

import android.media.MediaRecorder;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ozq implements MediaRecorder.OnInfoListener {
    final /* synthetic */ oyk a;
    private boolean b;
    private boolean c;

    public ozq(oyk oykVar) {
        this.a = oykVar;
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 801) {
            if (this.c) {
                return;
            }
            this.c = true;
            this.a.f();
            return;
        }
        if (i == 800) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.a.d();
            return;
        }
        if (i == 802) {
            this.a.e();
        } else if (i == 803) {
            this.a.g();
        }
    }
}
