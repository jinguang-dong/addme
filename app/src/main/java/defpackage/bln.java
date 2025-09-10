package defpackage;

import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bln extends bks {
    private Shader a;
    private long b = 9205357640488583168L;

    @Override // defpackage.bks
    public final void a(long j, fnd fndVar, float f) {
        Shader shaderB = this.a;
        if (shaderB == null || !a.q(this.b, j)) {
            if (bki.d(j)) {
                shaderB = null;
                this.a = null;
                this.b = 9205357640488583168L;
            } else {
                shaderB = b(j);
                this.a = shaderB;
                this.b = j;
            }
        }
        long jH = fndVar.h();
        long j2 = bkv.a;
        if (!a.q(jH, j2)) {
            fndVar.k(j2);
        }
        if (!a.ao(fndVar.c, shaderB)) {
            fndVar.n(shaderB);
        }
        if (fndVar.b() == f) {
            return;
        }
        fndVar.i(f);
    }

    public abstract Shader b(long j);
}
