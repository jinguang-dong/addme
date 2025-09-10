package defpackage;

import android.view.SurfaceView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ngg implements rww {
    public final /* synthetic */ ngk a;
    public final /* synthetic */ SurfaceView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    private final /* synthetic */ int e;

    public /* synthetic */ ngg(ngk ngkVar, SurfaceView surfaceView, int i, int i2, int i3) {
        this.e = i3;
        this.a = ngkVar;
        this.b = surfaceView;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.rww
    public final Object fr() {
        if (this.e != 0) {
            ngk ngkVar = this.a;
            int i = this.d;
            return ngk.b(this.b, this.c, i, ngkVar.e);
        }
        ngk ngkVar2 = this.a;
        int i2 = this.d;
        return ngk.b(this.b, this.c, i2, ngkVar2.e);
    }
}
