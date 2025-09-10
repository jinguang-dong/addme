package defpackage;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.AwbInfo;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ShotMetadata;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class isw implements iaf {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public isw(hxs hxsVar, ici iciVar, hxu hxuVar, int i) {
        this.d = i;
        this.b = iciVar;
        this.c = hxuVar;
        this.a = hxsVar;
    }

    private final void b(HardwareBuffer hardwareBuffer, hht hhtVar) {
        hardwareBuffer.close();
        isx isxVar = (isx) this.a;
        isxVar.e.a(hhtVar);
        ((isy) this.c).b(isxVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pbp] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, jid] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.iaf
    public final void a(iby ibyVar, HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        if (this.d != 0) {
            hxs hxsVar = (hxs) this.a;
            pbn pbnVar = hxsVar.b;
            pbnVar.f("RgbHardwareCallback");
            ici iciVar = (ici) this.b;
            iciVar.c = hardwareBuffer;
            iciVar.f(shotMetadata);
            iciVar.d = ibyVar.t;
            hxsVar.a((hxu) this.c, iciVar.a());
            pbnVar.g();
            return;
        }
        ?? r0 = this.b;
        shl shlVar = shx.a;
        r0.a();
        Object obj = this.a;
        isx isxVar = (isx) obj;
        List list = isxVar.j;
        int size = list.size();
        int i = isxVar.l;
        if (size > i) {
            ((paq) list.get(i)).close();
        } else {
            ((sgt) ((sgt) isy.a.b().h(shx.a, "KeplerController")).M(2281)).t("Image token for %dth callback not found.", isxVar.l);
        }
        isxVar.i.open();
        Object obj2 = this.c;
        synchronized (obj2) {
            Map map = ((isy) obj2).g;
            iby ibyVar2 = ((isx) obj).a;
            if (!map.containsKey(ibyVar2)) {
                hardwareBuffer.close();
                ibyVar2.a();
                return;
            }
            try {
                Object obj3 = this.a;
                if (((isx) obj3).l == 0) {
                    Object obj4 = this.c;
                    pas pasVar = new pas(hardwareBuffer.getWidth(), hardwareBuffer.getHeight());
                    int iE = ((isx) obj3).a.x.b.e();
                    hbp hbpVar = ((isy) obj4).i;
                    FileOutputStream fileOutputStreamE = ((isx) obj3).d.e();
                    pao paoVarB = pao.b(iE);
                    gzi gziVar = hac.a;
                    Object obj5 = hbpVar.c;
                    ?? r8 = hbpVar.b;
                    ?? r9 = hbpVar.a;
                    rvk rvkVar = rvk.a;
                    ((isx) obj3).n = new ite((iso) obj5, r8, r9, fileOutputStreamE, pasVar, paoVarB, false, 10, rvkVar, rvkVar, rvkVar);
                    AwbInfo awbInfoI = shotMetadata.d().i();
                    ((isx) obj3).g.e(new AwbInfo(GcamModuleJNI.new_AwbInfo__SWIG_1(AwbInfo.a(awbInfoI), awbInfoI), true));
                    AeResults aeResultsC = shotMetadata.c();
                    ((isx) obj3).h.e(new hzr(aeResultsC.a(tbi.a), aeResultsC.a(tbi.b)));
                }
                isx isxVar2 = (isx) this.a;
                ite iteVar = isxVar2.n;
                if (iteVar == null) {
                    b(hardwareBuffer, new hht("Encoder not available."));
                    return;
                }
                iteVar.b(hardwareBuffer, TimeUnit.NANOSECONDS.convert(isxVar2.m, TimeUnit.MILLISECONDS));
                int i2 = isxVar2.l + 1;
                isxVar2.l = i2;
                long j = isxVar2.m;
                isy isyVar = (isy) this.c;
                isxVar2.m = j + isyVar.b;
                if (i2 == isxVar2.c) {
                    ske.W(iteVar.a(), new isv(this, isxVar2), isyVar.d);
                }
            } catch (IOException e) {
                ((sgt) ((sgt) ((sgt) isy.a.b().h(shx.a, "KeplerController")).i(e)).M(2279)).s("Encoder creation failed");
                b(hardwareBuffer, new hht("Failed to create encoder.", e));
            }
        }
    }

    public isw(isy isyVar, isx isxVar, pbp pbpVar, int i) {
        this.d = i;
        this.a = isxVar;
        this.b = pbpVar;
        this.c = isyVar;
    }
}
