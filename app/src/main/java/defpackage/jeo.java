package defpackage;

import android.opengl.Matrix;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jeo extends jdr {
    public final jem i;
    private jff m;
    public final float[] f = new float[16];
    public final float[] g = new float[16];
    public final float[] h = new float[16];
    private final float[] k = new float[16];
    private final nng l = new nng();
    private double n = -1.0d;
    public final Vector j = new Vector();

    public final int b() {
        return this.j.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003a  */
    @Override // defpackage.jdr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(float[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jeo.c(float[]):void");
    }

    public final void e(int i, boolean z) {
        Vector vector = this.j;
        if (i < vector.size()) {
            ((jen) vector.get(i)).g = z;
        }
    }

    public jeo(jem jemVar) {
        this.i = jemVar;
        try {
            this.m = new jff();
            jds.a(mNLbzhCxd.KXzY);
        } catch (jds e) {
            e.printStackTrace();
        }
        Matrix.setIdentityM(this.h, 0);
        Matrix.rotateM(this.h, 0, 180.0f, 1.0f, 0.0f, 0.0f);
    }
}
