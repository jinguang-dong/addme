package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraManager;
import android.os.Trace;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uw implements tzx {
    private final int a;
    private final kyz b;

    public uw(kyz kyzVar, int i) {
        this.b = kyzVar;
        this.a = i;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.uem, defpackage.uel
    public final Object a() {
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                return new byz((char[]) null, (char[]) null);
            case 1:
                return new ocq((cey) this.b.s.a());
            case 2:
                kyz kyzVar = this.b;
                qrh qrhVar = (qrh) kyzVar.h.a();
                byz byzVar = (byz) kyzVar.i.a();
                qrhVar.getClass();
                byzVar.getClass();
                uem uemVar = kyzVar.k;
                try {
                    Trace.beginSection("Initialize defaultCameraBackend");
                    qrh qrhVar2 = (qrh) uemVar.a();
                    Object obj = kyzVar.u;
                    Trace.endSection();
                    pc pcVar = new pc();
                    ?? r0 = ((pr) ((ocq) obj).a).e.a;
                    if (r0.containsKey(pcVar)) {
                        throw new IllegalStateException(OPuAVreQM.eCBYxRKIhTG);
                    }
                    Map mapBe = ske.be(r0, new uev(new pc(), new rnu(qrhVar2, bArr)));
                    if (mapBe.containsKey(new pc())) {
                        return new cey(mapBe, byzVar);
                    }
                    throw new IllegalStateException("Failed to find CameraBackendId(value=CXCP-Camera2) in the list of available CameraPipe backends! Available values are " + mapBe.keySet());
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 3:
                kyz kyzVar2 = this.b;
                return new qrh((qrh) kyzVar2.h.a(), (sv) kyzVar2.e.a(), (ut) kyzVar2.j.a(), (uh) kyzVar2.c.a(), new det(kyzVar2));
            case 4:
                kyz kyzVar3 = this.b;
                byz byzVar2 = (byz) kyzVar3.i.a();
                byzVar2.getClass();
                ArrayList arrayList = new ArrayList();
                Object obj2 = kyzVar3.v;
                qqv qqvVar = (qqv) obj2;
                ps psVar = (ps) qqvVar.b;
                Executor executorA = psVar.c;
                int i = 8;
                int i2 = -1;
                if (executorA == null) {
                    int[] iArr = uy.a;
                    executorA = uy.a(new ux(i2, uy.b(uy.b, "CXCP-IO-")), 8);
                    arrayList.add(executorA);
                }
                Executor executorA2 = psVar.b;
                una unaVarAa = ujp.aa(executorA);
                if (executorA2 == null) {
                    int[] iArr2 = uy.a;
                    executorA2 = uy.a(new ux(i2, uy.b(uy.b, "CXCP-BG-")), 4);
                    arrayList.add(executorA2);
                }
                Executor executorA3 = psVar.a;
                una unaVarAa2 = ujp.aa(executorA2);
                if (executorA3 == null) {
                    int[] iArr3 = uy.a;
                    executorA3 = uy.a(new ux(-3, uy.b(uy.b, "CXCP-")), qqvVar.a);
                    arrayList.add(executorA3);
                }
                Executor executor = executorA3;
                una unaVarAa3 = ujp.aa(executor);
                byzVar2.r(3, new ea(arrayList, 7, bArr));
                ne neVar = new ne(byzVar2, 12);
                sn snVar = new sn(obj2, byzVar2, 2, bArr);
                und undVarJ = ung.j(ske.aI(new upi(), unaVarAa3).plus(new unc("CXCP")));
                byzVar2.r(2, new ea(undVarJ, i, bArr));
                return new qrh(undVarJ, unaVarAa, unaVarAa2, executor, unaVarAa3, neVar, snVar);
            case 5:
                kyz kyzVar4 = this.b;
                return new sv(kyzVar4.m, (qrh) kyzVar4.h.a(), (PackageManager) kyzVar4.b.a());
            case 6:
                Object systemService = this.b.a().getSystemService("camera");
                systemService.getClass();
                return (CameraManager) systemService;
            case 7:
                PackageManager packageManager = this.b.a().getPackageManager();
                packageManager.getClass();
                return packageManager;
            case 8:
                kyz kyzVar5 = this.b;
                return new ut(kyzVar5.a(), (qrh) kyzVar5.h.a(), (vb) kyzVar5.l.a(), ((pr) ((ocq) kyzVar5.u).a).d, (byi) kyzVar5.d.a());
            case 9:
                return new vb(this.b.a());
            case 10:
                return new byi();
            case 11:
                kyz kyzVar6 = this.b;
                return new uh((vb) kyzVar6.l.a(), (un) kyzVar6.f.a(), (byz) kyzVar6.a.a(), (byz) kyzVar6.o.a(), (qrh) kyzVar6.h.a());
            case 12:
                kyz kyzVar7 = this.b;
                uem uemVar2 = kyzVar7.h;
                qrh qrhVar3 = (qrh) uemVar2.a();
                uem uemVar3 = kyzVar7.m;
                byz byzVar3 = new byz(uemVar3, qrhVar3);
                ut utVar = (ut) kyzVar7.j.a();
                uem uemVar4 = kyzVar7.o;
                byz byzVar4 = (byz) uemVar4.a();
                sx sxVar = (sx) kyzVar7.n.a();
                uem uemVar5 = kyzVar7.d;
                return new un(new qqq(byzVar3, utVar, byzVar4, sxVar, (byi) uemVar5.a(), (qrh) uemVar2.a()), (byz) uemVar4.a(), new byz(uemVar3, (qrh) uemVar2.a(), (byte[]) null), (byi) uemVar5.a(), (ocq) kyzVar7.g.a(), (rnn) kyzVar7.t.a(), (qrh) uemVar2.a());
            case 13:
                return new byz((byte[]) null, (byte[]) null, (char[]) null);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new sx((ut) this.b.j.a());
            case 15:
                Object systemService2 = this.b.a().getSystemService("device_policy");
                systemService2.getClass();
                return new ocq((DevicePolicyManager) systemService2, (byte[]) null);
            case 16:
                return new rnn(null);
            case 17:
                kyz kyzVar8 = this.b;
                return new byz((qrh) kyzVar8.h.a(), (sx) kyzVar8.n.a(), (un) kyzVar8.f.a());
            case 18:
                return new py();
            default:
                kyz kyzVar9 = this.b;
                qrh qrhVar4 = (qrh) kyzVar9.h.a();
                cey ceyVar = (cey) kyzVar9.s.a();
                qrhVar4.getClass();
                ceyVar.getClass();
                return new byi();
        }
    }
}
