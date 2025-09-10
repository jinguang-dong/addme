package defpackage;

import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.media.ImageReader;
import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pih implements poq {
    private final por a;
    private final peq b;
    private final pij c;
    private final pbc d;
    private final Map e = new HashMap();
    private final qrh f;

    @Override // defpackage.poq
    public final synchronized void a(poo pooVar) {
        MultiResolutionStreamInfo streamInfoForImageReader;
        Map map = this.e;
        if (((pif) map.get(pooVar)) != null) {
            return;
        }
        por porVar = this.a;
        for (Map.Entry entry : ((pkn) porVar).f.entrySet()) {
            if (a.ao(entry.getValue(), pooVar)) {
                poo pooVar2 = (poo) entry.getKey();
                por porVar2 = ((pkn) porVar).a;
                pooVar2.getClass();
                HashMap map2 = ((pji) porVar2).c;
                if (!map2.containsKey(pooVar2)) {
                    for (Object obj : ((pji) porVar2).b.entrySet()) {
                        obj.getClass();
                        Map.Entry entry2 = (Map.Entry) obj;
                        ImageReader imageReader = (ImageReader) entry2.getKey();
                        if (a.ao((poo) entry2.getValue(), pooVar2)) {
                            streamInfoForImageReader = ((pji) porVar2).a.getStreamInfoForImageReader(imageReader);
                            streamInfoForImageReader.getClass();
                            map2.put(pooVar2, streamInfoForImageReader);
                        }
                    }
                    throw new IllegalArgumentException(a.bz(pooVar2, "ImageReader(", ") doesn't belong to this multi-resolution ImageReader"));
                }
                Object obj2 = map2.get(pooVar2);
                obj2.getClass();
                streamInfoForImageReader = (MultiResolutionStreamInfo) obj2;
                pjr pjrVarB = pjr.b(streamInfoForImageReader.getPhysicalCameraId());
                this.d.b("Multi-Resolution, received a new reader. " + pooVar.toString() + ", cameraId=" + pjrVarB.a);
                qrh qrhVar = this.f;
                peq peqVar = this.b;
                pif pifVarA = qrhVar.a(pjrVarB, pooVar, peqVar.q, peqVar.g, peqVar.p, peqVar.i, rvk.a);
                this.c.a(pifVarA);
                map.put(pooVar, pifVarA);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public pih(qrh qrhVar, pbc pbcVar, por porVar, peq peqVar, pij pijVar) {
        this.f = qrhVar;
        this.a = porVar;
        this.b = peqVar;
        this.c = pijVar;
        this.d = pbcVar.a(KsvNaXS.YXMsXdZa);
    }
}
