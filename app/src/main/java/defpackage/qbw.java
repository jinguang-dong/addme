package defpackage;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class qbw implements rvu {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ qbw(ngk ngkVar, int i, int i2, SurfaceView surfaceView, int i3) {
        this.e = i3;
        this.d = ngkVar;
        this.b = i;
        this.a = i2;
        this.c = surfaceView;
    }

    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        if (this.e != 0) {
            int i = this.a;
            int i2 = this.b;
            return (Bitmap) ((ngo) obj).b(i2, i).d(new ngg((ngk) this.d, (SurfaceView) this.c, i2, i, 1));
        }
        List<sux> list = (List) obj;
        if (list != null) {
            for (sux suxVar : list) {
                Object obj2 = this.d;
                int i3 = this.a;
                int i4 = this.b;
                Object obj3 = this.c;
                tpc tpcVar = (tpc) suxVar.a(5, null);
                tpcVar.r(suxVar);
                ((qbz) obj3).r(i4, tpcVar, i3, (svo) ((rwc) obj2).c());
            }
        }
        return null;
    }

    public /* synthetic */ qbw(qbz qbzVar, int i, int i2, rwc rwcVar, int i3) {
        this.e = i3;
        this.c = qbzVar;
        this.b = i;
        this.a = i2;
        this.d = rwcVar;
    }
}
