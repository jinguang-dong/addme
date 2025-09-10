package defpackage;

import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.imageproc.Resample;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class htr implements htp {
    private static final tgp a = new tgp();

    @Override // defpackage.htp
    public final YuvReadView a(poj pojVar, int i) {
        YuvReadView yuvReadViewS = rup.s(a.c(pojVar));
        tcd tcdVarO = ske.o(i);
        int[] iArrA = Resample.a(pojVar.c(), pojVar.b(), tcdVarO);
        YuvWriteView yuvWriteViewT = rup.t(new YuvImage(iArrA[0], iArrA[1], yuvReadViewS.c()));
        Resample.c(yuvReadViewS, tcdVarO, yuvWriteViewT);
        yuvWriteViewT.b();
        yuvWriteViewT.a();
        pojVar.c();
        pojVar.b();
        return rup.s(yuvWriteViewT);
    }
}
