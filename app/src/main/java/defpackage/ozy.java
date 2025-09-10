package defpackage;

import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ozy implements pjp {
    public final ocq a;
    private final pju b;
    private final pnq c;
    private final pbc d;
    private final pbn e;

    public ozy(ocq ocqVar, pju pjuVar, pnp pnpVar, pnq pnqVar, pbc pbcVar, pbn pbnVar) {
        pnpVar.getClass();
        pnqVar.getClass();
        pbnVar.getClass();
        this.a = ocqVar;
        this.b = pjuVar;
        this.c = pnqVar;
        this.d = pbcVar;
        this.e = pbnVar;
    }

    @Override // defpackage.pjp
    public final pjo a(pjr pjrVar) {
        pjrVar.getClass();
        sm smVarAL = this.a.aL(ojl.bP(pjrVar));
        Set setJ = smVarAL.j();
        HashSet hashSet = new HashSet();
        Iterator it = setJ.iterator();
        while (it.hasNext()) {
            hashSet.add(pjr.b(((pp) it.next()).a));
        }
        return new pjn(pjrVar, new ozz(smVarAL), hashSet, this.c, this.e, this.d);
    }

    @Override // defpackage.pjp
    public final pjr b() {
        return (pjr) ske.bD(f());
    }

    @Override // defpackage.pjp
    public final pjr c(int i) {
        return d(String.valueOf(i));
    }

    @Override // defpackage.pjp
    public final pjr d(String str) {
        str.getClass();
        Object obj = null;
        Iterator itA = new ull(new ozx(this, null)).a();
        while (true) {
            if (!itA.hasNext()) {
                break;
            }
            Object next = itA.next();
            if (a.ao(((pjr) next).a, str)) {
                obj = next;
                break;
            }
        }
        return (pjr) obj;
    }

    @Override // defpackage.pjp
    public final pjr e(pka pkaVar) {
        Object next;
        pkaVar.getClass();
        Iterator it = f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (paa.a(this.a.aL(ojl.bP((pjr) next))) == pkaVar) {
                break;
            }
        }
        return (pjr) next;
    }

    public final List f() {
        List listA = this.b.a();
        listA.getClass();
        return listA;
    }

    @Override // defpackage.pjp
    public final List g() {
        return f();
    }

    @Override // defpackage.pjp
    public final List h(pka pkaVar) {
        pkaVar.getClass();
        List listF = f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (paa.a(this.a.aL(ojl.bP((pjr) obj))) == pkaVar) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.pjp
    public final boolean i() {
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            try {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (!cameraInfo.canDisableShutterSound) {
                    return false;
                }
            } catch (RuntimeException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.pjp
    public final boolean j(pka pkaVar) {
        Object next;
        pkaVar.getClass();
        Iterator it = f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (paa.a(this.a.aL(ojl.bP((pjr) next))) == pkaVar) {
                break;
            }
        }
        return next != null;
    }

    @Override // defpackage.pjp
    public final boolean k() {
        Object next;
        Iterator it = f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ocq ocqVar = this.a;
            String str = ((pjr) next).a;
            str.getClass();
            pp.b(str);
            sm smVarAL = ocqVar.aL(str);
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
            key.getClass();
            int[] iArr = (int[]) smVarAL.a(key);
            if (iArr == null) {
                iArr = paa.a;
            }
            if (rnt.as(iArr, 9)) {
                break;
            }
        }
        return next != null;
    }
}
