package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nfq {
    private static final sgv a = sgv.g("nfq");
    private final pas b;
    private final String c;
    private final hbj d;

    public nfq(WindowManager windowManager, hbj hbjVar, String str) {
        Point point = new Point(0, 0);
        windowManager.getDefaultDisplay().getSize(point);
        this.b = new pas(point.x, point.y);
        this.d = hbjVar;
        this.c = str;
    }

    final pas a(List list, double d) {
        list.getClass();
        a.I(!list.isEmpty());
        pas pasVar = this.b;
        int iMin = Math.min(pasVar.a, pasVar.b);
        double dAbs = Double.MAX_VALUE;
        int i = -1;
        double d2 = Double.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            pas pasVar2 = (pas) list.get(i3);
            double d3 = pasVar2.a;
            int i4 = pasVar2.b;
            if (Math.abs((d3 / i4) - d) <= 0.02d) {
                double dAbs2 = Math.abs(i4 - iMin);
                if (dAbs2 < d2 || (dAbs2 == d2 && i4 < iMin)) {
                    i2 = i3;
                    d2 = dAbs2;
                }
            }
        }
        if (i2 == -1) {
            ((sgt) a.c().M(5348)).v("No preview size match the aspect ratio. available sizes: %s", list);
            for (int i5 = 0; i5 < list.size(); i5++) {
                int i6 = ((pas) list.get(i5)).b - iMin;
                if (Math.abs(i6) < dAbs) {
                    dAbs = Math.abs(i6);
                    i = i5;
                }
            }
            i2 = i;
        }
        rnt.L(i2 >= 0);
        return (pas) list.get(i2);
    }

    public pas b(List list, pae paeVar, pka pkaVar, nkw nkwVar, pjr pjrVar) {
        MediaCodecInfo mediaCodecInfo;
        list.getClass();
        a.I(!list.isEmpty());
        if (nkwVar != nkw.VIDEO && nkwVar != nkw.VIDEO_INTENT) {
            String strF = pkaVar == pka.FRONT ? this.d.f(gzo.Y) : this.d.f(gzo.X);
            strF.getClass();
            list = qpt.bz(list, strF);
        }
        String strF2 = pkaVar.equals(pka.BACK) ? this.d.f(gzo.aQ) : this.d.f(gzo.aR);
        if (strF2 != null && !strF2.isEmpty()) {
            pas pasVarBL = ojl.bL(strF2);
            pasVarBL.getClass();
            if (paeVar.l(pae.i(pasVarBL))) {
                paeVar = pae.a;
            }
        }
        double dA = paeVar.a();
        ArrayList<pas> arrayList = new ArrayList();
        for (pas pasVar : list) {
            if (Math.abs(pasVar.a() - dA) < 0.025d) {
                arrayList.add(pasVar);
            }
        }
        double dA2 = paeVar.a();
        hbj hbjVar = this.d;
        boolean zP = hbjVar.p(gzs.aa);
        int i = 1440;
        int iMax = dA2 <= 1.0d ? 1440 : 1080;
        if (zP) {
            boolean zP2 = hbjVar.p(gzs.ab);
            int iIntValue = ((Integer) hbjVar.a(gzs.m).orElse(Integer.valueOf(iMax))).intValue();
            if (!zP2) {
                i = 0;
            } else if (dA2 > 1.0d) {
                i = 1080;
            }
            iMax = Math.max(iIntValue, i);
        }
        ArrayList<pas> arrayList2 = new ArrayList();
        for (pas pasVar2 : arrayList) {
            if (pasVar2.b <= iMax) {
                arrayList2.add(pasVar2);
            }
        }
        String str = this.c;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        int length = codecInfos.length;
        int i2 = 0;
        loop2: while (true) {
            if (i2 >= length) {
                mediaCodecInfo = null;
                break;
            }
            mediaCodecInfo = codecInfos[i2];
            for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                if (str2.equals(str) && mediaCodecInfo.isEncoder() && mediaCodecInfo.isHardwareAccelerated()) {
                    break loop2;
                }
            }
            i2++;
        }
        if (mediaCodecInfo == null) {
            ((sgt) a.c().M(5347)).v("No codec info found for codec '%s'! Will not filter preview sizes!", str);
        } else {
            ArrayList arrayList3 = new ArrayList();
            MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
            if (videoCapabilities != null) {
                for (pas pasVar3 : arrayList2) {
                    if (videoCapabilities.isSizeSupported(pasVar3.a, pasVar3.b)) {
                        arrayList3.add(pasVar3);
                    }
                }
            }
            arrayList2 = arrayList3;
        }
        return a(arrayList2, paeVar.a());
    }
}
