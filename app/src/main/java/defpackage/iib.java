package defpackage;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.InterleavedImageU8;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iib implements syf {
    final /* synthetic */ ico a;
    final /* synthetic */ long b;
    final /* synthetic */ iic c;
    final /* synthetic */ mpc d;
    final /* synthetic */ obu e;

    public iib(iic iicVar, mpc mpcVar, ico icoVar, long j, obu obuVar) {
        this.d = mpcVar;
        this.a = icoVar;
        this.b = j;
        this.e = obuVar;
        this.c = iicVar;
    }

    @Override // defpackage.syf
    public final void a(Throwable th) throws Exception {
        this.d.close();
        this.c.g(this.b, th);
    }

    @Override // defpackage.syf
    public final /* bridge */ /* synthetic */ void b(Object obj) throws Exception {
        kjd kjdVar = (kjd) obj;
        boolean z = kjdVar != null;
        iic iicVar = this.c;
        iicVar.d = z | iicVar.d;
        this.d.close();
        if (kjdVar == null) {
            ((sgt) iid.b.b().M(2032)).v("Error encoding the image: %s", this.a);
            iicVar.g(this.b, null);
            return;
        }
        if (this.a == ico.PRIMARY) {
            iicVar.a.o().d(kjdVar.b.length);
            obu obuVar = this.e;
            rwc rwcVar = (rwc) obuVar.b;
            if (rwcVar.h()) {
                ((InterleavedImageU8) rwcVar.c()).h();
            }
            rwc rwcVar2 = (rwc) obuVar.a;
            if (rwcVar2.h()) {
                ((HardwareBuffer) rwcVar2.c()).close();
            }
        }
        Map map = iicVar.b;
        long j = this.b;
        map.put(Long.valueOf(j), kjdVar.c);
        iicVar.g(j, null);
    }
}
