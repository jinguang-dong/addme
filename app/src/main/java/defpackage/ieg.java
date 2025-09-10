package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import j$.util.Optional;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ieg implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public ieg(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        CaptureRequest.Key key;
        int[] iArr;
        owf owiVar;
        CaptureRequest.Key key2;
        int i = 0;
        switch (this.c) {
            case 0:
                return ((hbj) this.a.a()).p(gzc.j) ? rwc.j((idy) this.b.a()) : rvk.a;
            case 1:
                hbj hbjVar = (hbj) this.a.a();
                return (icy.a(hbjVar) && ins.v() && hbjVar.p(gzs.y)) ? rwc.j((icu) tzs.b(this.b).a()) : rvk.a;
            case 2:
                return new pbs(new szg(((fth) this.b).b()), (pbn) this.a.a(), "FalconProcess");
            case 3:
                return ((idt) this.a.a()).b() ? new frf((Runnable) this.b.a(), "debfus", 0) : frh.a;
            case 4:
                ojl ojlVar = ((idt) this.b.a()).b() ? (ojl) this.a.a() : pdr.a;
                ojlVar.getClass();
                return ojlVar;
            case 5:
                return ((hbj) this.a.a()).p(gzc.k) ? Optional.of(((ifk) this.b).a()) : Optional.empty();
            case 6:
                iey ieyVar = ((idt) this.a.a()).b() ? (iey) this.b.a() : new iey() { // from class: igi
                    @Override // defpackage.iey
                    public final rwc a(pdk pdkVar) {
                        return rvk.a;
                    }
                };
                ieyVar.getClass();
                return ieyVar;
            case 7:
                Object iglVar = ((idt) this.b.a()).a() ? (iec) this.a.a() : new igl(1);
                iglVar.getClass();
                return iglVar;
            case 8:
                return ((idt) this.b.a()).a() ? rwc.j((ids) this.a.a()) : rvk.a;
            case 9:
                owf owfVarH = owl.h(owl.a((owf) this.b.a(), ((ihb) this.a).b()), new hia(5));
                owfVarH.getClass();
                return owfVarH;
            case 10:
                return new pbs(new szg((Executor) this.b.a()), (pbn) this.a.a(), "FusionZoomProcess");
            case 11:
                return ((hbj) this.a.a()).p(gzc.C) ? rwc.j((idy) this.b.a()) : rvk.a;
            case 12:
                return ((Boolean) ((owq) this.a.a()).dL()).booleanValue() ? rwc.j(((kjr) this.b).a()) : rvk.a;
            case 13:
                owf owiVar2 = (!((hbj) this.b.a()).p(gzs.aa) || (key = nvk.j) == null) ? new owi(qpt.cl()) : qpt.cm(key, (owf) this.a.a());
                owiVar2.getClass();
                return owiVar2;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                pjo pjoVarA = ((kiv) this.b).a();
                CameraCharacteristics.Key key3 = nvk.d;
                Integer num = null;
                if (key3 != null) {
                    try {
                        iArr = (int[]) pjoVarA.m(key3);
                    } catch (IllegalArgumentException e) {
                        e.getMessage();
                        iArr = null;
                    }
                    if (iArr != null) {
                        while (true) {
                            if (i < iArr.length) {
                                if (iArr[i] == 1) {
                                    num = 1;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                }
                owf owfVarCm = num != null ? qpt.cm(nvk.e, (owf) this.a.a()) : new owi(qpt.cl());
                owfVarCm.getClass();
                return owfVarCm;
            case 15:
                hbj hbjVar2 = (hbj) this.b.a();
                CaptureRequest.Key key4 = nvm.i;
                if (key4 != null) {
                    owiVar = qpt.cm(key4, owl.h((owf) this.a.a(), new ihj(true != hbjVar2.p(gzs.U) ? 1.0f : 1.5f, 0)));
                } else {
                    owiVar = new owi(qpt.cl());
                }
                owiVar.getClass();
                return owiVar;
            case 16:
                hxy hxyVar = (hxy) this.b.a();
                iao iaoVar = (iao) this.a.a();
                scl sclVar = new scl();
                if (hxyVar.e(iaoVar) && (key2 = nvj.s) != null) {
                    sclVar.d(new pej(key2, true));
                }
                scn scnVarG = sclVar.g();
                scnVarG.getClass();
                return scnVarG;
            case 17:
                tzx tzxVar = this.a;
                rwc rwcVarB = ((jaf) this.b).b();
                gzg gzgVar = gzu.a;
                return (iko) ((rwg) rwcVarB).a;
            case 18:
                int i2 = gzv.a;
                return rvk.a;
            case 19:
                return ((hbj) this.a.a()).p(gza.t) ? rwc.j((iqj) this.b.a()) : rvk.a;
            default:
                owf owfVarA = owb.a(owl.c((owf) this.a.a(), owl.h((owf) this.b.a(), new hia(9))));
                owfVarA.getClass();
                return owfVarA;
        }
    }

    public ieg(tzx tzxVar, tzx tzxVar2, int i, char[] cArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }
}
