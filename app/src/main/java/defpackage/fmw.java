package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.opengl.GLSurfaceView;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fmw implements tzt {
    private final /* synthetic */ int a;
    private final Object b;

    public fmw(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r4v46, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r4v56, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r4v59, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r4v62, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v80, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r4v83, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r4v87, types: [java.lang.Object, tzx] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                Object sfmVar = !((hbj) this.b.a()).o(gyi.i) ? new sfm(qpt.ci(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0)) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 1:
                return new sfm((hzi) this.b.a());
            case 2:
                pjo pjoVarA = ((kiv) this.b).a();
                pep pepVarA = peq.a();
                pepVarA.b(pjoVarA.j());
                pepVarA.c(10);
                pepVarA.f(false);
                pepVarA.i(35);
                pepVarA.n(fmv.a);
                pepVarA.r(pet.IMAGE_READER);
                return pepVarA.a();
            case 3:
                pjo pjoVar = (pjo) this.b.a();
                pjoVar.getClass();
                Set setB = pjoVar.B();
                setB.getClass();
                if (!setB.isEmpty()) {
                    Iterator it = setB.iterator();
                    while (it.hasNext()) {
                        String name = ((CaptureRequest.Key) it.next()).getName();
                        CaptureRequest.Key key = kgx.c;
                        if (a.ao(name, key.getName())) {
                            return qpt.ch(new pej(key, (byte) 1));
                        }
                    }
                }
                return qpt.cl();
            case 4:
                pjo pjoVar2 = (pjo) this.b.a();
                pjoVar2.getClass();
                Set setB2 = pjoVar2.B();
                setB2.getClass();
                if (!setB2.isEmpty()) {
                    Iterator it2 = setB2.iterator();
                    while (it2.hasNext()) {
                        String name2 = ((CaptureRequest.Key) it2.next()).getName();
                        CaptureRequest.Key key2 = kgx.d;
                        if (a.ao(name2, key2.getName())) {
                            return qpt.ch(new pej(key2, (byte) 1));
                        }
                    }
                }
                return qpt.cl();
            case 5:
                return ((gga) this.b).c;
            case 6:
                return ((ggc) this.b).b().d.c();
            case 7:
                hbj hbjVar = (hbj) this.b.a();
                hbjVar.getClass();
                return hbjVar;
            case 8:
                Optional optional = (Optional) this.b.a();
                optional.getClass();
                Optional map = optional.map(new fiy(new dvj(12), 17));
                map.getClass();
                return (Set) ukc.h(map, ufy.a);
            case 9:
                return rwc.j(((iie) this.b).a());
            case 10:
                return new iiu((GLSurfaceView) this.b.a());
            case 11:
                ilf ilfVar = (ilf) this.b.a();
                ile ileVar = new ile();
                ileVar.e = ilfVar;
                ileVar.f();
                return ileVar;
            case 12:
                ijb ijbVar = (ijb) this.b.a();
                ijbVar.getClass();
                return ijbVar;
            case 13:
                return new ijb(((imm) this.b).b());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((iit) this.b).a();
            case 15:
                return ((jod) this.b).b;
            case 16:
                return ((jod) this.b).a;
            case 17:
                Object obj = ((ejt) this.b).a;
                obj.getClass();
                return obj;
            case 18:
                return new jrt((hwt) this.b.a());
            case 19:
                return new frf(new jxr((owq) this.b.a(), 16), "nightlapse-hdrplus-availability\"", 0);
            default:
                return (kgw) ((gnt) this.b.a()).d().c();
        }
    }
}
