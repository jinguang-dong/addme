package defpackage;

import android.opengl.GLSurfaceView;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hsp extends ojl {
    final /* synthetic */ pdk a;
    final /* synthetic */ htw b;
    final /* synthetic */ htv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsp(pdk pdkVar, htw htwVar, htv htvVar) {
        super((short[]) null);
        this.a = pdkVar;
        this.b = htwVar;
        this.c = htvVar;
    }

    @Override // defpackage.ojl
    public final void dI() {
        this.a.close();
    }

    @Override // defpackage.ojl
    public final void dY() {
        try {
            pdk pdkVar = this.a;
            poj pojVarE = pdkVar.e(this.b.b());
            if (pojVarE == null) {
                pdkVar.close();
                return;
            }
            huc hucVar = this.c.m;
            if (hucVar != null) {
                GLSurfaceView gLSurfaceView = hucVar.q;
                GLSurfaceView gLSurfaceView2 = null;
                if (gLSurfaceView == null) {
                    ujp.c("ghostViewfinder");
                    gLSurfaceView = null;
                }
                int height = gLSurfaceView.getHeight();
                GLSurfaceView gLSurfaceView3 = hucVar.q;
                if (gLSurfaceView3 == null) {
                    ujp.c("ghostViewfinder");
                } else {
                    gLSurfaceView2 = gLSurfaceView3;
                }
                hur hurVar = hucVar.d;
                hurVar.a = gLSurfaceView2.getWidth();
                hurVar.b = height;
                if (hurVar.n) {
                    List listG = pojVarE.g();
                    if (listG.size() >= 3) {
                        synchronized (hurVar) {
                            poi poiVar = (poi) listG.get(0);
                            poi poiVar2 = (poi) listG.get(1);
                            poi poiVar3 = (poi) listG.get(2);
                            ByteBuffer buffer = poiVar.getBuffer();
                            ByteBuffer buffer2 = poiVar2.getBuffer();
                            ByteBuffer buffer3 = poiVar3.getBuffer();
                            hurVar.f = buffer;
                            hurVar.g = buffer2;
                            hurVar.h = buffer3;
                            hurVar.c = pojVarE.c();
                            hurVar.d = pojVarE.b();
                            hurVar.i = poiVar.getRowStride() / poiVar.getPixelStride();
                            hurVar.j = poiVar2.getRowStride() / poiVar2.getPixelStride();
                            hurVar.k = poiVar3.getRowStride() / poiVar3.getPixelStride();
                            poj pojVar = hurVar.e;
                            if (pojVar != null) {
                                pojVar.close();
                            }
                            hurVar.e = pojVarE;
                        }
                    }
                } else {
                    pojVarE.close();
                }
            }
        } finally {
            this.a.close();
        }
    }
}
