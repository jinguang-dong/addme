package defpackage;

import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sym extends swm implements Runnable {
    private syu a;

    public sym(syu syuVar) {
        this.a = syuVar;
    }

    @Override // defpackage.swn
    protected final void d() {
        this.a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        syu syuVar = this.a;
        if (syuVar != null) {
            f(syuVar);
        }
    }

    @Override // defpackage.swn
    protected final String ez() {
        syu syuVar = this.a;
        if (syuVar != null) {
            return a.bx(syuVar, "delegate=[", CZAHo.FEzf);
        }
        return null;
    }
}
