package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fcj implements lpc {
    private final lpd a;
    private final pfu b;

    public fcj(lpd lpdVar, pfu pfuVar) {
        this.a = lpdVar;
        this.b = pfuVar;
    }

    private final void e(int i) {
        CaptureRequest.Key key = nvm.h;
        if (key != null) {
            this.b.m(key, Integer.valueOf(i));
        }
    }

    @Override // defpackage.lpc
    public final void b(boolean z) {
        if (!z) {
            e(0);
        } else {
            if (this.a.d()) {
                return;
            }
            e(Integer.MAX_VALUE);
        }
    }

    @Override // defpackage.lpc
    public final void c(float f) {
        lpd lpdVar = this.a;
        if (lpdVar.a && lpdVar.d()) {
            e(Math.round(f) * 100);
        }
    }

    @Override // defpackage.lpc
    public final void a(int i) {
    }

    @Override // defpackage.lpc
    public final void d(float f) {
    }
}
