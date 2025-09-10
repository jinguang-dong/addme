package defpackage;

import android.opengl.GLES20;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jem extends jdr {
    public ShortBuffer i;
    public int f = 0;
    public int g = 0;
    public boolean h = false;
    public jdt j = null;
    public final ArrayList k = new ArrayList();
    public boolean l = true;
    public boolean m = true;

    public final void b() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ood oodVar = (ood) arrayList.get(i);
            if (oodVar != null) {
                oodVar.c();
            }
        }
        arrayList.clear();
    }

    @Override // defpackage.jdr
    public final void c(float[] fArr) throws jds {
        jdt jdtVar;
        if (this.h) {
            if (this.m) {
                this.e.c();
                this.e.g(this.a);
                this.e.e(this.b);
                this.e.f(fArr);
                Vector vector = this.d;
                if (!vector.isEmpty()) {
                    ((ood) vector.get(0)).d();
                }
                this.c.position(0);
                GLES20.glDrawElements(4, this.f, 5123, this.c);
            }
            if (!this.l || (jdtVar = this.j) == null) {
                return;
            }
            jdtVar.c();
            this.j.g(this.a);
            this.j.f(fArr);
            this.i.position(0);
            GLES20.glLineWidth(9.0f);
            GLES20.glDrawElements(2, this.g, 5123, this.i);
            GLES20.glDrawElements(0, this.g, 5123, this.i);
        }
    }

    public final void e(int i) {
        Vector vector = this.d;
        if (vector.isEmpty()) {
            return;
        }
        ((ood) vector.get(0)).a = i;
    }
}
