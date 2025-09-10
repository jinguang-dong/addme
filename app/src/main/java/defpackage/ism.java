package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ism implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public ism(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.c) {
            case 0:
                return new isl(((imn) this.a).a(), iso.b(), ((Integer) ((hbj) this.b.a()).a(gzo.j).get()).intValue());
            case 1:
                isc iscVar = (isc) this.b.a();
                return new iru(iscVar);
            case 2:
                hbj hbjVar = (hbj) this.a.a();
                Object fhmVar = (hbjVar.p(gzo.aq) && hbjVar.p(gzo.ar)) ? (mcw) tzs.b(this.b).a() : new fhm(4);
                fhmVar.getClass();
                return fhmVar;
            case 3:
                return new iso((hbj) this.a.a(), ((inj) this.b).a());
            case 4:
                return new mwq(((imm) this.b).b(), (iso) this.a.a(), (byte[]) null);
            case 5:
                return new kue(((imw) this.b).a(), (iua) this.a.a(), 1);
            case 6:
                our ourVar = (our) this.a.a();
                qwz qwzVar = (qwz) this.b.a();
                ourVar.getClass();
                qwzVar.getClass();
                return new frf(new img(ourVar, qwzVar, 6, null), "SessionLapReporter", 0);
            case 7:
                our ourVar2 = (our) this.a.a();
                ourVar2.getClass();
                tzx tzxVar = this.b;
                tzxVar.getClass();
                return new frf(new img(ourVar2, tzxVar, 5), "laplog", 0);
            case 8:
                return new iuo(this.b, (ScheduledExecutorService) this.a.a());
            case 9:
                return new qwz(((iun) this.b).a(), ((frl) this.a).b());
            case 10:
                return ((hbj) this.a.a()).p(hab.g) ? ((jaf) this.b).b() : rvk.a;
            case 11:
                return ((hbj) this.a.a()).p(hab.d) ? ((jaf) this.b).b() : rvk.a;
            case 12:
                Optional optionalEmpty = ((ixm) this.a.a()).c() ? (Optional) this.b.a() : Optional.empty();
                optionalEmpty.getClass();
                return optionalEmpty;
            case 13:
                return new gmh((mns) this.b.a(), (kgt) this.a.a(), 2);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new ftb((mns) this.b.a(), (kgt) this.a.a(), 2);
            case 15:
                Object obj = ((hbj) this.a.a()).o(gzo.bG) ? hgd.a : (mcw) this.b.a();
                obj.getClass();
                return obj;
            case 16:
                hbj hbjVar2 = (hbj) this.a.a();
                pbn pbnVar = (pbn) this.b.a();
                pbnVar.f("OneFeatureConfig#provide");
                kfi kfiVar = new kfi(((Integer) hbjVar2.a(hae.d).get()).intValue(), ((Integer) hbjVar2.a(hae.b).get()).intValue());
                pbnVar.g();
                return kfiVar;
            case 17:
                return new pbs(new szg((Executor) this.a.a()), (pbn) this.b.a(), "OneCameraCreator");
            case 18:
                return new jod(((izl) this.b).a(), (owq) this.a.a());
            case 19:
                return new jhn(((jhp) this.b).a(), (owf) this.a.a());
            default:
                tzx tzxVar2 = this.b;
                pjo pjoVarA = ((kiv) this.a).a();
                return ((Boolean) tzxVar2.a()).booleanValue() ? (Rect) pjoVarA.o(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE_MAXIMUM_RESOLUTION) : pjoVarA.i();
        }
    }

    public ism(tzx tzxVar, tzx tzxVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }
}
