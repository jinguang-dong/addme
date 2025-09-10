package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qje implements qjh {
    final /* synthetic */ String a;
    final /* synthetic */ float[] b;
    private final /* synthetic */ int c;

    public qje(String str, float[] fArr, int i) {
        this.c = i;
        this.a = str;
        this.b = fArr;
    }

    @Override // defpackage.qjh
    public final void a(qkg qkgVar) {
        if (this.c != 0) {
            GLES20.glUniformMatrix4fv(qkgVar.b(this.a), 1, false, this.b, 0);
        } else {
            GLES20.glUniformMatrix2fv(qkgVar.b(this.a), 1, false, this.b, 0);
        }
    }

    public qje(float[] fArr, int i) {
        this.c = i;
        this.a = "u_PlaneUvMatrix";
        this.b = fArr;
    }
}
